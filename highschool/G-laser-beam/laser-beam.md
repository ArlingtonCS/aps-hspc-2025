# G: Laser Beam

As a quality assurance engineer at the High Speed Phaser Collaborative (HSPC)
you are tasked with measuring the reflectance of the mirror used in our
product. Unfortunately Carl had a little too much sugar and ran through the
testing facility, knocking all our testing lasers off course. Your task is to
figure out which lasers need to be adjusted to hit the mirrors given the
coordinates of the mirror and the angle of the laser.

## Input

The first line of input is the number, $n$, of lasers you must check. This is
followed by $n$ lines which consist of the x and y coordinate of the first
endpoint of the mirror, the x and y coordinate of the second endpoint of the
mirror, and the angle of the laser, separated by spaces. All of the numbers are
integers. The endpoints are included in the mirror. The first and second
coordinates are in random order.

The angle starts at the positive x axis and increases counterclockwise. 0° is
the positive x axis and 90° is the positive y axis. The laser starts at the
origin, the point where x and y both equal zero. Angles are given in degrees 0°
up to but not including 360°.

Assume that the laser or the mirror will never be perfectly vertical.

$n$ will be between 1 and 10,000 inclusive. All coordinates will be between -20 and 20 inclusive.

## Output

For each laser you are checking, print "true" if the laser intersects the
mirror or "false" if it does not on a new line.

## Sample Input

```
6
2 17 -10 -7 323
17 14 9 19 333
-1 -15 -12 -19 242
-18 7 -20 -13 186
7 10 13 17 276
19 -8 -1 -12 95
```

## Sample Output

```
true
false
true
true
false
false
```
