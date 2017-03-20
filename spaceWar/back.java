import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends World
{
    double h=1.1;
    int R1 = Greenfoot.getRandomNumber(100);
  
    /**
     * Constructor for objects of class back.
     * 
     */
    public back()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600,1,false); 
        prepare();
        Rocket rocket =new Rocket();
        addObject(rocket,getWidth()/2,(int)(getHeight()/ h)); 
        
        Enemy1 enemy= new Enemy1();
        addObject(enemy,getWidth()/2-R1,getHeight()/4);
        
        Enemy2 enemy2= new Enemy2();
        addObject(enemy2,getWidth()-550,getHeight()/5);
        
       
       
         
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

     
        Enemy1 enemy12 = new Enemy1();
        addObject(enemy12,532,140);
        enemy12.setLocation(532,149);
    }
}
