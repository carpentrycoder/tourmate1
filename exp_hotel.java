import javax.swing.*;
import java.awt.*;

public class exp_hotel extends JFrame {
    private JFrame hotelFrame;

    exp_hotel() {
        // Call the method to get the hotel frame
        hotelFrame = Hotel.rtnhotelframe();

        // Add an image label to the content panel
        Hotel.addImageLabel(Hotel.contentPanel, "E:\\tourmate1\\src\\icons\\mum_hotels.png");

        // Configure and add the checkin text field
        Hotel.checkin = Hotel.configureTextField(new JTextField());
        Hotel.checkin.setBounds(220, 310, 390, 80);
        Hotel.strday = String.valueOf(Hotel.checkin);
        Hotel.contentPanel.add(Hotel.checkin);  // Add the checkin text field to the content panel

        // Configure and add the checkout text field
        Hotel.checkout = Hotel.configureTextField(new JTextField());
        Hotel.checkout.setBounds(350 + 400, 310, 390, 80);
        Hotel.endday = String.valueOf(Hotel.checkout);
        Hotel.contentPanel.add(Hotel.checkout);  // Add the checkout text field to the content panel

        // Configure and add the done button
        JButton done = Hotel.createAndConfigureDoneButton();
        done.setBounds(640, 400, 80, 80);
        Hotel.contentPanel.add(done);  // Add the done button to the content panel

        // Configure and add the back button
        JButton back = Hotel.createAndConfigureBackButton();
        back.setBounds(1240, 630, 60, 60);
        Hotel.contentPanel.add(back);  // Add the back button to the content panel

        // Revalidate the hotel frame to refresh the layout
        hotelFrame.revalidate();
    }

    public static void main(String[] args) {
        new exp_hotel();
    }
}