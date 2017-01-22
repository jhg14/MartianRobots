import java.util.function.Function;

/**
 * Created by JHGWhite on 22/01/2017.
 */
public enum Commands {

    Left('L', robot -> {
        robot.setOrientation(robot.getOrientation().anticlockwiseRotation());
        return true;
    }),

    Right('R', robot -> {
        robot.setOrientation(robot.getOrientation().clockwiseRotation());
        return true;
    }),

    Forward('F', robot -> {
        Orientation orientation = robot.getOrientation();
        return robot.moveRobot(orientation.x, orientation.y);
    });

    public final Function<Robot, Boolean> function;
    public final char code;

    Commands(char code, Function<Robot, Boolean> function) {
        this.code = code;
        this.function = function;
    }

    public static Commands parseCommandChar(char c) {
        for (Commands command : Commands.values()) {
            if (command.code == c) {
                return command;
            }
        }
        return null;
    }
}
