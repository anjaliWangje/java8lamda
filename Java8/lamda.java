package Java8;
interface tdit{
    int opration(int x,int y);
}


public class lamda {
    public static void main(String[] args) {

        tdit add=(int x, int y)->x+y;
        tdit multiplication=(x,y)->x*y;
        System.out.println(add.opration(6,3));
        System.out.println(multiplication.opration(6,3));


    }
}
