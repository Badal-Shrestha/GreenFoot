import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends World
{
    int counter= 0;
    
    int R;
    
    /**
     * Constructor for objects of class back.
     * 
     */
    public back()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        
         ace Ace=new ace();
        addObject(Ace,100, getHeight()/2);
        
       
        
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act(){
            R = Greenfoot.getRandomNumber(150);
            counter ++;
            if (counter == 100){
               Pipe pippy= new Pipe();
                  GreenfootImage image= pippy.getImage();
              addObject(pippy,getWidth(), getHeight()/2+ (int)(image.getHeight()/2)+ R);
              
            
              Spipe spippy= new Spipe();
              GreenfootImage simage= spippy.getImage();
              addObject(spippy, getWidth(),getHeight()/2- (int)(image.getHeight()/2) - 150 +R);
             
              
              counter= 0; 
              
            }
          
           
       
    }
    
}
