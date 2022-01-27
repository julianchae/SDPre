public class Objective4Lab3{
  public static void main(String[] args){
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("How old are you?");
    int age = scanner.nextInt();
    int currentYear = 2022;
    int birthYear = currentYear - age;
    System.out.println("You were born in"+" "+birthYear);

  }
}
