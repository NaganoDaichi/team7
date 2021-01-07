import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{
    GreenfootSound sound = new GreenfootSound("op.mp3");
    GreenfootSound sound2 = new GreenfootSound("theme.mp3");
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        sound.play();
        sound.playLoop();
    }
    public void act()
    {
        if( Greenfoot.isKeyDown( "space" ) ){
            sound.stop();
            World game = new Background();
            Greenfoot.setWorld( game );
            //sound2.play();
        }
    }
}
