package Java8;




interface Runnable{
    void run();
}
public class Exception3 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String str = null;
            if (str == null) {
                throw new NullPointerException("Null value encountered");
            }
            System.out.println("No exception thrown");
        };

        try {
            runnable.run(); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
    }

