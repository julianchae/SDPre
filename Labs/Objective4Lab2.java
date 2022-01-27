public class Objective4Lab2{
  public static void main(String[] args){
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Please enter the first whole number you would like to add.");
    int fwholeNum = scanner.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
    int swholeNum = scanner.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
    int twholeNum = scanner.nextInt();
    int sum = fwholeNum + swholeNum + twholeNum;
    System.out.println("Please enter the first decimal number you would like to add.");
    double fdecNum = scanner.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
    double sdecNum = scanner.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add.");
    double tdecNum = scanner.nextDouble();
    double total = fdecNum + sdecNum + tdecNum;
    System.out.println("The sum of" +" "+ fwholeNum+"+"+swholeNum+"+"+twholeNum+"=" +" "+sum);
    System.out.println("The sum of" +" "+ fdecNum+"+"+sdecNum+"+"+tdecNum+"=" +" "+ total);




  }
}
