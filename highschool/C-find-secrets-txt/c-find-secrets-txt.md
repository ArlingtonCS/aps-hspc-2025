# C: Find Secrets.txt

Your organization, the Hacker Service Protection Coalition (HSPC), has recently hacked into a server from a rival foreign intelligence agency. You know that the server contains a critical file named `secrets.txt` with info on the agency's next big operation. Given a directory tree of all of the files on the enemy server, your task is to write a program that will find the path to the file `secrets.txt`.

## Input

The first line in the test data file contains the number of lines $n$ in the input. Each of the following $n$ lines will consist of either:

1. A string of length $l$ consisting of alphanumeric characters and ending with a `/` character, representing a directory in the server.
2. A string of length $l$ consisting of an alphanumeric file name, a `.` character, and an alphanumeric file extension, representing a file in the server.

Each line will be indented using a number of `-` (dash) characters $d$ to represent the depth of the file or directory in the server.

The input will follow $0 < n < 200,000$, $0 < l < 100$, and $0 < d < 100$. Within a directory, you may assume there will be no duplicate names for files or subdirectories. However, there may be multiple directories or files with the same name but in different parent directories.

## Output

Output the path to the file `secrets.txt` in the server. Start from the root directory `/`, followed a number of directories separated by a `/` character, and ending with the file name `secrets.txt`.

You may assume that there is only one file named `secrets.txt` in the server, and that it will always be found in the input.

## Sample Input

```
7
home/
- dir1/
-- file1.txt
-- document.pdf
- dir2/
-- secrets.txt
- file2.png
```

## Sample Output

```
/home/dir2/secrets.txt
```
