import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby2 extends Actor
{
    int vert_up_speed=-5;
    int dy=0;
    int vert_down_speed=5;
    int count=0;
    int count2=0;
    int a=0;
    int lvl_advance=0;
    int s=0;

    public void act() 
    {
        keyCheck();
       
        if (Greenfoot.isKeyDown("space")){
           a=1;
         
        }
        
        if(a==1)
        {
            if(getY()==0){
            count++;
             
           }
        
          if(count>1){
              setLocation(getX(),getY()+dy);
            dy=vert_down_speed;
             count2=0;
          }
       
           else{
              setLocation(getX(),getY()+dy);
            dy=vert_up_speed;
           
          }
        
          if ( getY()>=399){
            count2++;
            count=0;
              
          }
          if (count2>1){
            dy=0;
            setLocation(getX(),getY()+dy);
            dy=vert_up_speed;
            
           
          }
        }
          
       
            
       
    }
       
    
     public void setLocation(){
        setLocation(getX(),getY()+dy);
    }
    
    public void keyCheck(){
        if (Greenfoot.isKeyDown("enter")){
            lvl_advance=1;
        }
        
        if(lvl_advance==1){
             int vert_up_speed=-7;
             int vert_down_speed=7;
             checkTouch();
           
        }
        
    }
    
       
    public void hitBaby(){
         GreenfootSound baby= new GreenfootSound("baby2.wav");
         baby.play();
         baby.setVolume(80);
    }
    
  public void checkTouch(){
      Actor ball1= getOneIntersectingObject(ball1.class);
      if (ball1 !=null){
            hitBaby();
           
        }
    }
     
   }     
            
    
    
    
      
     
            
        
        
        
    
  