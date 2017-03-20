import greenfoot.*; 
import java.awt.Color;
import java.awt. Font; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public score()
    {
        GreenfootImage newImage= new GreenfootImage(100,50);
        setImage(newImage);
    }
    
    public void setscore(int Scorecount){
    GreenfootImage newImage= getImage();
    newImage.clear();
    Font f= new Font("Liberation Serif",Font.PLAIN,50);
    Color c= new Color(127,127,127,127);
    newImage.fill();
    newImage. setColor(Color.red); 
    newImage.drawString(""+ Scorecount,30,30);
    setImage(newImage);
    } 
}