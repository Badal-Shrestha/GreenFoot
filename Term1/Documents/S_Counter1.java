import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt. *;
/**
 * Write a description of class S_Counter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class S_Counter1 extends Actor
{
    int point=0;
    /**
     * Act - do whatever the S_Counter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("Score : " + point, 24, Color.RED, Color.WHITE));
        getImage().setTransparency(50);
    }    
    
    public void addpoint(){
        point++;
    }
    
    
}
