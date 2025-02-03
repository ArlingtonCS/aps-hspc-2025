# Robot Navigator

You have a robot on a grid that starts at position $(0,0)$. The robot follows a sequence of instructions to move around the grid. The grid has an infinite size in all directions. Your task is to determine the final position of the robot after it has executed all the instructions.

The possible instructions are:

 - `UP x` - Move x units up
 - `DOWN x` - Move x units down
 - `LEFT x` - Move x units left
 - `RIGHT x` - Move x units right

# Input

The first line contains the number of instructions. The next lines contain all of the instructions (one instruction per line). The instructions have the direction and the number of units that the robot will move in the specified direction.

# Output

The output contains one line with the final coordinates of the robot in the format: `x y`

# Sample Input
```
5
UP 3
RIGHT 4
DOWN 2
LEFT 1
UP 1
```
# Output
```
3 2
```
\newpage
