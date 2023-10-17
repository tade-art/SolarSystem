public class Moons extends Planets {
    
    Moons moon;
    Planets father;

    public Moons(double dist, double angle, double dia, String col, double centreDist, double centreAngle, double rotationSpeed, Planets father){
        super(dist, angle, dia, col, centreDist, centreAngle, rotationSpeed);
        this.father = father;
    }

    //OTHER METHODS
    public Planets getFatherPlanet() {
        return father;
    }

    public void setFather(Planets father) {
        this.father = father;
    }

    public void rotateAround(Planets planet){
        super.setCentreAngle(super.getCentreAngle() + planet.getRotationSpeed());
    }
}