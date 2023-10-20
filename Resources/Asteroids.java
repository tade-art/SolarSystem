/**
 * This class contains all the code regarding Asteroids in Java
 * @author Tadas Ivanauskas
 */

public class Asteroids extends Planets {
    
    /**
     * Constructor Method
     * @param dist The distance value for the asteroid
     * @param angle The current angle of the asteroid
     * @param dia The diameter of the asteroid
     * @param col The colour of the asteroid
     * @param centreDist The distance of the asteroid from the sun
     * @param centreAngle The angular part of the polar co-ordinate about which this object orbits
     * @param rotationSpeed The velocity which the asteroid is travelling at
     */
    public Asteroids(double dist, double angle, double dia, String col, double centreDist, double centreAngle, double rotationSpeed){
        super(dist, angle, dia, col, centreDist, centreAngle, rotationSpeed);
    }
}
