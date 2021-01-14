import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    int All_width=100;
    int width=21;
    int height=14; //高さは14で固定
    int WIDTH=600,HEIGHT=400;
    int p=30;//拡大倍率
    int n=5;//移動単位
    int[][] map = new int[height][All_width];
    int flag;
    int offset;
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        offset=100;
        for(int i=0;i<height;i++){
            for(int j=0;j<All_width;j++){
                if(i<10) map[i][j]=0;
                else    map[i][j]=1;
                
                if(j%5==3)  map[9][j]=1;
                
                if(map[i][j]==0)    addObject(new back(p),j*p,i*p);
                if(map[i][j]==1)    addObject(new block(p),j*p,i*p);
            }
        }
        offset_update();
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("right")){
            //charactor move lef n
            offset+=n;
            offset_update();
        }
        if(Greenfoot.isKeyDown("left")){
            //charactor move rig n
            offset-=n;
            offset_update();
            
        }
        if(Greenfoot.isKeyDown("up")){
            //offset_update();
            
        }
        if(Greenfoot.isKeyDown("down")){
            //offset_update();
            
        }
    }
        
    public void offset_update(){
        int move = width/2;
        //if(offset<width*p/2)  offset=width*p/2;
        //else if(offset>(All_width-width/2)*p) offset=(All_width-width/2)*p;
        /*
        for(int i=0;i<height;i++){
            for(int j=offset-move;j<offset+move;j++){
                int k=0;
                switch(map[i][j]){
                    case 1:
                        addObject(new block(p),k*p,i*p);
                        break;
                    case 0:
                        addObject(new back(p),k*p,i*p);
                        break;
                }
                k++;
            }
        }*/
    }
    
    
}
