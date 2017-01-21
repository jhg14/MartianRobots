/**
 * Created by JHGWhite on 21/01/2017.
 */
public class LeftCommand implements Command {

    public void execute(Robot robot) {
        robot.setOrientation(robot.getOrientation().anticlockwiseRotation());
    }

}
