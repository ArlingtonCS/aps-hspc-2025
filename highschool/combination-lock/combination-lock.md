# C: Combination Lock

You are trying to access a secret room in a high-security building, but the room's door is locked with a number of combination locks. Each lock has a number of wheels $n$, where each wheel has a highest digit $d$. The correct combination for each lock is a sequence of $n$ digits consisting of the numbers 0 up to and including $d$. Write a program that outputs all possible combinations for each given lock, in numerically increasing order of the combinations.

## Input

The first line in the test data file contains the number of test cases. Each test case consists of an integer $n$, the number of wheels ($1 \leq n \leq 5$), and the integer $d$, the highest digit on the wheel ($0 \leq d \leq 9$), separated by a space.

## Output

For each test case, output all possible combinations for the lock in numerically increasing order. Each combination should be on a separate line.

## Sample Input

```
2
1 6
2 1
```

## Sample Output

```
0
1
2
3
4
5
6
00
01
10
11
```
