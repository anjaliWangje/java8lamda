package Java8;

import java.io.IOException;

public class Exception1 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                throw new IOException("Checked exception thrown");
            } catch (IOException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        };

        runnable.run();
    }
}

