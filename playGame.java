import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playGame extends Actor
{
    public playGame()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 819, image.getHeight() - 773);
        setImage(image);
    }
    /**
     * Act - do whatever the playGame wants to do. This method is called whenever
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
