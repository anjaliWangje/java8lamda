package Java8;

interface shape{
    void draw();
}
class circle implements shape {

    @Override
    public void draw() {
        System.out.println("this is circle class");

    }
}
class squre implements shape{

    @Override
    public void draw() {
        System.out.println("this is squre method");
    }
}



public class Lamdaexpresstion {
    public static void main(String[] args) {
        String str="hello";
        shape circle=() -> System.out.println("This is circle");
        circle.draw();
        shape squre=()-> System.out.println("This is squre method");
        squre.draw();
    }
}
