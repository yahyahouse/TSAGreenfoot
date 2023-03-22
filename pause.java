import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pause extends Actor
{
    public pause()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 220, image.getHeight() - 220);
        setImage(image);
    }
    /**
     * Act - do whatever the Pause wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            Greenfoot.delay(100000);
        }
    }
}
