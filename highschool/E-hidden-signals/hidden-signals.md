# E: Hidden Signals

You are an elite codebreaker for the HSPC (Highly Secretive Protocol Command), a secret organization dedicated to intercepting and decrypting enemy transmissions. Your latest assignment involves a coded message sent by a notorious double agent. The agent's messages are usually layered with complex instructions designed to mislead anyone trying to decipher them.

Your task is to decode the message by following a series of commands issued by HSPC's decryption protocol. Each command alters the encoded string through character replacements, deletions, or insertions. As an agent of HSPC, it’s your job to carefully execute each command in order to reveal the hidden message.

## Input

The input begins with an integer ```T```, the number of test cases.

For each test case:

The first line contains an integer ```N```, the number of commands.
The second line contains the original encoded message, a string of lowercase letters.
Each of the next ```N``` lines contains one command in one of three possible formats:

 - replace ```old_char``` with ```new_char``` - replaces each occurrence of ```old_char``` in the message with ```new_char```.
 - delete ```char``` - removes each occurrence of ```char``` from the message.
 - insert ```char``` before ```position``` - inserts ```char``` before the character at the specified (1-based) ```position``` in the message.

The encoded message will have a length between 1 and 100 characters. There will be at most 30 commands. The position for insertion will always be valid (within the bounds of the current message).

## Output

Output the decrypted string message after applying all the commands in the specified order.

## Sample Input

```
1
8
mqzsrwek
replace q with o
insert p before 3
delete z
replace m with t
insert e before 5
replace k with t
insert c before 6
delete w
```

## Sample Output

```
topsecret
```