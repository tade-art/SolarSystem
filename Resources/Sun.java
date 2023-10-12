public class Sun {
    
    private double dist = 0;
    private double angle = 0;
    private double diameter = 0;
    private String col;
    
    public Sun(double dist, double angle, double dia, String col){
        this.dist = dist;
        this.angle = angle;
        this.diameter = dia;
        this.col = col;
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

    //OTHER METHODS
    public void updateSun(SolarSystem SS){
        SS.drawSolarObject(this.dist,this.angle,this.diameter, this.col);
    }
}