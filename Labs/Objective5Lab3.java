public class Objective5Lab3{
  public static void main(String[] args){
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Enter a number");

    int userNum = scanner.nextInt();

    if (userNum > 0){
      System.out.println("Your number is positive");}
    if (userNum == 0){
      System.out.println("Your number is zero");}
    else if (userNum < 0){
      System.out.println("Your number is negative");
    }




  }
}
