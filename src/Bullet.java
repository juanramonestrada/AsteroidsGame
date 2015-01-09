import java.awt.*;

/**
 * Created by juan on 9/12/14.
 */
public class Bullet extends BaseVectorShape {
    public Rectangle getBounds(){
        Rectangle r;
        r = new Rectangle((int)getPosX(), (int)getPosY(), 1, 1);

        return r;
    }

    Bullet(){
        setShape(new Rectangle(0,0, 1, 1));
        setAlive(true);
    }


}
