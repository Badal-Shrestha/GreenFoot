import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    S_Counter1 pointer =new S_Counter1();
    S_Counter2 pointer2 =new S_Counter2();
    ball1 changeLoc= new ball1();
     int add=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //this chunck of code should not be changes and MUST be included
        //in your solution
        super(600, 400, 1);
       
      
    
        for (int loop=0; loop<20; loop=loop+1)
        {
            addObject(new barrier(), 300, 20*loop);
        }
        addObject(new baby1(), 150, 200);
        addObject(new baby2(), 450, 200);
        //End of code that must be included in your solution
        
        addObject(new ball1(), 200,200);
        
       
       /* Intermidiate intermidiate= new Intermidiate();
        Greenfoot.setWorld(intermidiate);*/
        
    }
    
    public S_Counter1 getS_Counter1()
    {
        return pointer;
    }
    
    public S_Counter2 getS_Counter2()
    {
        return pointer2;
    }
    
    public ball1 getball1(){
        return changeLoc;
    }
   
    public void act()
    {
        remove();
        if(Greenfoot.isKeyDown("space"))
        {
           GreenfootImage background = new GreenfootImage("intermidiate.jpg");
            setBackground(background);
            add= add+1;
         
          
        }
        if (add==1){
            addObject(new baby1(), 50, 60);
            addObject(new baby1(), 50, 350); 
            addObject(new baby2(), 550, 60);
            addObject(new baby2(), 550, 3500);
            addObject(pointer, 55,18);
            addObject(pointer2,540,18);
        }
                  
    }
 
    public  void remove(){
        if (Greenfoot.isKeyDown("enter")){
        removeObjects(getObjects(Winner.class));
        removeObjects(getObjects(Winner2.class));
        }
    }
    
}
