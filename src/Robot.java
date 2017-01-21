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

    // Whether or not the Robot has fallen off the edge
    private boolean lost;

    public Robot(int x, int y, Orientation orientation, Grid grid) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.grid = grid;
        lost = false;
    }

    public Orientation getOrientation() { return orientation; }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    // Allows for multiple steps in directions that are not being faced,
    // potentially for future features
    public void moveRobot (int xAmount, int yAmount) {

        for (int i = 0; i < xAmount; i++) {
            if (x+1 > grid.maxX) {
                this.setLost();
                grid.grid[x][y].markScented();
            } else {
                x++;
            }
        }

        for (int j = 0; j < yAmount; j++) {
            if (y+1 > grid.maxY) {
                this.setLost();
                grid.grid[x][y].markScented();
            } else {
                y++;
            }
        }
    }

    public boolean isLost() {
        return lost;
    }

    public void setLost() {
        lost = true;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + orientation + (lost ? "LOST" : "");
    }

}
