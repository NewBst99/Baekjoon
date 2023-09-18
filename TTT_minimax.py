# 게임보드 1차원 리스트로 구현
game_board = [" ", " ", " ",
              " ", " ", " ",
              " ", " ", " "]

# 비어 있는 칸을 찾아서 리스트로 변환
def empty_cells(board):
  cells = []
  for x, cell in enumerate(board):
    if cell == " ":
      cells.append(x) # 비어있는 칸을 찾으면 cell에 append
  return cells

# 비어 있는 칸에 놓을 수 있음
def valid_move(x):
  return x in empty_cells(game_board) # empty_cells 메서드를 통해 x가 유효한 위치인지

# 위치 x에 놓는다
def move(x, player):
  if valid_move(x):
    game_board[x] = player  # valid_move를 통해 유효하면 player를 위치시킴
    return True
  return False # 유효하지 않을 경우

# 게임 보드의 현재 상태
def draw(board):
  for i, cell in enumerate(board):  # 값과 인덱스 할당 후 셀에 대한 원소와 위치
    if i % 3 == 0:  # 3x3 형태의 틱택토 모양으로 출력하기 위함
      print("\n-----------------")
    print("|", cell, "|", end = "") # 각 셀 출력
  print("\n-----------------")

# 보드의 상태를 평가
def evaluate(board):
  if check_win(board, "X"): # check_win의 player X가 승리했는지
    score = 1
  elif check_win(board, "O"): # check_win의 player O가 승리했는지
    score = -1
  else: # 비긴 경우
    score = 0
  return score

# 리스트에서 동일한 문자 3개가 수직, 수평, 대각선 상에 나타나면 승리
def check_win(board, player):
  win_conf = [
      [board[0], board[1], board[2]], # 수직, 수평, 대각선 상에 위치하는 경우의 수
      [board[3], board[4], board[5]],
      [board[6], board[7], board[8]],
      [board[0], board[3], board[6]],
      [board[1], board[4], board[7]],
      [board[2], board[5], board[8]],
      [board[0], board[4], board[8]],
      [board[2], board[4], board[6]],
  ]
  return [player, player, player] in win_conf

# check_win 메서드의 return값을 통해 승리 여부 판단
def game_over(board):
  return check_win(board, "X") or check_win(board, "O") # player 별로 승리했는지 확인하여 return

# 미니맥스 알고리즘 구현
# 이 메서드는 순환전으로 호출됨
def minimax(board, depth, maxPlayer):
  pos = -1  # 놓는 위치 기억하는 변수

  # 단일 노드이면 보드 평가, 위치 평가값 반환
  if depth == 0 or len(empty_cells(board)) == 0 or game_over(board): # 최대 깊이 도달, 보드에 빈 칸이 존재하지 않음, 종료 여부
    return -1, evaluate(board)

  if maxPlayer:
    value = -10000  # 강의에서 말한 음의 무한대 의미

    # 자식 노드 하나씩 평가, 최선의 수 파악
    for p in empty_cells(board):  # 빈 칸에 배치 시도
      board[p] = "X"  # 보드 p의 위치에 X 배치
      x, score = minimax(board, depth - 1, False) # 시도 후 파악
      board[p] = " "  # 보드를 원상태로 복구
      if score > value: # 최적의 수인지 판단
        value = score # 최대값 취함
        pos = p # 최대값의 위치 기억
  else:
    value = +10000  # 강의에서 말한 양의 무한대 의미

    # 자식 노드 하나씩 평가, 최선의 수 파악
    for p in empty_cells(board):
        board[p] = 'O'  # 보드 p의 위치에 O 배치
        x, score = minimax(board, depth-1, True)
        board[p] =  ' ' # 보드를 원상태로 복구
        if score < value:
            value = score # 최소값 취함
            pos = p # 최소값의 위치 기억

  return pos, value # 위치와 값 반환

player = "X"  # X가 먼저 시작

# 메인 프로그램
while True: # 무한 루프
  draw(game_board)  # 보드 그림
  if len(empty_cells(game_board)) == 0 or game_over(game_board):  # 셀이 꽉 차거나 승부가 난 경우
    break # 무한 루프 종료
  i, v = minimax(game_board, 9, player == "X") # 위치 i와 값 v 반환
  move(i, player)  # 현재 player의 수를 둠
  if player == "X": # player 교체
    player = "O"
  else:
    player = "X"

if check_win(game_board, "X"):  # X 승리
  print("X 승리!")
elif check_win(game_board, "O"):  # O 승리
  print("O 승리!")
else: # 무승부
  print("비겼습니다.")