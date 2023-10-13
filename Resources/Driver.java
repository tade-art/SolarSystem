public class Driver {   
    
    public static void main(String[] args) {
        //Created the window for the SolarSystem
        SolarSystem window = new SolarSystem(1000, 1000);

        //Created all planet instances
        Sun mainSun = new Sun(25, 0, 150, "YELLOW");
        
        //Planets are added. but need to make them look nice and whatnot and add moons
        Planets earth = new Planets(150, 0, 30, "BLUE", 0, 0,0.5);
        Planets mercury = new Planets(150, 60, 25, "GREY", 0, 0,1);
        Planets venus = new Planets(200, 80, 15, "#a29416", 0, 0,0.3);
        Planets mars = new Planets(200, 130, 10, "RED", 0, 0,0.8);
        Planets jupiter = new Planets(250, 160, 75, "ORANGE", 0, 0,1.2);
        Planets saturn = new Planets(300, 200, 65, "#a28316", 0, 0,1.4);
        Planets uranus = new Planets(350, 240, 50, "#168aa2", 0, 0,1.6);
        Planets neptune = new Planets(400, 280, 45, "BLUE", 0, 0,0.2);

        Moons earthMoon = new Moons(25, 0, 5, "GREY",earth.getDistance(),earth.getAngle());

        Planets planets[] = new Planets[] {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};
        
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
            earthMoon.addAngle(5.5);
            earthMoon.addCentreAngle(0.5);

            //Used to make sure system doesnt crash lol
            window.finishedDrawing();
        }


    }
}