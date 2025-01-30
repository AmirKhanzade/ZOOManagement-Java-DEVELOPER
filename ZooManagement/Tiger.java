public class Tiger extends Animal implements Walk {
    // new child class Tiger
    // that extends the Animal class named "Tiger". 
    //Create the following properties: 
    //number of stripes, speed, and 
    //sound level of roar. 
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public Tiger(){
        super("Tiger");
    }

    //Create the getter and setter methods for 
    //all the properties
    public int getNumber(){
        return numberOfStripes;
    }
    public void setNumber(int numberOfStripes){
        this.numberOfStripes=numberOfStripes;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

    public int getSound(){
        return soundLevelOfRoar;
    }
    public void setSound(int soundLevelOfRoar){
        this.soundLevelOfRoar=soundLevelOfRoar;
    }
    //Ensure that the default constructor of the Tiger class calls 
    //the single-argument constructor of the parent class
    @Override
    public void eatingCompleted(){
        System.out.println("Tiger: I have eaten meat");
    }

    // the Tiger class implement the walking functionality of the Walk interface.
    @Override
    public void walking(){
        System.out.println("Tiger: I am moving at the speed of "+speed+" mph");
    }



}
