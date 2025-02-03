# Ocean Depth Range 

You are traveling in a submarine, recording the submarine's depth every minute. As you go deeper into the ocean, you travel through different "ocean zones". Here are the five "ocean zones" and the depths at which they start and end:

**Sunlight Zone:** 0 to 200 meters

**Twilight Zone:** 201 to 1000 meters

**Midnight Zone:** 1001 to 4000 meters

**Abyssal Zone:** 4001 to 6000 meters

**Trenches:** 6001 and beyond (infinite depth)

Write a program takes in a list/array of the recorded submarine depths and outputs the number of times your submarine was recorded as being in each ocean zone.

## Input

The first line of the input is the number of recorded depths you will be given. Each following line is a number that represents a recorded depth. 

## Output

For each zone, output the number of times a recorded depth was in that zone. **If you were never in that zone, put zero.**

Make sure that your output is correctly ordered (starting with the "Sunlight Zone" and ending with "Trenches"). The provided sample code handles this for you.

# Sample Input
```
8
50
250
1200
5000
7000
180
3490
900
```

# Sample Output
```
Sunlight Zone: 2
Twilight Zone: 2
Midnight Zone: 2
Abyssal Zone: 1
Trenches: 1
```
\newpage
