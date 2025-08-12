// Module 2 Assignment - Question 9
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class InvalidAgeException2 extends Exception {
    public InvalidAgeException2(String message) {
        super(message);
    }
}

public class Q9 {
    private static final Logger logger = Logger.getLogger("MyLog");

    public static void checkAge(int age) throws InvalidAgeException2 {
        if (age < 18) throw new InvalidAgeException2("Age must be 18 or above.");
    }

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("/mnt/data/error.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);

            checkAge(15);
        } catch (InvalidAgeException2 e) {
            logger.severe(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
