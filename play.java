import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends World
{
    static Counter score = new Counter("score");
    /**
     * Constructor for objects of class play.
     * 
     */
    public play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        pou pou = new pou();
        addObject(pou,138,469);
        
        addObject(score,50,25);
        score.setValue(0);
    }
    public void act(){
        if(Greenfoot.getRandomNumber(500)<3){
            addObject(new apel(),Greenfoot.getRandomNumber(1000),1);
        }
        if(Greenfoot.getRandomNumber(500)<3){
            addObject(new bom(),Greenfoot.getRandomNumber(1000),1);
        }
        
    }
}
