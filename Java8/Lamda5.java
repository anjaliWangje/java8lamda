package Java8;
interface a{
    void show();

    default void test1() {
        System.out.println(" this is default");
    }
}

public class Lamda5 {
    public static void main(String[] args) {
        a obj=()->{
            System.out.println("this is show");

        };
        obj.show();
        a obj2=()->{
            System.out.println(" this is default");

        };
        obj2.test1();

    }

}
