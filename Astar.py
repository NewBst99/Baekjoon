## A* Codes

import queue

# 상태를 나타내는 클래스, f(n) 값 저장
class State:
  def __init__(self, board, goal, depth = 0):
    self.board = board
    self.depth = depth
    self.goal = goal

  # i1과 i2를 교환, 새로운 상태 반환
  def get_new_board(self, i1, i2, depth):
    new_board = self.board[:]
    new_board[i1], new_board[i2] = new_board[i2], new_board[i1]
    return State(new_board, self.goal, depth)

  # 자식 노드 확장하여 리스트에 저장 및 반환
  def expand(self, moves):
    result = []
    i = self.board.index(0)
    if not i in [0, 3, 6]:  # LEFT
        result.append(self.get_new_board(i, i - 1, moves))
    if not i in [0, 1, 2]:  # UP
        result.append(self.get_new_board(i, i - 3, moves))
    if not i in [2, 5, 8]:  # RIGHT
        result.append(self.get_new_board(i, i + 1, moves))
    if not i in [6, 7, 8]:  # DOWN
        result.append(self.get_new_board(i, i + 3, moves))
    return result

  # f(n)을 계산하여 반환
  def f(self):
    return self.h() + self.g()

  # 휴리스틱 함수 값 h(n) 계산 및 반환
  # 현재 제 위치에 있지 않은 타일 개수 계산 및 반환
  def h(self):
    score = 0
    for i in range(9):
      if self.board[i] != 0 and self.board[i] != self.goal[i]:
        score += 1
    return score

  # 시작 노드로부터의 깊이 반환
  def g(self):
    return self.depth

  def __eq__(self, other):
    return self.board == other.board

  def __ne__(self, other):
    return self.board != other.board

  # 상태를 비교하기 위해 less than 연산자 정의
  def __lt__(self, other):
    return self.f() < other.f()

  def __gt__(self, other):
    return self.f() > other.f()

  # 객체 출력시 사용
  def __str__(self):
    return f"f(n) = {self.f()} h(n) = {self.h()} g(n) = {self.g()}\n" + \
    str(self.board[:3]) + "\n" + \
    str(self.board[3:6]) + "\n" + \
    str(self.board[6:]) + "\n"

# 초기 상태
puzzle = [2, 8, 3,
          1, 6, 4,
          7, 0, 5]

# 목표 상태
goal = [1, 2, 3,
        8, 0, 4,
        7, 6, 5]

# open 리스트는 우선순위 큐로 생성
open_queue = queue.PriorityQueue()
open_queue.put(State(puzzle, goal))

closed_queue = [ ]
depth = 0
count = 0

while not open_queue.empty():
  current = open_queue.get()
  count += 1
  print(count)
  print(current)
  if current.board == goal:
    print("탐색 성공")
    break
  depth = current.depth + 1
  for state in current.expand(depth):
    if state not in closed_queue and state not in open_queue.queue:
      open_queue.put(state)
  closed_queue.append(current)
else:
  print("탐색 실패")
