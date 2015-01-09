import java.awt.*;

/**
 * Created by juan on 9/12/14.
 */
public class Asteroid extends BaseVectorShape {
    private int astX[] = {-20,-13, 0,20,22, 20, 12, 2,-10,-22,-16};
    private int astY[] = {20, 23,17,20,16,-20,-22,-14,-17,-20, -5};
    private double rotationVelocity;

    // set the rotation velocity
    public void setRotationVelocity(double v){
        this.rotationVelocity = v;
    }

    // get the asteroid velocity
    public double getRotationVelocity(){
        return rotationVelocity;
    }

    public Rectangle getBounds(){
        Rectangle r;
        r = new Rectangle((int)getPosX()-20, (int)getPosY()-20, 40, 40);
        return r;
    }

    /**
     * constructor
     */
    public Asteroid(){
        setShape(new Polygon(astX, astY, astX.length));
        setAlive(true);
        setRotationVelocity(0.0);
    }
}
