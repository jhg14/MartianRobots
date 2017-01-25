/**
 * Created by JHGWhite on 20/01/2017.
 */

public enum Orientation {

    N(0, 1), E(1, 0), S(0, -1), W(-1, 0);

    public final int COS_90 = (int) Math.cos(Math.PI/2);
    public final int SIN_90 = (int) Math.sin(Math.PI/2);
    public final int COS_NEG_90 = (int) Math.cos(-Math.PI/2);
    public final int SIN_NEG_90 = (int) Math.sin(-Math.PI/2);

    public final int x;
    public final int y;

    Orientation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
        Returns the orientation received when rotating
        clockwise 90 deg.
     */
    public Orientation clockwiseRotation() {
        int newX = x * COS_90 + y * SIN_90;
        int newY = x * -SIN_90 + y * COS_90;

        for (Orientation o : Orientation.values()) {
            if (o.x == newX && o.y == newY) {
                return o;
            }
        }
        return null;
    }

    /*
        Returns the orientation received when rotating
        anticlockwise 90 deg.
     */
    public Orientation anticlockwiseRotation() {
        int newX = x * COS_NEG_90 + y * SIN_NEG_90;
        int newY = x * -SIN_NEG_90 + y * COS_NEG_90;

        for (Orientation o : Orientation.values()) {
            if (o.x == newX && o.y == newY) {
                return o;
            }
        }
        return null;
    }

}
