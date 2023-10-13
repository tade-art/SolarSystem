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
        Planets mars = new Planets(220, 154, 25, "RED", 0, 0,0.8);
        Planets jupiter = new Planets(250, 201, 60, "ORANGE", 0, 0,1.2);
        Planets saturn = new Planets(330, 245, 50, "#a28316", 0, 0,1.4);
        Planets uranus = new Planets(400, 293, 40, "#168aa2", 0, 0,1.6);
        Planets neptune = new Planets(460, 352, 35, "BLUE", 0, 0,0.2);

        //Moons are added here
        Moons earthMoon = new Moons(25, 0, 5, "GREY",earth.getDistance(),earth.getAngle(), 5.5,earth);
        Moons phobos = new Moons(26, 44, 5, "#ff6105", mars.getDistance(), mars.getAngle(), 5.3,mars);
        Moons deimos = new Moons(31,230,5,"#957d6f",mars.getDistance(),mars.getAngle(),4.5,mars);
        Moons io = new Moons(51, 99, 5, "#d5ff05", jupiter.getDistance(), jupiter.getAngle(), 6.5,jupiter);
        Moons europa = new Moons(56,223,5,"#ff6505",jupiter.getDistance(),jupiter.getAngle(),5.4,jupiter);
        Moons titan = new Moons(41, 310, 5, "#ffc42e", saturn.getDistance(), saturn.getAngle(), 4.9,saturn);
        Moons enceladus = new Moons(46, 112, 5, "#63baca", saturn.getDistance(), saturn.getAngle(), 5.5,saturn);

        //An array for all solar objects in the solar system for their respected classes
        Planets planets[] = new Planets[] {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};
        Moons moons[]=new Moons[] {earthMoon, phobos, deimos, io, europa, titan, enceladus};
        
        //Constantly active
        while (true) {   
            //Added Sun to screen
            mainSun.updateSun(window);
            
            //Added All Planets to the screen and orbited them
            for (Planets allPlanets : planets){
                allPlanets.rotate();
                allPlanets.updatePlanet(window);
            }

            //Added All Planets to the screen and set to orbit planets
            for(Moons allMoons : moons){
                allMoons.updateMoon(window);
                allMoons.rotate();
                allMoons.rotateAround(allMoons.getFatherPlanet());
            }
    
            //Used to make sure system doesnt crash lol
            window.finishedDrawing();
        }


    }
}