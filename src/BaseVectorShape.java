import java.awt.*;

/**
 * Created by juan on 9/12/14.
 */
public class BaseVectorShape {
    private Shape shape;
    private boolean alive;
    private double posX, posY;
    private double velX, velY;
    private double faceAngle, moveAngle;

    public BaseVectorShape(){
        setShape(null);
        setAlive(false);
        setPosX(0.0);
        setPosY(0.0);
        setVelX(0.0);
        setVelY(0.0);
        setFaceAngle(0.0);
        setMoveAngle(0.0);
    }

    public void setShape(Shape shape){
        this.shape = shape;
    }

    public void setAlive(boolean alive){
        this.alive = alive;
    }

    public void setPosX(double x){
        this.posX = x;
    }

    public void incPosX(double i){
        this.posX += i;
    }

    public void setPosY(double y){
        this.posY = y;
    }

    public void incPosY(double i){
        this.posY += i;
    }

    public void setVelX(double velX){
        this.velX = velX;
    }

    public void incVelX(double i){
        this.velX += i;
    }

    public void setVelY(double velY){
        this.velY = velY;
    }

    public void incVelY(double i){
        this.velY = i;
    }

    public void setFaceAngle(double angle){
        this.faceAngle = angle;
    }

    public void incFaceAngle(double i){
        this.faceAngle += i;
    }

    public void setMoveAngle(double angle){
        this.moveAngle = angle;
    }

    public Shape getShape(){
        return shape;
    }

    public boolean isAlive(){
        return alive;
    }

    public double getPosX(){
        return posX;
    }

    public double getPosY(){
        return posY;
    }

    public double getVelX(){
        return velX;
    }

    public double getVelY(){
        return velY;
    }

    public double getFaceAngle(){
        return faceAngle;
    }

    public double getMoveAngle(){
        return moveAngle;
    }
}
