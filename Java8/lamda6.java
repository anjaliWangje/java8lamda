package Java8;
interface abc{
     void show(int age, String name);
}




public class lamda6 {
    public static void main(String[] args) {
        abc xyz=(int age,String name)->{

            System.out.println(" name is: "+age+"and name:"+name);
        };
       xyz.show (23,"hello");

    }
}
