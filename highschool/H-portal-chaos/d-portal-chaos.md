# H: Portal Chaos

While on a top secret mission, one of our junior operatives, Johnny, tripped
and dropped our portal generator. When the generator hit the floor, it started
generating extra portals, and our operative was forced to return. As our top
operative at Hyper-Space Portal Corporation (HSPC), your mission, if you chose
to accept it, is to navigate the maze of portals and safely retreieve our
portal generator. Luckily, the generator broadcasted the details of all the
portals it generated. Each of the portals connects 2 rooms and can be used in
each direction. You will start in room #0, and the portal generator will be in
room #1000. You can assume that there is a path from the start room to the
portal generator.

## Input

The first line is the number of portals that were generated, $n$. This is
followed by $n$ pairs of room numbers, which are each on a new line and
separated by a comma. Each pair represents a portal which connects two rooms.
The portals will be given in a random order.

## Output 

Output the least number of portals you would have to travel through to get to
the generator.

## Sample Input

```
5
2,4
4,1000
2,3
0,1
1,2
```

## Sample Output

```
4
```
