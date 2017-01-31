# MartianRobots
An extremely lifelike computer model of mars, written in Java

## Entering Input

The first line of input is the upper-right coordinates of the rectangular world, the lower-left coordinates are assumed to be 0, 0.

The remaining input consists of a sequence of robot positions and instructions (two lines per robot).
A position consists of two integers specifying the initial coordinates of the robot and an orientation (N, S, E, W), all separated by whitespace on one line.
A robot instruction is a string of the letters “L”, “R”, and “F” on one line.
The input can be completed by entering two carriage returns from the line below the last string of letters.

### Example Input

```
5 3
1 1 E
RFRFRFRF

3 2 N
FRRFLLFFRRFLL

0 3 W
LLFFFLFLFL


```

## Dependencies

For unit tests, JUnit4 is required.

JUnit4 can be installed from [here](https://github.com/junit-team/junit4/wiki/Download-and-Install)
