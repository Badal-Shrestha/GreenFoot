import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spipe extends Actor
{   int Speed=4;
    int e;
    /**
     * Act - do whatever the Spipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()- Speed, getY());
        setRotation(180);
         
        
   
    }    
}