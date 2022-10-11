public class Task4Four {
    //Write a Java programme using the following steps
    int a = 10;
    int b = 20;
    static String name = "Dollar";
    static String currency = "Pound";

    public static void main(String[] args) {
        spendMoney();
        Task4Four obj = new Task4Four();
        obj.callMe();
    }

    public void callMe() {
        System.out.println(a);
        System.out.println(b);
        Task4Four task4Four = new Task4Four();
        System.out.println(task4Four.name);
        System.out.println(task4Four.currency);

    }

    public static void spendMoney() {
        System.out.println(name);
        System.out.println(currency);
        Task4Four task4Four = new Task4Four();
        System.out.println(task4Four.a);
        System.out.println(task4Four.b);

    }
}
