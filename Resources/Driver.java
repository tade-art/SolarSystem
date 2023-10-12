public class Driver {   
    
    public static void main(String[] args) {
        //Created the window for the SolarSystem
        SolarSystem window = new SolarSystem(650, 650);

        //Created all planet instances
        Sun mainSun = new Sun(25, 0, 75, "YELLOW");
        Planets earth = new Planets(200, 0, 35, "BLUE", 0, 0);
        Moons earthMoon = new Moons(50, 0, 15, "GREY",earth.getDistance(),earth.getAngle());
        
        while (true) {   
            //Added Sun to screen
            mainSun.updateSun(window);
            
            //Added Earth to screen and orbited the sun
            earth.addAngle(0.5);
            earth.updatePlanet(window);

            //Added Earth's moon to the screeeeen
            earthMoon.updateMoon(window);
            earthMoon.addAngle(5.5);
            earthMoon.addCentreAngle(0.5);

            //Used to make sure system doesnt crash lol
            window.finishedDrawing();
        }


    }
}