public class Task3Three {
    //Write a Java programme using the following steps.
    int xyz = 123;
    static int zxy = 321;

    public static void main(String[] args) {
        myLuckyNumber();
        Task3Three obj = new Task3Three();
        obj.myFavoriteNumber();


    }

    public static void myLuckyNumber() {
        System.out.println(zxy);
        Task3Three taskThree = new Task3Three();
        System.out.println(taskThree.xyz);

    }

    void myFavoriteNumber() {
        System.out.println(xyz);
        System.out.println(Task3Three.zxy);

    }
}
