import java.io.InputStream;
import java.util.Scanner;

//Name: Aelinia Enquist
//Date: 11/14/24
//Description: first asks for users favorite number then prints things about the number
//then asks for the users favorite character then prints things about that.
public class DataFun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your favorite number: "); //part 1
    int num = input.nextInt();
    if (num >= 0) { //positive/negative test
      System.out.println(num + " is positive, ");
    } else {
      System.out.println(num + " is negative, ");
    }
    if (num > 1000) { //greater than test
      System.out.println("greater than 1000, ");
    } else if (num > 100) {
      System.out.println("greater than 100, ");
    } else if (num > 10) {
      System.out.println("Your number is bigger than 10, ");
    }
    if(num % 2 == 0) { //even/odd test
      System.out.println("even, "); 
    } else {
      System.out.println("odd, ");
    }
    switch(num) { //noble gas test
      case 2:
        System.out.println("and is the atomic number of helium.");
        break;
      case 10:
        System.out.println("and is the atomic number of neon.");
        break;
      case 18:
        System.out.println("and is the atomic number of argon.");
        break;
      case 36:
        System.out.println("and is the atomic number of krypton.");
        break;
      case 54:
        System.out.println("and is the atomic number of xenon.");
        break;
      case 86:
        System.out.println("and is the atomic number of radon.");
        break;
      case 118:
        System.out.println("and is the atomic number of oganesson.");
        break;
      default:
      System.out.println("and is not the atomic number of a noble gas or oganesson.");
    }
    System.out.print("Enter your favorite character: "); //part 2
    input = new Scanner(System.in);
    String characterString = input.nextLine();
    char char1 = 0;
    char1 = characterString.charAt(0);
    int ascii = (int) char1;
    if(ascii >= 48 && ascii <= 57) { //checks for a numeric
      System.out.println(char1 + " is a numeric digit, ");
      System.out.println("assigned to the ascii value " + ascii + ", ");
    } else if(ascii >= 65 && ascii <= 90) { //checks for an uppercase
      System.out.println(char1 + " is a uppercase letter, ");
      if(ascii == 65 || ascii == 69 || ascii == 73 || ascii == 79 || ascii == 85 || ascii == 89) { //checks for a vowel
        System.out.println("a vowel, ");
      }
      System.out.println("assigned to the ascii value " + ascii + ", "); //ascii value print
      if(ascii == 65 || ascii == 85) { //alphabet assignment
        System.out.println("and is the " + (ascii - 64) + "st letter of the alphabet.");
      } else if(ascii == 66 || ascii == 86) {
        System.out.println("and is the " + (ascii - 64) + "nd letter of the alphabet.");
      } else if(ascii == 67 || ascii == 87) {
        System.out.println("and is the " + (ascii - 64) + "rd letter of the alphabet.");
      } else {
        System.out.println("and is the " + (ascii - 64) + "th letter of the alphabet.");
      }
    } else if(ascii >= 97 && ascii <= 122) { //checks for a lowercase
      System.out.println(char1 + " is a lowercase letter, ");
      if(ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117 || ascii == 121) { //checks for a vowel
        System.out.println("a vowel, ");
      }
      System.out.println("assigned to the ascii value " + ascii + ", "); //ascii value print
      if(ascii == 97 || ascii == 117) { //alphabet assignment
        System.out.println("and is the " + (ascii - 96) + "st letter of the alphabet.");
      } else if(ascii == 98 || ascii == 118) {
        System.out.println("and is the " + (ascii - 96) + "nd letter of the alphabet.");
      } else if(ascii == 99 || ascii == 119) {
        System.out.println("and is the " + (ascii - 96) + "rd letter of the alphabet.");
      } else {
        System.out.println("and is the " + (ascii - 96) + "th letter of the alphabet.");
      }
    }
  }
}
