package Java8;
interface abcd{
    int addition(int a,int b,int c);

}

public class Lamda7 {
    public static void main(String[] args) {
        abcd aa=(int aaa,int bb,int cc)->{

            return aaa+bb+cc+70;
        };
        int result = aa.addition(23,34,56);
        System.out.println("addition"+result);
    }

}
