//Name: Aelinia Enquist
//Last Updated: 10/21/24 11:10 pm
//Project Name: Zookeeper Task 3


import java.io.File;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zookeeper {
    public static String animal; //creates the variable animal
    public static LocalDateTime unformattedTime = LocalDateTime.now(); //gets time
    public static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    public static String time = unformattedTime.format(timeFormatter); //creates the time variable
    public static void main(String[] args) {
        
        System.out.println("Zoo located in Suva, Fiji"); //convineint way to avoid changing the hour in the time variable (i'm so tired)
        System.out.println("Which camera do you want to see: ");
        System.out.println("1. Lizard\n2. Cockroach\n3. Fish\n4. Monkey");
        Scanner input = new Scanner(System.in);
        int camera = input.nextInt();
        System.out.println();
        switch (camera)
        {
        case 1: animal = "Lizard";    break; //chooses animal type
        case 2: animal = "Cockroach"; break;
        case 3: animal = "Fish";      break;
        case 4: animal = "Monkey";    break;
        default: System.out.print("bad number");
        }
        printAnimal(); //prints the animal
    }
    
    public static void printAnimal(){
        String animalType = animal;
        double temp = Math.random() * 50 + 50;
        System.out.println("Animal type: " + animalType);
        System.out.println("Current time: " + time);
        System.out.printf("Habitat temperture: %.2f\n", temp);
        System.out.println("Live " + animalType + " Reaction: \n"); //same as saying "Lizard Camera:" or something like that

        File file = new File("animals/" + animal + ".txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        } 
        
        System.out.printf("\n---\nYou've reached the end of the program. To check another habitat, please restart the watcher.");
    }
}