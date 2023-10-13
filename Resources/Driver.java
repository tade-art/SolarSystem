public class Driver {   
    
    public static void main(String[] args) {
        //Created the window for the SolarSystem
        SolarSystem window = new SolarSystem(1000, 1000);

        //Created the sun
        Sun mainSun = new Sun(25, 0, 100, "YELLOW");
        
        //Planets are added
        Planets earth = new Planets(190, 33, 25, "BLUE", 0, 0,0.5);
        Planets mercury = new Planets(100, 95, 20, "GREY", 0, 0,1);
        Planets venus = new Planets(140, 112, 15, "#a29416", 0, 0,0.3);
        Planets mars = new Planets(220, 154, 15, "RED", 0, 0,0.8);
        Planets jupiter = new Planets(250, 201, 60, "ORANGE", 0, 0,1.2);
        Planets saturn = new Planets(330, 245, 50, "#a28316", 0, 0,1.4);
        Planets uranus = new Planets(400, 293, 40, "#168aa2", 0, 0,1.6);
        Planets neptune = new Planets(460, 352, 35, "BLUE", 0, 0,0.2);

        //Moons are added here
        Moons earthMoon = new Moons(25, 0, 5, "GREY",earth.getDistance(),earth.getAngle(), 5.5);

        //An array of all planets in the solar system
        Planets planets[] = new Planets[] {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};
        
        //Constantly active
        while (true) {   
            //Added Sun to screen
            mainSun.updateSun(window);
            
            //Added All Planets to the screen and orbited them
            for (Planets planetsSingle : planets){
                planetsSingle.rotate();
                planetsSingle.updatePlanet(window);
            }

            //Added Earth's moon to the screeen
            earthMoon.updateMoon(window);
            earthMoon.rotate();
            earthMoon.rotateAround(earth);

            //Used to make sure system doesnt crash lol
            window.finishedDrawing();
        }


    }
}