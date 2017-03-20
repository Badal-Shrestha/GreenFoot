import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ace extends Actor

{   double dy=0;
    double g= 0.55;
    double BOOST_SPEED= -6.5;
    public ace()
    {
        GreenfootImage image= getImage();
        int height= (int)image.getHeight()/16; //decrease the original height by 5 times
        int width = (int)image.getWidth()/16;
        image.scale(width, height);
        
        
    }
    /**
     * Act - do whatever the ace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      setLocation(getX(), (int)(getY()+ dy));
     if (getOneIntersectingObject(Pipe.class) !=null){
       displayGameOver();
    }
    
         if (getOneIntersectingObject(Spipe.class) !=null){
       displayGameOver();
    } 
            if(Greenfoot.isKeyDown("up"))
      {
     
          dy=BOOST_SPEED;
             
      }  
     
      
              
      if (getY()> getWorld().getHeight())
      {
         displayGameOver();
        }
      dy= dy+g; 
      
      
      }  
      private void displayGameOver(){
          Gameover gameover= new Gameover();
          getWorld().addObject(gameover,getWorld().getWidth()/2,getWorld().getHeight()/2);//Display Gameover image in middle of screen
         Greenfoot.stop(); 
          }
}           
  