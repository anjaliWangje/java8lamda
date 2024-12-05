package Java8;
interface  ExceptionHandler {
void handle() throws Exception;
}





public class Exception4 {
    public static void main(String[] args) throws Exception {
        ExceptionHandler handler = () -> {
            try {
                System.out.println("Hello");
            } catch (Exception e) {
                System.out.println(" exception: " + e.getMessage());
            }
        };
        handler.handle();
    }
}

