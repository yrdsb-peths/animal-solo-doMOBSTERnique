import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Dominique 
 * @version November 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("The Elephant" , 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,366,87);
        elephant.setLocation(392,112);
        elephant.setLocation(338,99);
        elephant.setLocation(422,113);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,178,252);
        label.setLocation(231,335);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,200,239);
        elephant.setLocation(508,137);

        label2.setLocation(308,234);

        label.setLocation(313,302);

        elephant.setLocation(463,121);
    }
}
