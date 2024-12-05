package Java8;
interface Student {
    void studentData(String name) throws Exception;
}
public class Exception2 {

    public static void main(String[] args) {
        // lamba expression
        Student student = (name )-> {
            System.out.println("The Student name is: " + name);
            throw new Exception();
        };
        try {
            student.studentData("Anjali");
        } catch(Exception e) {

        }
    }
}

