import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{
    GreenfootSound sound3 = new GreenfootSound("ed.mp3");
    GreenfootSound sound = new GreenfootSound("op.mp3");
    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        sound3.play();
        //sound3.playLoop();
    }
    public void act()
    {
        if( Greenfoot.isKeyDown( "q" ) ){
            sound3.stop();
            World game = new Title();
            Greenfoot.setWorld( game );
            //sound.play();
        }
    }
}
