public abstract class Animal implements Eat{
    //property represent the name of the animal
    private String nameOfAnimal;

    //property represent weight
    private int weight;

    //property represent height
    private int height;

    //propert represent the age
    private int age;

    //defult constructor
    public Animal(){
        nameOfAnimal="Unknown";
    }

    //user given input Constructor
    public Animal(String nameOfAnimal){
        this.nameOfAnimal=nameOfAnimal;
    }

    //defining the setter and getter methodes
    //we have to do this while our proiperties private
    public String getNameOfAnimal(){
        return nameOfAnimal;
    }
    public void setNameOfAnimal(String nameOfAnimal){
        this.nameOfAnimal=nameOfAnimal;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }

    //it is time to implement ,abstracted methodes
    @Override
    public void eatingFood(){
        System.out.println("This animal "+
        nameOfAnimal+" is eating");
    }



}