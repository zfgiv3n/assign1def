import java.util.Scanner;

public class Main {
    public static int sum(int number){
        if (number % 10 == 0) {
            return number;
        }
        else {
            return(number % 10) + sum(number/10);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();
        int sum = sum(number);
        System.out.println("The sum is:" + sum);
    }

}