import java.awt.*;

/**
 * Created by juan on 9/12/14.
 */
public class Ship extends BaseVectorShape {
    // ship polygons
    private int[] shipX = {-6, -3, 0, 3, 6, 0};
    private int[] shipY = {6, 7, 7, 7, 6, -7};

    //bounding rectangle
    public Rectangle getBound(){
        Rectangle r;
        r = new Rectangle((int)getPosX()-6, (int)getPosY()-6, 12, 12);

        return r;
    }

    Ship(){
        setShape(new Polygon(shipX, shipY, shipX.length));
        setAlive(true);
    }
}
