package Java8;
interface add{
    int addition(int a,int b);
}
class addable implements add{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}

public class Addition {
    public static void main(String[] args) {
        add addition=(int a,int b)->
             (a+b);
       int result= addition.addition(10,20);
        System.out.println(result);


    }
}
