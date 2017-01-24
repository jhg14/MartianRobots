import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JHGWhite on 20/01/2017.
 */
public class MartianRobots {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n\n\n");

        String inputString = input.next();

        Grid grid = parseString(inputString);

        grid.executeRobots();

        System.out.println(grid);

    }


    public static Grid parseString(String input) {

        Grid grid;
        List<Robot> robots = new ArrayList<>();

        String[] inputs = input.split("\n");

        // Grid
        String gridString = inputs[0];
        String[] gridStrings = gridString.split(" ");
        int upperRightX = Integer.parseInt(gridStrings[0]);
        int upperRightY = Integer.parseInt(gridStrings[1]);

        grid = new Grid(upperRightX, upperRightY);


        // Robots
        for (int i = 1; i < inputs.length; i+=3) {
            if (inputs[i].isEmpty())
                break;

            String robotInitString = inputs[i];
            String robotInstructionString = inputs[i+1];

            String[] robotInitStrings = robotInitString.split(" ");

            int x = Integer.parseInt(robotInitStrings[0]);
            int y = Integer.parseInt(robotInitStrings[1]);
            Orientation o = Orientation.valueOf(robotInitStrings[2]);

            Robot robot = new Robot(x, y, o, grid, robotInstructionString);

            //robots.add(robot);

            grid.addRobot(robot);

            // TEST
        }

        return grid;
    }

}
