/**
 * This is the file which contains the code for planets for the Solar System project
 * @author Tadas Ivanauskas
 */
public class Planets extends Sun {
    private double centreOfRotationalDistance = 0;
    private double cenreOfRotationalAngle = 0;
    private double rotationSpeed = 0;
    
    /**
     * Constructor Method
     * @param dist The distance value for the planet
     * @param angle The current angle of the planet
     * @param dia The diameter of the planet
     * @param col The colour of the planet
     * @param centreDist The distance of the planet from the sun
     * @param centreAngle The angular part of the polar co-ordinate about which this object orbits
     * @param rotationSpeed The velocity which the planet is travelling at
     */
    public Planets(double dist, double angle, double dia, String col, double centreDist, double centreAngle,double rotationSpeed){
        super(dist, angle, dia, col);
        this.centreOfRotationalDistance = centreDist;
        this.cenreOfRotationalAngle = centreAngle;
        this.rotationSpeed = rotationSpeed;
    }

    /**
     * Method to set a new centre distance for the planet
     * @param newDist New distance for the planet
     */
    public void setCentreDistnace(Double newDist){
        this.centreOfRotationalDistance = newDist;
    }

    /**
     * Method to set a new centre angle for the planet
     * @param newAngle New angle for the planet
     */
    public void setCentreAngle(Double newAngle){
        this.cenreOfRotationalAngle = newAngle;
    }

    /**
     * Method to set a new velocity for the planet
     * @param newSp New velocity for the planet
     */
    public void setRotatationSpeed(Double newSp){
        this.rotationSpeed = newSp;
    }
    
    /**
     * Method to return the current centre distance value of the sun
     * @return Returns the centre distance
     */
    public double getCentreDistance(){
        return this.centreOfRotationalDistance;
    }

    /** Method to return the current centre angle value of the sun
     * @return Returns the centre angle
     */
    public double getCentreAngle(){
        return this.cenreOfRotationalAngle;
    }

    /** Method to return the current velocity of the sun
     * @return Returns the velocity
     */
    public double getRotationSpeed() {
        return rotationSpeed;
    }

    /** 
     * Method to orbit the planet around the sun
     */
    public void rotate(){
        super.setAngle(super.getAngle() + this.rotationSpeed);
    }

    /**
     * Method to draw the planet using the built-in function in Solar System
     * @param SS The Solar System (window) in which the planet will be drawn onto
     */
    public void update(SolarSystem SS){
        SS.drawSolarObjectAbout(super.getDistance(),super.getAngle(),super.getDiameter(), super.getColor(), this.centreOfRotationalDistance, this.cenreOfRotationalAngle);
    }
}
