import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball1 extends Actor
{
     // int baby1_point=0; /* Variable to store point of baby1 */
    //  int baby2_point=0; /* Variable to store point of baby2 */
      int a=0;
      int baby1_P=0;
      int baby2_P=0;
      int declare=0;
      int declare2=0;
      int advance_jump=0;
      int x;
     // int s=8;
 
     
    /*
     * Act - do whatever the ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          declare_winner();
          advance_mode();
          gameover();
          check();
      
         
         Actor baby_1 = getOneIntersectingObject(baby1.class); /* It detect  if baby_1 intersect with ball*/
           if (baby_1!=null)
           {
               turn(180);
               move(5);
            }
         Actor baby_2 = getOneIntersectingObject(baby2.class);
            if (baby_2!=null)
           {
               turn(180);
               
               move(5);
           }
        
        
           if (Greenfoot.isKeyDown("space")){
            a=1;
           }
        
            if(a==1){
           isWorldEnd();
           touching_baby1();
          
                               
          }
       
          if (baby1_P==5 || baby2_P==5){
              move(0);
              advance_mode();
          }
          
          else{
             speed();
             }  
         
        
    }
   
    public void touching_baby1(){
         Actor baby_1 = getOneIntersectingObject(baby1.class);
            if (baby_1!=null)
                {
                    turn((Greenfoot.getRandomNumber(180)));
                    move(5);
                 }
        Actor baby_2 = getOneIntersectingObject(baby2.class);
            if (baby_2!=null)
           {
                
               turn((Greenfoot.getRandomNumber(360)));
             
               move(5);
           }
    }
    public void isWorldEnd(){ //code for reflection of ball on wall
        if(getY() <= 5)
          {
           
              if(getRotation() < 270){
                setRotation(135); 
            }
            if(getRotation() >= 270){
                setRotation(45);
            }
          }
        if(getY() >= 390){
            if(getRotation() >= 90){
                setRotation(225);
            }
            if(getRotation() < 90){
                setRotation(315); 
            }
         
        }

        if( getX() <= 5){
            if(getRotation() >= 180){
                setRotation(315);
            }
            
            if(getRotation() < 180){
                setRotation(45);
            }
            b2point();
            setLocation(400,200);
            Greenfoot.delay(10);
            move(-5);
            baby2_P++;
        }
        if(getX() >= 595){

           if(getRotation() >= 270){
               setRotation(225);
            }
           if(getRotation() < 90){
               setRotation(135);
            }
          b1point();
          setLocation(200,200);
          Greenfoot.delay(10);
          baby1_P++;
          
          
        }
        
       
    } 
    
    public void b1point(){
        World world= getWorld();
        MyWorld myWorld = (MyWorld)world;
        S_Counter1 pointer= myWorld.getS_Counter1(); 
        pointer.addpoint();
        
        
        
    }
    
    public void b2point(){
        World world= getWorld();
        MyWorld myWorld2 = (MyWorld)world;
        S_Counter2 pointer2= myWorld2.getS_Counter2();
        pointer2.addpoint2();
    }
   
   public void declare_winner(){
       if (baby1_P==5 && baby1_P> baby2_P){
            declare++;
           if(declare==1){               
               addObj();
               
           }
          
            
        }
        
       if (baby2_P==5 && baby2_P> baby1_P){
            declare2++;
            if(declare2==5){
                 addObj();
                 
            }
            
          
       } 
      
   }
   
   public void gameover(){
       if (baby1_P==10 && baby1_P > baby2_P){
           addObj2();
           winnerSound();
           
           Greenfoot.stop();
         
           
        }
       
       if (baby2_P==10 && baby2_P > baby1_P){
           addObj3();
           loseSound();
           Greenfoot.stop();
        }
    }
   public void speed(){
       move(5);
    }
 
    public void addObj(){
        Winner winner= new Winner();
        if(declare==1){
            getWorld().addObject(winner,getWorld().getWidth()/2,getWorld().getHeight()/2);
        }
        else{
            Winner2 winner2= new Winner2();
            getWorld().addObject(winner2,getWorld().getWidth()/2,getWorld().getHeight()/2);
        }
     
    }
   
    public void addObj2(){
        Winner1 winner1 = new Winner1();
        getWorld().addObject(winner1,getWorld().getWidth()/2,getWorld().getHeight()/2);
    }
    
    public void addObj3(){
        Lose lose= new Lose();
        getWorld().addObject(lose,getWorld().getWidth()/2,getWorld().getHeight()/2);
    }
    public void advance_mode(){
        if (Greenfoot.isKeyDown("enter")){
            advance_jump=1;
             
        }
        if (advance_jump==1){
            move(6);
             if(getY()<=5 || getY()>=390){
                 GreenfootSound wall = new GreenfootSound("Wall.wav");
                 wall.play();
                 wall.setVolume(60);
           }
           
        }
        
       
    }
    
    public void winnerSound(){
         GreenfootSound winnerS= new GreenfootSound("win.wav");
         winnerS.play();
    }
    
    public void loseSound(){
        GreenfootSound loser= new GreenfootSound("loose.wav");
        loser.play();
    }
    public void hitWall(){
        if(getY()<=5 || getY()>=390){
            GreenfootSound wall = new GreenfootSound("Wall.wav");
            wall.play();
           
        }
       
    }
    
    public void check(){
     x= baby1_P;
    
    }
    
}
        