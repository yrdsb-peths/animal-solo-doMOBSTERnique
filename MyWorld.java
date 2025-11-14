import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 100);
        
        spawnApple();
    }
    
    public void spawnApple()
    {
        Apple apple = new Apple();
        addObject(apple, 300, 0);
    }
}
