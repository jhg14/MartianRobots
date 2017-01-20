/**
 * Created by JHGWhite on 20/01/2017.
 */
public class Cell {

    boolean scented;

    public Cell() {
        scented = false;
    }

    public boolean isScented() {
        return scented;
    }

    public void markScented() {
        scented = true;
    }

}
