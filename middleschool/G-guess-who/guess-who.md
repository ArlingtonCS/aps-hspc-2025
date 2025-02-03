# Guess Who

You are hosting a party, and there's some mystery guests you’re trying to identify! Each guest has a name and exactly three traits. Your job is to write a program that outputs all of the guests that match both of the given clues.

If no one matches the two clues, your program should print "No match found". If multiple people match the given clues, output each person's name, separated by a space. If only one person matches the clues, simply output their name.

# Input

The first line contains a number that represents the number of test cases (up to 10).

For each test case there will be:

 - A line that contains the number of guests at the party.

 - The next lines describe each guest. Each line contains the guest's name and their three traits, separated by spaces (e.g., Alice blonde tall glasses).

 - The last line contains exactly 2 clues, separated by a space (e.g., blonde glasses).

# Output

The output contains a single line with either the name or names of the guests who fit the description or the phrase "No match found".

# Sample Input
```
2
3
Alice blonde tall glasses
Bob brown tall hat
Charlie blonde short glasses
blonde glasses
2
Diana red tall glasses
Eve blue short hat
red hat
```

# Sample Output
```
Alice Charlie
No match found.
```

\newpage
