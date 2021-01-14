import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple extends Actor
{
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int m = 5;//移動単位
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(m);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(0);
            move(-m);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(90);
            move(-m);
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(m);
            setRotation(0);
        }
        
    }
    
    
}
