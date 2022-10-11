import java.util.Scanner;
//Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers

public class Task13Thirteen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:  ");
        int num1 = in.nextInt();

        System.out.println("Input Second number:");
        int num2 = in.nextInt();

        System.out.println("Input Third number:");
        int num3 = in.nextInt();

        System.out.println("Average of five numbers is:" +
                (num1 + num2 + num3) / 5);
    }

}

