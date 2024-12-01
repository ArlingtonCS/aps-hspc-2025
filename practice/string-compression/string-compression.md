# String Compression

Implement a string compression algorithm that takes a string and returns a
compressed version of it. The compressed version should be the original string
with any repeated characters replaced with the character in parentheses and the
number of times it is repeated. Non-repeated characters should not be
compressed.

## Input

The first line of the input is the number of string to compress, $n$. The next
$n$ lines consist of one string to compress. The strings only contain lowercase
letters, with no punctuation or special characters.

## Output

The output should be $n$ lines with each compressed string on it's own line.

## Sample Input

```
2
aaabbbcccd
abcde
```

## Sample Output

```
(a)3(b)3(c)3d
abcde
```
