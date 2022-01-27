public class Objective4Lab1{
  public static void main(String[] args){
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("What is your first name?");
    String fname = scanner.nextLine();
    System.out.println("What is your last name?");
    String lname = scanner.nextLine();
    System.out.println("What is your favorite animal?");
    String favAnimal = scanner.nextLine();
    System.out.println("What is your favorite food?");
    String favFood = scanner.nextLine();
    System.out.println("What is your favorite song?");
    String favSong = scanner.nextLine();
    System.out.println("My name is" + " "+fname+" "+lname);
    System.out.println("My favorite animal is the" +" "+favAnimal);
    System.out.println("My favorite food is" + " "+ favFood);
    System.out.println("My favorite song is" + " "+ favSong);


  }
}
