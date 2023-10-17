/**
 * This is the file which contains the code to create the sun
 * This is the "father-class" or super class of Planets.java and Moons.java
 * @author Tadas Ivanauskas
 */

public class Sun {
    
    private double dist = 0;
    private double angle = 0;
    private double diameter = 0;
    private String col;
    
    /**
     * Constructor Method
     * @param dist The distance for the sun
     * @param angle The angle which it spawns at
     * @param dia The diameter of the sun
     * @param col The colour of the sun
     */
    public Sun(double dist, double angle, double dia, String col){
        this.dist = dist;
        this.angle = angle;
        this.diameter = dia;
        this.col = col;
    }

    /**
     * Method to set a new distance for the sun
     * @param dist New distance for the sun
     */
    public void setDistance(double dist){
        this.dist = dist;
    }
    
    /**
     * Method to set a new angle for the sun
     * @param angle New angle for the sun
     */
    public void setAngle(double angle){
        this.angle = angle;
    }
    
    /**
     * Method to set a new diameter for the sun
     * @param dia New diameter for the sun
     */
    public void setDiameter(double dia){
        this.diameter = dia;
    }
    
    /**
     * Method to set a new colour for the sun
     * @param col New colour for the sun
     */
    public void setColour(String col){
        this.col = col;
    }

    /**
     * Method to return the current distance value of the sun
     * @return Returns the distance
     */
    public double getDistance(){
        return this.dist;
    }
        
    /**
     * Method to return the current angle of the sun
     * @return Returns the angle
     */
    public double getAngle(){
        return this.angle;
    }
        
    /**
     * Method to return the current diameter of the sun
     * @return Returns the diameter
     */
    public double getDiameter(){
        return this.diameter;
    }
        
    /**
     * Method to return the current colour of the sun
     * @return Returns the colour
     */
    public String getColor(){
        return this.col;
    }

    /**
     * Method to draw the sun using the built-in SolarSystem function
     * @param SS The SolarSystem (window) which the Sun will be added to
     */
    public void updateSun(SolarSystem SS){
        SS.drawSolarObject(this.dist,this.angle,this.diameter, this.col);
    }
}