import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tryAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tryAgain extends Actor
{
    public tryAgain()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 550, image.getHeight() - 550);
        setImage(image);
    }
    /**
     * Act - do whatever the tryAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            Greenfoot.delay(3);
            Greenfoot.setWorld(new play());
        }
    }
}
