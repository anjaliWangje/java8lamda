package Java8;
interface student{
    String str(String name);
}
public class lamda3 {
    public static void main(String[] args) {
        student s1=(name)->{
            return "hello:"+name;
        };
        System.out.println(s1.str("sunoo"));
    }

}
