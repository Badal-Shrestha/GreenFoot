import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bus extends Actor
{
    /**
     * Act - do whatever the bus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       
     
        
        
         int a= Greenfoot.getRandomNumber(100);
            if( a%3==0)
            {
              move(Greenfoot.getRandomNumber(5));
              turn(Greenfoot.getRandomNumber(40)-Greenfoot.getRandomNumber(40));
            }
            else {
                move(Greenfoot.getRandomNumber(5));
            
            }
           
            
          
       
        
        
        
       Actor car1;
         car1= getOneObjectAtOffset(0,0, car1.class);
         if(car1 !=null)
         {
             World world;
                world= getWorld();
                world.removeObject(car1);
                Greenfoot.playSound("beep.wav");
                Greenfoot.stop();
                System.out.println("Game Over");
            } 
    }    
}
