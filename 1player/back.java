import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends World
{
    score scoreObj= null;
    
    /**
     * Constructor for objects of class back.
     * 
     */
    public back()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
        boost bst = new boost();
        addObject(bst, 855, getHeight()/2);
        
        scoreObj= new score();
        scoreObj.setscore(0);
        addObject(scoreObj,100,100); 
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        car1 car1 = new car1();
        addObject(car1,40,375);
        bus bus = new bus();
        addObject(bus,781,259);
        
       
    }
}
