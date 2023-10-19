/**
 * This is the file which contains the code for moons for the Solar System project
 * @author Tadas Ivanauskas
 */
public class Moons extends Planets {
    Planets father;

    /**
     * Constructor Method
     * @param dist The distance value for the planet
     * @param angle The current angle of the planet
     * @param dia The diameter of the planet
     * @param col The colour of the planet
     * @param centreDist The distance of the planet from the sun
     * @param centreAngle The angular part of the polar co-ordinate about which this object orbits
     * @param rotationSpeed The velocity which the planet is travelling at
     * @param father The planet which the moon will be orbiting
     */
    public Moons(double dist, double angle, double dia, String col, double centreDist, double centreAngle, double rotationSpeed, Planets father){
        super(dist, angle, dia, col, centreDist, centreAngle, rotationSpeed);
        this.father = father;
    }

    /**
     * Method to return the father planet which the moon is orbiting
     * @return The current planet which the moon is connected to and orbiting
     */    
    public Planets getFatherPlanet() {
        return father;
    }

    /**
     * Method to set a new "father" (planet) for the moon
     * @param father New planet to orbit for the moon
     */
    public void setFather(Planets father) {
        this.father = father;
    }

    /**
     * Method to rotate and orbit the moon around the planet
     * @param planet The planet which the moon is orbiting
     */
    public void rotateAround(Planets planet){
        super.setCentreAngle(super.getCentreAngle() + planet.getRotationSpeed());
    }
}