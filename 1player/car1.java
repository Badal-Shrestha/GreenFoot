import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car1 extends Actor
{
    
    score scoreObj= null;
    int count=0;
    int Scorecount=0;
 
    /**
     * Act - do whatever the car1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
          int R= Greenfoot.getRandomNumber(900);
          int R2= Greenfoot.getRandomNumber(500);
          
         if (Greenfoot.isKeyDown("w")){
            
        move(10);
                }
        if (Greenfoot.isKeyDown("s")){
            
        move(-10);
                }
        if (Greenfoot.isKeyDown("d")){
            
        turn(10);
                }
        if (Greenfoot.isKeyDown("a")){
            
        turn(-10);
                }
                
         Actor boost;
         boost= getOneObjectAtOffset(0,0,boost.class);
         if (boost != null){
             
             if (getOneIntersectingObject(boost.class) !=null){
                boost bst =new boost();
                getWorld().addObject(bst, getWorld().getWidth()-R,getWorld().getHeight()-R2);
                   Scorecount++;
                   System.out.println(Scorecount);
                   //setscore(Scorecount);
              //if (count <=3){
                bus buses = new bus();
                getWorld().addObject(buses, getWorld().getWidth()-R,getWorld().getHeight()-R2);
                count= count+1;
           // }
            
            }
             
            World world;
            world= getWorld();
            world.removeObject(boost);
          
            
            //System.out.println(scorecount);
            
               
            }
           
         
    }    
}
