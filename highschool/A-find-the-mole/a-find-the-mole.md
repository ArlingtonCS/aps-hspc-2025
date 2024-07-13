# A: Find the Mole

You are part of an elite spy organization, the Hidden Spy Protection Coalition (HSPC). Unfortunately, your organization has faced issues with specific employees not completing enough missions. We suspect that these employees may be moles working for the enemy. To determine if this is the case, we need to analyze the efficiency of each spy given the number of missions they complete on average each day.

You are tasked with writing a program that will determine the name of the agent who, on average, completed less than 4 missions per day. In order to find this average, find the mean of the number of missions completed daily. You will be given a list of agents and the number of missions they completed daily for the past few months. The agent who completed less than 4 missions per day is the mole — output this agent's codename and we will fire them!

## Input

The first line in the test data file contains the number of test cases. Each test case starts with a line denoting the number of data points $n$ $(1 \leq n \leq 1000)$. The following $n$ lines consist of an agent's codename, followed by a comma, followed by the number of missions completed on a day. The codename will be a string of length $l$ $(1 \leq l \leq 100)$, consisting of alphanumeric characters (a-z, A-Z, and 0-9). The number of missions completed will be an integer $m$ $(1 \leq m \leq 1000)$. **No spaces or whitespace will be present anywhere in the input.**

## Output

For each test case, output the name of the agent who, on average, completed less than 4 missions per day on a separate line. It is guaranteed that only one agent will complete less than 4 missions per day.

## Sample Input

```
1
6
Phantom,5
Shadow,10
Goof,3
Shadow,12
Phantom,15
Goof,2
```

## Sample Output

```
Goof
```
