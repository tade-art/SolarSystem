public class Planets extends Sun {
    
    private double centreOfRotationalDistance = 0;
    private double cenreOfRotationalAngle = 0;
    private double rotationSpeed = 0;
    
    public Planets(double dist, double angle, double dia, String col, double centreDist, double centreAngle,double rotationSpeed){
        super(dist, angle, dia, col);
        this.centreOfRotationalDistance = centreDist;
        this.cenreOfRotationalAngle = centreAngle;
        this.rotationSpeed = rotationSpeed;
    }

    //----SETTER METHODS
    public void setCentreDistnace(Double newDist){
        this.centreOfRotationalDistance = newDist;
    }

    public void setCentreAngle(Double newAngle){
        this.cenreOfRotationalAngle = newAngle;
    }

    public void setRotatationSpeed(Double newSp){
        this.rotationSpeed = newSp;
    }
    
    //----GETTER METHODS
    public double getCentreDistance(){
        return this.centreOfRotationalDistance;
    }

    public double getCentreAngle(){
        return this.cenreOfRotationalAngle;
    }

    public double getRotationSpeed() {
        return rotationSpeed;
    }

    //OTHER METHODS
    public void rotate(){
        super.setAngle(super.getAngle() + this.rotationSpeed);
    }

    public void update(SolarSystem SS){
        SS.drawSolarObjectAbout(super.getDistance(),super.getAngle(),super.getDiameter(), super.getColor(), this.centreOfRotationalDistance, this.cenreOfRotationalAngle);
    }
}
