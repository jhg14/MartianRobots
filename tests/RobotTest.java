import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by JHGWhite on 20/01/2017.
 */
public class RobotTest {

    @Test
    public void ForwardCommandMovesRobotForwardTest() throws Exception {

        Grid grid = new Grid(5, 3);

        Robot robot = new Robot(1, 1, Orientation.E, grid, "F");

        robot.executeInstructions();

        assertThat(robot.getOrientation(), is(Orientation.E));
        assertThat(robot.getX(), is(2));
        assertThat(robot.getY(), is(1));

    }

    @Test
    public void LeftCommandRotatesRobotLeftTest() throws Exception {

        Grid grid = new Grid(5, 3);

        Robot robot = new Robot(1, 1, Orientation.E, grid, "L");

        robot.executeInstructions();

        assertThat(robot.getOrientation(), is(Orientation.N));
        assertThat(robot.getX(), is(1));
        assertThat(robot.getY(), is(1));

    }

    @Test
    public void CompoundRobotInstructionTest() throws Exception {

        Grid grid = new Grid(5, 3);

        Robot robot = new Robot(1, 1, Orientation.E, grid, "FFRF");

        robot.executeInstructions();

        assertThat(robot.getOrientation(), is(Orientation.S));
        assertThat(robot.getX(), is(3));
        assertThat(robot.getY(), is(0));

    }
}