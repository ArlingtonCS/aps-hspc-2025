# B: Decrypt the Hacker's Message

You’ve just become a junior special agent with the Hacker Service Protection Coalition (HSPC).
The notorious hacker, known only by the alias SW4N, has recently published an encrypted message. Luckily, a member of your team was able to come up with some steps to decrypt the message.

Your first mission, should you choose to accept it, is to write a program that will decrypt the hacker's message.
Write a function that takes in a string and returns the decrypted message. The message will be encrypted using the following steps:

1. The letters in the message will be rotated by 13 places in the alphabet.
2. The numbers in the message will be rotated by 5 places in the number line. (Include 0)
3. After performing the previous two steps, any consecutive repeated **letters** will be "compressed" by replacing the repeated letters with the number of repetitions followed by the letter itself.

## Input

The first line in the test data file contains a number of test cases $n$. Each test case will be one string of length $l$, consisting of characters A-Z (uppercase only), spaces, and digits 0-9. The input will follow 0 < $n$ < 1000 and 0 < $l$ < 10_000.

## Output

For each test case, output the decrypted message.

## Sample Input

```
1
FJAAAA VF UNPXRE AHZORE 6
```

## Sample Output

```
SW4N IS HACKER NUMBER 1
```
