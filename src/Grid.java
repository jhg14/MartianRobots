import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHGWhite on 20/01/2017.
 */
public class Grid {

    Cell[][] grid;

    List<Robot> robots;

    public Grid(int upperRightx, int upperRighty) {

        robots = new ArrayList<>();

        int rows = upperRighty + 1;
        int columns = upperRightx + 1;

        grid = new Cell[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

}
