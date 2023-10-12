public class Moons {
    private double dist = 0;
    private double angle = 0;
    private double diameter = 0;
    private String col;
    private double centreOfRotationalDistance = 0;
    private double cenreOfRotationalAngle = 0;

    public Moons(double dist, double angle, double dia, String col, double centreDist, double centreAngle){
        this.dist = dist;
        this.angle = angle;
        this.diameter = dia;
        this.col = col;
        this.centreOfRotationalDistance = centreDist;
        this.cenreOfRotationalAngle = centreAngle;
    }

      //----SETTER METHODS
      public void setDistance(double dist){
        this.dist = dist;
    }

    public void setAngle(double angle){
        this.angle = angle;
    }

    public void setDiameter(double dia){
        this.diameter = dia;
    }

    public void setColour(String col){
        this.col = col;
    }

    public void setCentreDistnace(Double newDist){
        this.centreOfRotationalDistance = newDist;
    }

    public void setCentreAngle(Double newAngle){
        this.cenreOfRotationalAngle = newAngle;
    }

    
    //----GETTER METHODS
    public double getDistance(){
        return this.dist;
    }
        
    public double getAngle(){
        return this.angle;
    }
        
    public double getDiameter(){
        return this.diameter;
    }
        
    public String getColor(){
        return this.col;
    }

    public double getCentreDistance(){
        return this.centreOfRotationalDistance;
    }

    public double getCentreAngle(){
        return this.cenreOfRotationalAngle;
    }

    //OTHER METHODS
    public void addAngle(double newAngle){
        this.angle += newAngle;
    }

    public void addCentreAngle(double newAngle){
        this.cenreOfRotationalAngle += newAngle;
    }

    public void updateMoon(SolarSystem SS){
        SS.drawSolarObjectAbout(this.dist,this.angle,this.diameter, this.col, this.centreOfRotationalDistance, this.cenreOfRotationalAngle);
    }
}