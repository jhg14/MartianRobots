import java.util.function.Function;

/**
 * Created by JHGWhite on 22/01/2017.
 */
public enum Commands {

    Left('L', robot -> {
        robot.setOrientation(robot.getOrientation().anticlockwiseRotation());
        return null;
    }),

    Right('R', robot -> {
        robot.setOrientation(robot.getOrientation().clockwiseRotation());
        return null;
    }),

    Forward('F', robot -> {
        Orientation orientation = robot.getOrientation();
        robot.moveRobot(orientation.x, orientation.y);
        return null;
    });

    public final Function<Robot, Void> function;
    public final char code;

    Commands(char code, Function<Robot, Void> function) {
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
