import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{   
    int dy=0;
    int up=-10;
    int R1=Greenfoot.getRandomNumber(100);
    
    
    public Bullet(){
     GreenfootImage image= getImage();
        int height= (int)image.getHeight()/7; //decrease the original height by 5 times
        int width = (int)image.getWidth()/7;
        image.scale(width,height);
        
       
    }
       
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(),(int)(getY()+dy));
         dy= up;
         
         Actor Enemy1;
         Enemy1= getOneObjectAtOffset(0,0, Enemy1.class);
         if(Enemy1 !=null)
         {
                Enemy1 enemy= new Enemy1();
                getWorld().addObject(enemy,getWorld().getWidth()/2-R1,getWorld().getHeight()/4);
                
                World world;
                world= getWorld();
                world.removeObject(Enemy1);
              
            } 
            
        Actor Enemy2;
         Enemy2= getOneObjectAtOffset(0,0, Enemy2.class);
      
         if(Enemy2 !=null)
         {
             
                 
            
                World world;
                world= getWorld();
                world.removeObject(Enemy2);
                
            
              
              
            } 
             
                  
               
          
         
         int a= getY();
         if (a>getWorld().getHeight()){
             Actor Bullet;
             Bullet= getOneObjectAtOffset(0,0,Bullet.class);
               World world;
                world= getWorld();
                world.removeObject(Bullet);
            }
        
             
    }    
   
}
