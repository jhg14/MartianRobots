import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHGWhite on 20/01/2017.
 */
public class Robot {

    // The Robot's location on the grid
    private int x;
    private int y;

    // The Robot's current direction
    private Orientation orientation;

    // The grid that the robot is on
    private Grid grid;

    private List<Commands> instructions;

    // Whether or not the Robot has fallen off the edge
    private boolean lost;

    public Robot(int x, int y, Orientation orientation, Grid grid, String instructionString) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.grid = grid;
        instructions = new ArrayList<>();
        parseInstructions(instructionString);
        lost = false;
    }

    public int getX() { return x; }

    public int getY() { return y; }

    public Orientation getOrientation() { return orientation; }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    // Allows for multiple steps in directions that are not being faced,
    // potentially for future features
    public boolean moveRobot (int xAmount, int yAmount) {

        int xStep = xAmount != 0 ? xAmount/Math.abs(xAmount) : 0;
        int yStep = yAmount != 0 ? yAmount/Math.abs(yAmount) : 0;

        for (int i = 0; i < Math.abs(xAmount); i++) {
            if ((x+xStep) > grid.maxX) {
                if (grid.grid[x][y].isScented()) {
                    // A robot has fallen here previously
                    // so return and ignore this instruction
                    return true;
                } else {
                    this.setLost();
                    grid.grid[x][y].markScented();
                    return false;
                }
            } else {
                x+=xStep;
            }
        }

        for (int j = 0; j < Math.abs(yAmount); j++) {
            if ((y+yStep) > grid.maxY) {
                if (grid.grid[x][y].isScented()) {
                    return true;
                } else {
                    this.setLost();
                    grid.grid[x][y].markScented();
                    return false;
                }
            } else {
                y+=yStep;
            }
        }
        return true;
    }

    public void setLost() {
        lost = true;
    }

    public boolean isLost() { return lost; }

    /*
        Parses string instructions into a list of commands
     */
    public void parseInstructions(String instructionString) {
        for (char c : instructionString.toCharArray()) {
            instructions.add(Commands.parseCommandChar(c));
        }
    }

    /*
        Executes instructions for robot
     */
    public void executeInstructions() {
        for (Commands command : instructions) {
            if (!command.function.apply(this))
                break;
        }
    }

    @Override
    public String toString() {
        return x + " " + y + " " + orientation + (lost ? " LOST" : "");
    }

}
