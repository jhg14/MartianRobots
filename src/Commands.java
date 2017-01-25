import java.util.function.Function;

/**
 * Created by JHGWhite on 22/01/2017.
 */
public enum Commands {

    /*
        Each command has a character, which is used to specify the command
        in the instruction string of the robot, and a function which is what
        is run when the command is executed.

        The return value of the function indicates whether the robot should continue
        to execute commands after this one is finished.
        Naturally, rotation has no chance of making a robot lost,
        however moving the robot may cause this - thus the return of
        moveRobot() will specify whether the robot should continue to
        act after return, and this is passed on via the command Forward.

     */

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

    /*
        Parses a character into it's corresponding command
     */
    public static Commands parseCommandChar(char c) {
        for (Commands command : Commands.values()) {
            if (command.code == c) {
                return command;
            }
        }
        return null;
    }
}
