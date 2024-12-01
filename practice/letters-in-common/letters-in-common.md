# Letters in Common

You will need to write a function that takes a string of words, separated by
spaces, and determines how many letters in common each word has with the
others. Capitalization and punctuation can be ignored. Please see the test
cases below for some examples of what your program should output.

For example, if given the string "hello hi", the result should be 1, as "h" is
the only letter in common between the two words. The letter's position in the
string also does not matter: "apple rad" should also give 1, even though "a"
appears in different places in the words.

## Input

The first line of the input is the number of string to compress, $n$. The next
$n$ lines consist of a list of words separated by spaces. The strings only
contain lowercase letters, with no punctuation or special characters.

## Output

The output should be $n$ lines with the number of letters in common on each
line.

## Sample Input

```
3
january february march
last
funny punny runny
```

## Sample Output

```
2
4
3
```
