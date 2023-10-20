import java.awt.event.KeyAdapter;
import java.util.Random;

/**
 * This class manipulates all the other java files in the folder to simulate a
 * simple model of the Solar System
 * This is a part of the Portfolio required for Year 2
 * 
 * @author Tadas Ivanauskas
 */
public class Driver extends KeyAdapter {
    
        /**
         * Main method where all code is initalised and manipulated
         * @param args Arguements taken in when running the code (DO NOT USE)
         */
    public static void main(String[] args) {
        SolarSystem window = new SolarSystem(1250, 1250);
        Sun mainSun = new Sun(0, 0, 60, "YELLOW");
        Sun outerSun = new Sun(0, 0, 70, "RED");

        Planets earth = new Planets(mainSun.getDiameter() + 90, 33, 15, "BLUE", 0, 0, 0.95);
        Planets mercury = new Planets(mainSun.getDiameter(), 95, 10, "GREY", 0, 0, 0.8);
        Planets venus = new Planets(mainSun.getDiameter() + 45, 112, 10, "#a29416", 0, 0, 0.75);
        Planets mars = new Planets(mainSun.getDiameter() + 135, 154, 15, "RED", 0, 0, 1.15);
        Planets jupiter = new Planets(mainSun.getDiameter() + 275, 201, 30, "ORANGE", 0, 0, 1.6);
        Planets saturn = new Planets(mainSun.getDiameter() + 350, 245, 25, "#a28316", 0, 0, 1.3);
        Planets uranus = new Planets(mainSun.getDiameter() + 410, 293, 20, "#168aa2", 0, 0, 1.2);
        Planets neptune = new Planets(mainSun.getDiameter() + 450, 352, 15, "BLUE", 0, 0, 1.0);

        Moons earthMoon = new Moons(earth.getDiameter(), 0, 5, "GREY", earth.getDistance(), earth.getAngle(), 5.5,earth);
        Moons phobos = new Moons(mars.getDiameter(), 44, 5, "#ff6105", mars.getDistance(), mars.getAngle(), 5.4, mars);
        Moons deimos = new Moons(mars.getDiameter() + 5, 230, 5, "#957d6f", mars.getDistance(), mars.getAngle(), 5.1,mars);
        Moons io = new Moons(jupiter.getDiameter(), 99, 5, "#d5ff05", jupiter.getDistance(), jupiter.getAngle(), -6.1,jupiter);
        Moons europa = new Moons(jupiter.getDiameter() + 5, 223, 5, "#ff6505", jupiter.getDistance(),jupiter.getAngle(), 5.7, jupiter);
        Moons amalthea = new Moons(jupiter.getDiameter() + 10, 351, 5, "#802200", jupiter.getDistance(),jupiter.getAngle(), 5.2, jupiter);
        Moons titan = new Moons(saturn.getDiameter(), 310, 5, "#ffc42e", saturn.getDistance(), saturn.getAngle(), 5.2,saturn);
        Moons enceladus = new Moons(saturn.getDiameter() + 5, 112, 5, "#63baca", saturn.getDistance(),saturn.getAngle(), -5.7, saturn);
        Moons mimas = new Moons(saturn.getDiameter() + 10, 257, 5, "#453d3b", saturn.getDistance(), saturn.getAngle(),6.1, saturn);
        Moons titania = new Moons(uranus.getDiameter(), 45, 5, "#b9b0ac", uranus.getDistance(), uranus.getAngle(), 4.9,uranus);
        Moons oberon = new Moons(uranus.getDiameter() + 5, 321, 5, "#8e807b", uranus.getDistance(), uranus.getAngle(),-5.3, uranus);
        Moons cupid = new Moons(uranus.getDiameter() + 10, 174, 5, "#504744", uranus.getDistance(), uranus.getAngle(),4.7, uranus);
        Moons triton = new Moons(neptune.getDiameter(), 45, 5, "#306461", neptune.getDistance(), neptune.getAngle(),4.9, neptune);
        Moons despina = new Moons(neptune.getDiameter() + 5, 221, 5, "#becbd5", neptune.getDistance(),neptune.getAngle(), -5.2, neptune);
        Moons nereid = new Moons(neptune.getDiameter() + 10, 354, 5, "#82909b", neptune.getDistance(),neptune.getAngle(), 5.6, neptune);

        Planets planets[] = new Planets[] { mercury, venus, earth, mars, jupiter, saturn, uranus, neptune };
        Moons moons[] = new Moons[] { earthMoon, phobos, deimos, io, europa, amalthea, titan, enceladus, mimas, titania,oberon, cupid, triton, despina, nereid };

        Asteroids[] kuiperBelt = new Asteroids[150];
        Asteroids[] asteroidBelt = new Asteroids[100];

        Random random = new Random();

        for (int i = 0; i < kuiperBelt.length; i++) {
            int randAngleGenerator = random.nextInt(360 + 1) + 1;
            int randDistanceGenerator = random.nextInt(50 + 1) + 1;
            int randSize = random.nextInt(10 + 1) + 1;
            double randSpeed = random.nextDouble() + 1;
            kuiperBelt[i] = new Asteroids((560 + randDistanceGenerator), randAngleGenerator, randSize, "#6a6262", 0, 0, randSpeed);
        }

        for (int i = 0; i < asteroidBelt.length; i++) {
            int randAngleGenerator = random.nextInt(360 + 1) + 1;
            int randDistanceGenerator = random.nextInt(25 + 1) + 1;
            int randSize = random.nextInt(10 + 1) + 1;
            double randSpeed = random.nextDouble() + 1;
            asteroidBelt[i] = new Asteroids((225 + randDistanceGenerator), randAngleGenerator, randSize, "#6a6262", 0, 0, randSpeed);
        }

        Controls cntrls = new Controls(planets, moons, asteroidBelt, kuiperBelt);
        window.addKeyListener(cntrls);

        while (true) {
            outerSun.updateSun(window);
            mainSun.updateSun(window);

            for (Planets allPlanets : planets) {
                allPlanets.rotate();
                allPlanets.update(window);
            }

            for (Moons allMoons : moons) {
                allMoons.update(window);
                allMoons.rotate();
                allMoons.rotateAround(allMoons.getFatherPlanet());
            }

            for (Asteroids allAsteroids : kuiperBelt) {
                allAsteroids.rotate();
                allAsteroids.update(window);
            }

            for (Asteroids allAsteroids : asteroidBelt) {
                allAsteroids.rotate();
                allAsteroids.update(window);
            }

            window.finishedDrawing();
        }
    }
}