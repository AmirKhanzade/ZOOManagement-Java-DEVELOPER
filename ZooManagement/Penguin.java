public class Penguin extends Animal implements Walk,Swim{
    //Create a property isSwimming of boolean type to indicate whether the penguin is swimming or walking.
    // Also, create properties walkSpeed and swimSpeed. Ensure all properties are protected using private.
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin(){
        super("Penguin");
    }

    //Create the setters and getters of the properties.
    // Ensure the getter and setter methods are public so that the properties are accessible indirectly from outside the class.
    public boolean getIsSwimming(){
        return isSwimming;
    }
    public void setIsSwimming(boolean isSwimming){
        this.isSwimming=isSwimming;
    }

    public int getWalkSpeed(){
        return walkSpeed;
    }
    public void setWalkSpeed(int walkSpeed){
        this.walkSpeed=walkSpeed;
    }

    public int getSwimSpeed(){
        return swimSpeed;
    }
    public void setSwimSpeed(int swimSpeed){
        this.swimSpeed=swimSpeed;
    }

    //Ensure that when the default constructor of the Penguin is called
   
    //Implement both the Walk and the Swim interfaces.
    //Override the eatingFood() method and implement the method eatingCompleted() of the Eat interface like the Dolphin class. 
    @Override
    public void eatingFood(){
        System.out.println("Penguin: I am eating delicious fish");
    }
    @Override
    public void eatingCompleted(){
        System.out.println("“I have eaten fish");
    }
    @Override
    public void walking(){
        System.out.println("Pinguin: I am moving at the speed of "+walkSpeed+" mph");
    }
    @Override
    public void swimming(){
        System.out.println("Pinguin: I am swimming at the speed of "+swimSpeed+" nautical miles per hour");
    }
}
