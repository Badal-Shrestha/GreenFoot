import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    int dy=0;
    int g=4;
    int up_speed=-4;
   
     int addOb=0;
    public Rocket(){
      GreenfootImage image= getImage();
        int height= (int)image.getHeight()/3; //decrease the original height by 3 times
        int width = (int)image.getWidth()/3;
         image.scale(width,height);
     
    }
       
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       GreenfootImage image= getImage();
       int a= getX();
       int b= getY();
       
       if (Greenfoot.isKeyDown("up")){
           setLocation(getX(),getY()+dy);
       dy= up_speed;
    }  
     if (Greenfoot.isKeyDown("down")){
          setLocation(getX(),getY()+dy);
    dy=g;
}
         
         if(Greenfoot.isKeyDown("right")){
         move(4);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-4);
        }  
        
        addOb++;
        
        if(addOb % 20 == 0){
        if(Greenfoot.isKeyDown("space")){
            Bullet bullet= new Bullet();
            getWorld().addObject(bullet,a,b);
             
        }
        
    } 
   
   } 
  }

