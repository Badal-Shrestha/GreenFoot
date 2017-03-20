import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * Write a description of class Bullet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet2 extends Actor
{
     int dy=0;
        int g=4; 
        int z=0;
       int q=0;
        
       
    
    public Bullet2(){
     GreenfootImage image= getImage();
        int height= (int)image.getHeight()/8; //decrease the original height by 5 times
        int width = (int)image.getWidth()/8;
        image.scale(width,height);
        
       
    }
    
    /**
     * Act - do whatever the Bullet2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int q=0;
         
        setLocation(getX(),(int)(getY()+dy));
        dy= g;
        
         if (getOneIntersectingObject(Rocket.class) !=null)
         {
             
            
            
                Actor Rocket;
                Rocket= getOneObjectAtOffset(0,0, Rocket.class);
           
        
                if(Rocket!=null)
                {
                                      
                        World world;
                        world= getWorld();
                        world.removeObject(Rocket);
            
                } 
            }
            
            z++;
              q=q+1;
            
            //System.out.println(z);   
           
            }
            
                  
       
          
   
           
    
}
