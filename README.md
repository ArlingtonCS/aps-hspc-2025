# Arlington HSPC

This repository contains the problems, their samples, solutions, testcases, and
testcase generators. The `highschool`, `middleschool`, `practice`, and `sample`
directories contain their respective problem sets. Each directory contains each
problem in it's own subdirectory with the following format:

```
A-car-chase
├── car-chase.md
├── car-chase.pdf
├── input
│   ├── generate.py
│   ├── input.txt
│   └── output.txt
├── sample
│   ├── sample-input.txt
│   ├── Sample.java
│   └── sample.py
└── solution
    ├── Solution.java
    └── solution.py
```

There are two files in the directory, the text Markdown file and the rendered
PDF of the problem statement. The `input` directory contains the test cases
that were used during the competition and a Python script to generate others.
The `sample` directory contains the Python and Java samples and the sample
input. The `solution` directory contains the Python and Java solutions.

This repository also contains some information that was used to host the team
editors, like the `Dockerfile`s. These files don't contain much usefull
information, but you can look through them if you are so inclined.
