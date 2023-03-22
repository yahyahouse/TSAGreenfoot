import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pou extends Actor
{
    public pou()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 445, image.getHeight() - 445);
        setImage(image);
    }
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5,getY());
        }
        if(isTouching(apel.class)){
            removeTouching(apel.class);
            play.score.add(1);
        }
        if(isTouching(bom.class)){
            Greenfoot.playSound("gameOver.mp3");
            Greenfoot.setWorld(new gameOver());
        }
    }
}
