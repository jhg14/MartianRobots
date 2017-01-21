import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by JHGWhite on 21/01/2017.
 */
public class OrientationTest {

    @Test
    public void clockwiseRotationTest() throws Exception {

        Orientation orientation = Orientation.N;

        orientation = orientation.clockwiseRotation();

        assertThat(orientation, is(orientation.E));
    }

    @Test
    public void anticlockwiseRotationTest() throws Exception {

        Orientation orientation = Orientation.N;

        orientation = orientation.anticlockwiseRotation();

        assertThat(orientation, is(orientation.W));
    }

}