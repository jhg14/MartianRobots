import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by JHGWhite on 20/01/2017.
 */
public class GridTest {

    @Test
    public void testGridToString() throws Exception {

        Grid grid = new Grid(5, 3);

        grid.addRobot(new Robot(1, 1, Orientation.E));
        grid.addRobot(new Robot(3, 2, Orientation.N));
        grid.addRobot(new Robot(0, 3, Orientation.W));

        String expectedOut = "1 1 E\n3 2 N\n0 3 W";

        assertThat(grid.toString(), is(expectedOut));

    }

}