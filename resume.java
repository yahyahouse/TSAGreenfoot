import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class resume here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class resume extends Actor
{
    public resume()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 25, image.getHeight() - 25);
        setImage(image);
    }
    /**
     * Act - do whatever the resume wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            Greenfoot.start();
        }
    }
}
