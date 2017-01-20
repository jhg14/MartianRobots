/**
 * Created by JHGWhite on 20/01/2017.
 */
public class Robot {

    // The Robot's location on the grid
    private int x;
    private int y;

    // The Robot's current direction
    private Orientation orientation;

    // Whether or not the Robot has fallen off the edge
    private boolean lost;

    public Robot(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        lost = false;
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
