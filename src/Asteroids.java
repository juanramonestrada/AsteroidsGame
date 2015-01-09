import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Created by juan on 9/12/14.
 * modificado por Juan Ramon
 */
public class Asteroids extends Applet implements Runnable, KeyListener {
    //main game thread loop
    //private Thread gameLoop;

    //double buffer
    private BufferedImage backBuffered;

    //the main drawing object for the back buffer
    private Graphics2D g2d;

    // show the box bound box
    //boolean showBounds = false;

    // asteroid array
    int ASTEROIDS = 20;
    Asteroid[] ast = new Asteroid[ASTEROIDS];

    // bullets array
    int BULLETS = 10;
    Bullet[] bullets = new Bullet[BULLETS];

    // ship instance
    Ship ship = new Ship();

    // create the identity transform(0,0)
    AffineTransform identity = new AffineTransform();

    // create Random generator
    Random rand = new Random();

    // applet init event
    public void init(){
        // back buffer for smooth graphics
        backBuffered = new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
        g2d = backBuffered.createGraphics();

        // set the ship position
        ship.setPosX(320);
        ship.setPosY(240);

        int bulletsLenght = bullets.length;
        // set the bullets
        for(int n =0; n < bulletsLenght; n++){
            bullets[n] = new Bullet();
        }

        int astLength = ast.length;
        // create the asteroids
        for(int n = 0; n < astLength; n++){
            ast[n] = new Asteroid();
            ast[n].setRotationVelocity(rand.nextInt(3)+1);
            ast[n].setPosX((double)rand.nextInt(600)+20);
            ast[n].setPosY((double)rand.nextInt(440)+20);
            ast[n].setMoveAngle((double)rand.nextInt(360));
            //double ang = ast[n].getMoveAngle()-90;
            //ast[n].setVelX(calcAngleMoveX(ang));
            //ast[n].setVelY(calcAngleMoveY(ang));
        }

        // start key listener
        addKeyListener(this);

    }

    // applet update event to redraw the screen
    public void update(Graphics g){
        //start off transforms at identity
        g2d.setTransform(identity);

        //erase the background
        g2d.setPaint(Color.BLACK);
        g2d.fillRect(0,0, getSize().width, getSize().height);

        //print some status information
        g2d.setColor(Color.WHITE);
        g2d.drawString("Ship: " + Math.round(ship.getPosX()) + "," +
                Math.round(ship.getPosY()), 5, 10);
        g2d.drawString("Move angle: " + Math.round(ship.getMoveAngle()) + 90, 5, 25);
        g2d.drawString("Face angle: " + Math.round(ship.getFaceAngle()), 5, 40);

        //draw the game graphics
        drawShip();
        drawBullets();
        drawAsteroids();

    }

    private void drawAsteroids() {

    }

    private void drawBullets() {

    }

    private void drawShip() {

    }

    // aqui necesitamos iniciar el applet
    @Override
    public void run() {
        // se ocupan los objetos de el thread
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    // este cambio es necesario
    // prueva de github
    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
