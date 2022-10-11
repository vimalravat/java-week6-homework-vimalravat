public class Task5Five {
    //Write a program for a calculator with addition, subtraction, multiplication
    //and division methods
    int a = 100;
    int b = 200;
    int c = 10;
    int d = 20;

    public static void main(String[] args) {
        myAdds();
        mySubtract();
        Task5Five methodThree = new Task5Five();
        methodThree.myMultiplication();
        Task5Five methodFour = new Task5Five();
        methodFour.myDivision();


    }
    public static void myAdds() {

        Task5Five task5Five = new Task5Five();
        String s = (task5Five.a) + (task5Five.b) + (task5Five.c) + (task5Five.d) + " Addition";
        System.out.println(s);
    }
    public static void mySubtract() {

        Task5Five task5Five = new Task5Five();
        String s = (task5Five.a) - (task5Five.b) - (task5Five.c) - (task5Five.d) + " Subtraction";
        System.out.println(s);
    }
    public void myMultiplication() {


        String s = a * b * c * d + " Multiplication";
        System.out.println(s);
    }
    public void myDivision() {

        String s = a / b / c / d + "  Division";
        System.out.println(s);
    }
}