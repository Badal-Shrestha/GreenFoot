import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Actor
{
    int addOb=0;
     public Enemy2(){
     GreenfootImage image= getImage();
        int height= (int)image.getHeight()/3; //decrease the original height by 5 times
        int width = (int)image.getWidth()/3;
        image.scale(width,height);
        setRotation(180);
    }
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int l= Greenfoot.getRandomNumber(300);
            int a= getX();
       int b= getY();

       addOb++;
       
       if(addOb % 50 == 1)
       {
        Bullet2 bullet2= new Bullet2();
        getWorld().addObject(bullet2,a,b);
        Greenfoot.delay(2);

        
       }
      move(-2);

      if (getX()>getWorld().getWidth())
      {   
         //move(-3);
          setLocation(a-500,l);
      }
    }    
}
