import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mob extends Actor
{
    /**
     * Act - do whatever the mob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound sound2 = new GreenfootSound("theme.mp3");
    public void act() 
    {
        
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")){
            // 左キーが押された時は 180度を向いて移動する
            setRotation(180);
            move(4);
        }
        if (Greenfoot.isKeyDown("right")){
            // 右キーが押された時は 0度を向いて移動する
            setRotation(0);
            move(4);
        }
        if (Greenfoot.isKeyDown("up")){
            // 上キーが押された時は 270度を向いて移動する
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("down")){
        setRotation(90);
        move(4);
        }
        
        Actor weed;
        weed = getOneObjectAtOffset(0,0,weed.class);
        if(weed != null){
            /*World world;
            world = getWorld();
            world.removeObject(weed);*/
            
            sound2.stop();
            World game = new End();
            Greenfoot.setWorld( game );
                //sound3.play();
            }
        }    
}

