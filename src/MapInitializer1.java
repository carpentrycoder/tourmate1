import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MapInitializer1 {
    public static void initializeMap(double latitude, double longitude) {
        try {
            // Intentionally causing an exception by dividing by zero
            int result = 1 / 0; // This line will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            // You can add any additional handling logic here
            throw new RuntimeException("Failed to initialize map");
        }
    }

    public static void main(String[] args) {
        boolean tryAgain = true;
        while (tryAgain) {
            try {
                initializeMap(16.9883994, 73.2900679);
                tryAgain = false; // Stop retrying if initialization succeeds
            } catch (Exception e) {
                int choice = JOptionPane.showOptionDialog(null,
                        "Failed to initialize map. Do you want to open the map in a web browser instead?",
                        "Map Initialization Error",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE,
                        null,
                        new String[]{"Try Again", "Open in Browser"},
                        "Try Again");

                if (choice == JOptionPane.NO_OPTION) {
                    try {
                        URI uri = new URI("https://www.google.com/maps/place/Ratnagiri,+Maharashtra/@16.9883994,73.2900679,13.1z/data=!4m6!3m5!1s0x3bea0d1839a6bb7f:0x63ab969b79bf6561!8m2!3d16.990215!4d73.3120233!16zL20vMDM0bjBx?entry=ttu");
                        Desktop.getDesktop().browse(uri);
                    } catch (URISyntaxException | IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    tryAgain = false; // Stop retrying if user chose to open in browser
                }
            }
        }
    }
}