public class Dolphin extends Animal implements Swim{
   // new child Dolphin class
   // which extends the Animal class named "Dolphin".
   //Create the following properties: color of dolphin and swimming speed.
   private String colorOfDolphin;
   private int speed;

   public Dolphin(){
     super("Dolphin");
   }
   
   //Create the getter and setter methods for 
   //all the properties.  Ensure getter and setter methods are public so that the properties 
   //are accessible indirectly from outside the class.
   public String getColor(){
        return colorOfDolphin;
   }
   public void setColor(String colorOfDolphin){
        this.colorOfDolphin=colorOfDolphin;
   }

   public int getSpeed(){
        return speed;
   }
   public void setSpeed(int speed){
        this.speed=speed;
   }


   @Override
   public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious fish");
   }
   @Override
   public void eatingCompleted(){
        System.out.println("“I have eaten fish");
   }

   @Override
   public void swimming(){
        System.out.println("Dolphin: I am swimming at the speed of "+speed+" nautical miles per hour");
   }

}
