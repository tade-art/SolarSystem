import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

/**
 * This class contains all the controls which can be called upon in other classes
 * @author Tadas Ivanauskas
 */

public class Controls extends KeyAdapter{
    Planets[] planetArr = null;
    Moons[] moonArr = null;
    Asteroids[] kuiperArr = null;
    Asteroids[] asteroidsArr = null;

    /**
     * Constructor Method
     * @param newPlanets The array of planets in the solar system
     * @param newMoons The array of moons which are orbiting planets
     * @param asteroids The array for the asteroid belt
     * @param kuiper The array for the kuiper belt
     */
    public Controls(Planets[] newPlanets, Moons[] newMoons, Asteroids[] asteroids , Asteroids[] kuiper){
        this.planetArr = newPlanets;
        this.moonArr = newMoons;
        this.asteroidsArr = asteroids;
        this.kuiperArr = kuiper;
    }
    
    /**
    * Method which is called upon when a key is pressed (implemented using KeyAdapter)
    * @param e The KeyEvent which is used to decide what to execture 
    */
    public void keyPressed(KeyEvent e) {        
        if(e.getKeyCode() == KeyEvent.VK_UP){
            speedUp();           
        }
            
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            slowDown();
        }
    }
    
    /**
     * Method to increase all rotation speeds by a factor of 2
     */
    public void speedUp(){
        
        for (Planets allPlanets : planetArr){
                allPlanets.setRotatationSpeed(allPlanets.getRotationSpeed() * 2);
        }
        
        for(Moons allMoons : moonArr){
                allMoons.setRotatationSpeed(allMoons.getRotationSpeed() * 2);
        }

        for(Asteroids allAsteroids : asteroidsArr){
                allAsteroids.setRotatationSpeed(allAsteroids.getRotationSpeed() * 2);
        }

        for(Asteroids allAsteroids : kuiperArr){
                allAsteroids.setRotatationSpeed(allAsteroids.getRotationSpeed() * 2);
        }
    }

    /**
     * Method to decrease all rotation speeds by a factor of 2
     */
    public void slowDown(){
        
        for (Planets allPlanets : planetArr){
                allPlanets.setRotatationSpeed(allPlanets.getRotationSpeed() / 2);
        }            
        
        for(Moons allMoons : moonArr){
                allMoons.setRotatationSpeed(allMoons.getRotationSpeed() / 2);
        } 
        
        for(Asteroids allAsteroids : asteroidsArr){
                allAsteroids.setRotatationSpeed(allAsteroids.getRotationSpeed() / 2);
        }
        
        for(Asteroids allAsteroids : kuiperArr){
                allAsteroids.setRotatationSpeed(allAsteroids.getRotationSpeed() / 2);
        }        
    }
}
