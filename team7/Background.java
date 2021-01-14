import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    GreenfootSound sound2 = new GreenfootSound("theme.mp3");
    //GreenfootSound sound3 = new GreenfootSound("ed.mp3");
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new fish3(), 100,200);
        addObject(new weed(), 400,200);
        sound2.play();
        sound2.playLoop();
    }
    /*public void act()
{
    if( Greenfoot.isKeyDown( "enter" ) ){
        sound2.stop();
        World game = new End();
        Greenfoot.setWorld( game );
        //sound3.play();
    }
}*/
}
