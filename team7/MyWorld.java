import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld. 
     */

    
    public MyWorld(){
        super(600,400,1);
        
        
        //addObject(new apple(), offset, 100);
        //addObject(new apple(), 200, 100);
    }
    
    /*
    public void act(){
        if( Greenfoot.isKeyDown( "enter" ) ){
            World play = new WorldPlay();
            Greenfoot.setWorld( play );
        }
    }*/
    public void act(){
        
        
        
        if( Greenfoot.isKeyDown( "enter" )){
            World game = new Game();
            Greenfoot.setWorld(game);
        }
    }
    
   
}