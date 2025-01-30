import java.util.Scanner;
public class Main {

    private static int animalChoiceMenu(Scanner input){
        int choiceGivenbyUser;
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenbyUser = input.nextInt();
        return choiceGivenbyUser; //it will return an integer number between 1 or 2
    }

    private static int animalDetailsManipulationMenu(Scanner input,Animal animal){
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = input.nextInt();
        return choiceGivenByUser;
    }
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        //for getting user input
        Scanner input=new Scanner(System.in);

        //for loop continution
        //1 represent true
        int continueOuterloop=1;
        int continueInnerloop=1;

        //for menu choice
        int menuChoice=1;


        //task8
        do {
            switch (animalChoiceMenu(input)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : "+tiger.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(input, tiger);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter speed:");
                                tiger.setSpeed(input.nextInt());
                                System.out.println("Enter number of Stripes");
                                tiger.setNumber(input.nextInt());
                                System.out.println("Enter sound level of roar");
                                tiger.setSound(input.nextInt());
                                System.out.println("Enter Age : ");
                                tiger.setAge(input.nextInt());
                                System.out.println("Enter weigth");
                                tiger.setWeight(input.nextInt());
                                System.out.println("Enter height");
                                tiger.setHeight(input.nextInt());
                                break;

                            case 2:
                                System.out.println("Age: " + tiger.getAge());
                                System.out.println("Height: " + tiger.getHeight());
                                System.out.println("Weight: " + tiger.getWeight());
                                System.out.println("Speed: "+tiger.getSpeed());
                                System.out.println("Sound level of roar: "+tiger.getSound());
                                System.out.println("Number of Stripes: "+tiger.getNumber());
                                
                                break;
                            case 3:
                                tiger.walking();
                                break;
                            case 4:
                                tiger.eatingFood();
                                tiger.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerloop = input.nextInt();
                    } while(continueInnerloop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : "+dolphin.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(input, dolphin);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter speed:");
                                dolphin.setSpeed(input.nextInt());
                                System.out.println("Enter Age : ");
                                dolphin.setAge(input.nextInt());
                                System.out.println("Enter weigth");
                                dolphin.setWeight(input.nextInt());
                                System.out.println("Enter height");
                                dolphin.setHeight(input.nextInt());
                                System.out.println("Enter the color : ");
                                dolphin.setColor(input.nextLine());
                                break;

                            case 2:
                                System.out.println("Age: " + dolphin.getAge());
                                System.out.println("Height: " + dolphin.getHeight());
                                System.out.println("Weight: " + dolphin.getWeight());
                                System.out.println("Speed: "+dolphin.getSpeed());
                                System.out.println("Color : "+dolphin.getColor());
                                break;
                            case 3:
                                dolphin.swimming();
                                break;
                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerloop = input.nextInt();
                    } while(continueInnerloop== 1);
                    break;
                case 3:
                do {
                    System.out.println("The animal which is chosen is : "+penguin.getNameOfAnimal());
                    int user_choice;
                    System.out.println("your Penguin is walking or swimming ");
                    System.out.println("1 for walking / 2 for swimming");
                    user_choice=input.nextInt();
                    // get menu choice
                    menuChoice = animalDetailsManipulationMenu(input, penguin);
                    switch (menuChoice) {
                        case 1:
                            switch(user_choice){
                                case 1:
                                    System.out.println("Enter Speed : ");
                                    penguin.setWalkSpeed(input.nextInt());
                                    System.out.println("Enter weight : ");
                                    penguin.setWeight(input.nextInt());
                                    System.out.println("Enter Age : ");
                                    penguin.setAge(input.nextInt());
                                    System.out.println("Enter height : ");
                                    penguin.setHeight(input.nextInt());
                                    System.out.println("your Penguin is not swimming");
                                    penguin.setIsSwimming(false);
                                    break;
                                case 2:
                                    System.out.println("Enter Speed : ");
                                    penguin.setSwimSpeed(input.nextInt());
                                    System.out.println("Enter weight : ");
                                    penguin.setWeight(input.nextInt());
                                    System.out.println("Enter Age : ");
                                    penguin.setAge(input.nextInt());
                                    System.out.println("Enter height : ");
                                    penguin.setHeight(input.nextInt());
                                    System.out.println("your Penguin is not swimming");
                                    penguin.setIsSwimming(true);
                                    break;
                            }
                            break;

                        case 2:
                            switch(user_choice){
                                case 1:
                                    System.out.println("Age: " + penguin.getAge());
                                    System.out.println("Height: " + penguin.getHeight());
                                    System.out.println("Weight: " + penguin.getWeight());
                                    System.out.println("Speed: "+penguin.getWalkSpeed());
                                    break;
                                case 2: 
                                    System.out.println("Age: " + penguin.getAge());
                                    System.out.println("Height: " + penguin.getHeight());
                                    System.out.println("Weight: " + penguin.getWeight());
                                    System.out.println("Speed: "+penguin.getSwimSpeed());
                                    break;
                            

                            }
                            break;
                        case 3:
                            switch(user_choice){
                                case 1:
                                    penguin.walking();
                                    break;
                                case 2:
                                    penguin.swimming();
                                    break;
                                
                            }
                            break;
                        case 4:
                            penguin.eatingFood();
                            penguin.eatingCompleted();
                            break;
                        default:
                            System.out.println("Not supported");

                    }
                    System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                    continueInnerloop = input.nextInt();
                } while(continueInnerloop== 1);
                break;
                    

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterloop = input.nextInt();

        } while(continueOuterloop == 1);
        

    }
}
