package Java8;

interface xyz{
    String str();
}



public class lamda2 {
    public static void main(String[] args) {
        xyz str1=()->{
            return "i have nothing to say";
        };
        System.out.println(str1.str());
    }
}
