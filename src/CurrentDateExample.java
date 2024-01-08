import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);

        // Print the current date
        System.out.println("Current Date: " + formattedDate);
    }
}
