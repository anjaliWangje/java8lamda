package Java8;
interface anjali{
    void test();
}
class wanngje implements anjali {

    @Override
    public void test() {
        System.out.println("this is circle class");

    }
}
class pranali implements anjali{

    @Override
    public void test() {
        System.out.println("this is squre method");
    }
}




public class Lamda4 {
    public static void main(String[] args) {

        anjali wangje=() -> System.out.println("This is small sister");
        wangje.test();
        anjali pranali=()-> System.out.println("This is big sister");
        pranali.test();
    }
}
