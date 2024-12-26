// imports
import java.awt.Graphics;

public class Player {
    // initialization
    private final int x, y;
    private final int height;
    private final int width;
    private final int vel;

    // constructor
    Player(int px, int py, int pheight, int pwidth, int pvel) {
        x = px;
        y = py;
        height = pheight;
        width = pwidth;
        vel = pvel;
    }

    // actions
    public void draw(Graphics p) {
        p.drawRect(x, y, width, height);
    }
}