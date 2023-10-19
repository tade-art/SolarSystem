import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

/**
 * This class contains all the controls which can be called upon in other classes
 * @author Tadas Ivanauskas
 */

public class Controls extends KeyAdapter{
    Planets[] planetArr = null;
    Moons[] moonArr = null;

    /**
     * Constructor Method
     * @param newPlanets The array of planets in the solar system
     * @param newMoons The array of moons which are orbiting planets
     */
    public Controls(Planets[] newPlanets, Moons[] newMoons){
        this.planetArr = newPlanets;
        this.moonArr = newMoons;
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
    }
}
