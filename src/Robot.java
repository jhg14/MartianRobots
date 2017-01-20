/**
 * Created by JHGWhite on 20/01/2017.
 */
public class Robot {

    // The Robot's location on the grid
    private int x;
    private int y;

    // The Robot's current direction
    private Orientation orientation;

    public Robot(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

}
