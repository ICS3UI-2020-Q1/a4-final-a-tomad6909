import java.util.Scanner;
/**
 * This program will prompt the user for a positive integer and print out all the factors to the console
 * @author David Toma
 */
public class Main {

  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);
    // created a variable to store user input
    int integer;
    // created a variable for count
    int count = 1;
    // created a do-while statement to make sure a positive integer is entered
    do{
      System.out.println("Please enter a positive integer to determine its factors:");
      integer = input.nextInt();
      // only active when user enters negative integer
    }while(integer <= 0);
    
    System.out.println("The factors of " + integer + " are:");

    // determine the factors of the integer  
    while(integer >= count){
      if(integer % count == 0){
        System.out.println(count);
      } 
      count = count + 1;
    }


    
  }
}
