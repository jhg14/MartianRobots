/**
 * Created by JHGWhite on 21/01/2017.
 */
public class ForwardCommand implements Command {

    public void execute(Robot robot) {
        Orientation orientation = robot.getOrientation();
        robot.moveRobot(orientation.x, orientation.y);
    }

}
