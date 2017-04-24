import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby1 extends Actor
{
    int dy=0;
    int up_speed= -3;
    int g=3;
    int a=0;
    int select=0;
    int s=0;
    int b;
      /**
     * Act - do whatever the baby1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        advancelvl();
        point();
       
        if(Greenfoot.isKeyDown("space")){
            a=1;
        }
        if (a==1){
            if (Greenfoot.isKeyDown("1")){
               select=1;
            }
            if (Greenfoot.isKeyDown("2")){
               select=0;
            }
            if (Greenfoot.isKeyDown("3")){
               select=2;
            }
        }          
     
       
        if(select==0 || select==2 || select==1){
             
            Actor getbaby=((baby1) getWorld().getObjects(baby1.class).get(select));
            if (Greenfoot.isKeyDown("up")){
            getbaby.setLocation(getbaby.getX(), getbaby.getY()-3);
             checkTouch();
            }
            else if (Greenfoot.isKeyDown("down")){
              getbaby.setLocation(getbaby.getX(), getbaby.getY()+3);
              
            }
        
        }
  }
    
  public void setLocation(){
        setLocation(getX(),getY()+dy);
     }
    
    public void advancelvl(){
        if(Greenfoot.isKeyDown("enter")){
           s=1;
        }
        if (s==1){
           checkTouch();
        }
    }
    
  public void checkTouch(){
      Actor ball1= getOneIntersectingObject(ball1.class);
      if (ball1 !=null){
          hitBaby();
        }
    }
     public void hitBaby(){
         GreenfootSound baby= new GreenfootSound("baby.wav");
         baby.play();
         baby.setVolume(80);
    }
      public void point(){
        World world= getWorld();
        MyWorld myWorld = (MyWorld)world;
        ball1 changeLoc= myWorld.getball1(); 
        //changeLoc.check();
        b= changeLoc.x;
        System.out.println(b);
        
        
        
        
        
        
        
    }
}
