import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom extends Actor
{
    public bom()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 15, image.getHeight() - 15);
        setImage(image);
    }
    /**
     * Act - do whatever the Bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()+1);
        if(isAtEdge()){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        }
    }
}
