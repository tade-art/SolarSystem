public class Driver {   
    
    public static void main(String[] args) {
        //Created the window for the SolarSystem
        SolarSystem window = new SolarSystem(1000, 1000);

        //Created all planet instances
        Sun mainSun = new Sun(25, 0, 150, "YELLOW");
        
        //Planets are added. but need to make them look nice and whatnot and add moons
        Planets earth = new Planets(199, 0, 30, "BLUE", 0, 0);
        Planets mercury = new Planets(139, 40, 25, "GREY", 0, 0);
        Planets venus = new Planets(164, 80, 15, "#a29416", 0, 0);
        Planets mars = new Planets(211, 120, 10, "RED", 0, 0);
        Planets jupiter = new Planets(230, 160, 75, "ORANGE", 0, 0);
        Planets saturn = new Planets(264, 200, 65, "#a28316", 0, 0);
        Planets uranus = new Planets(300, 240, 50, "#168aa2", 0, 0);
        Planets neptune = new Planets(276, 280, 45, "BLUE", 0, 0);

        Moons earthMoon = new Moons(50, 0, 5, "GREY",earth.getDistance(),earth.getAngle());

        Planets planets[] = new Planets[] {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};
        
        while (true) {   
            //Added Sun to screen
            mainSun.updateSun(window);
            
            //Added All Planets to the screen and orbited them
            // earth.addAngle(0.5);
            // earth.updatePlanet(window);

            for (Planets planetsSingle : planets){
                planetsSingle.addAngle(0.5);
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