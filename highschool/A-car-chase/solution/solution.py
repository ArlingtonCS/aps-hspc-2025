def car_chase(x_agent, y_agent, x_you, y_you):
    print(x_agent - x_you + y_agent - y_you)

# Input reading
T = int(input())

for _ in range(T):
    x_agent, y_agent = map(int, input().strip().split(","))
    x_you, y_you = map(int, input().strip().split(","))
    car_chase(x_agent, y_agent, x_you, y_you)
