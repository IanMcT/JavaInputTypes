import java.util.Scanner;
/*
Ian McTavish
  Sept 2, 2022
  Examples of input using Java
  */
class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Create a Scanner object
    
    //string
    System.out.println("Enter your name: ");
    String name = reader.nextLine();
    System.out.println("Your name is: " + name);

    //integer
    System.out.println("Enter your age: ");
    int age =    reader.nextInt();
    reader.nextLine();
    //nextLine is required because nextInt only consumes the integer and not the next line character
    System.out.println("Next year you will be " + (age+1));
    //decimal
    System.out.println("Enter a decimal number: ");
    double n = reader.nextDouble();
    reader.nextLine();//consumes the new line
    System.out.println("You entered: "+n+".  Adding 1 results in: " + (n+1));
    //boolean
    System.out.println("Enter True or False: ");
    boolean b = reader.nextBoolean();
    reader.nextLine();//consumes the new line
    System.out.println("You entered: "+b);
    if(b){
      System.out.println("This only runs if you entered True");
    }else{
            System.out.println("This only runs if you entered False");
    }
    //option
    int option;
    System.out.println("Please enter a number from 1-4");
    do{
      option = reader.nextInt();
      reader.nextLine();
      if(option <=0 || option > 4){
        System.out.println("Please enter a number from 1-4");
      }
    }while(option <=0 || option > 4);

    System.out.println("You picked: " + option);
    //multiple numbers
    int entry, total, count;
    count = 0;
    total = 0;
    System.out.println("To calculate your average please enter your marks.  Enter -1 to finish: ");
    do{
      entry = reader.nextInt();
      reader.nextLine();
      if(entry!=-1){
        total += entry;
        count++;
      }
    }while(entry!=-1);
    double average = (double)total/(double)count;
    System.out.println("Average: " + average);
    System.out.print("Average rounded to two decimal places: ");
    System.out.format("%.2f", average);
    reader.close();//Always close!
  }
}