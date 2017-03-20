import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Actor
{
    int move=0;
    int addOb=0;
    public Enemy1(){
     GreenfootImage image= getImage();
        int height= (int)image.getHeight()/7; //decrease the original height by 5 times
        int width = (int)image.getWidth()/7;
        image.scale(width,height);
        setRotation(180);
    }
    
    
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
      {
        // Add your action code here.
        int r= Greenfoot.getRandomNumber(10);
        int a= getX();
       int b= getY();

       addOb++;
       
       if(addOb % 45 == 2)
       {
        Bullet2 bullet2= new Bullet2();
        getWorld().addObject(bullet2,a,b);
        Greenfoot.delay(2);

        
       }
      move(-3);

      if (getX()>getWorld().getWidth())
      {   
         //move(-3);
          setLocation(10,100);
      }
       
    
    }
}