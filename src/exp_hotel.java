import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp_hotel extends JFrame {
    private JFrame hotelFrame;

    exp_hotel() {
        // Call the method to get the hotel frame
        hotelFrame = Hotel.rtnhotelframe();

        // Add an image label to the content panel using the Hotel class function
        Hotel.addImageLabel(Hotel.contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\mum_hotels.png");

        // Configure and add the checkin text field using the Hotel class function
        Hotel.checkin = Hotel.configureTextField(new JTextField());
        Hotel.checkin.setBounds(220, 310, 390, 80);
        Hotel.strday = String.valueOf(Hotel.checkin);
        Hotel.contentPanel.add(Hotel.checkin);  // Add the checkin text field to the content panel
        // Configure and add the checkout text field using the Hotel class function
        Hotel.checkout = Hotel.configureTextField(new JTextField());
        Hotel.checkout.setBounds(350 + 400, 310, 390, 80);
        Hotel.endday = String.valueOf(Hotel.checkout);
        Hotel.contentPanel.add(Hotel.checkout);  // Add the checkout text field to the content panel

        // Configure and add the done button using the Hotel class function
        JButton done = Hotel.createAndConfigureDoneButton(Hotel.checkin,Hotel.checkout);
        done.setBounds(640, 400, 80, 80);
        Hotel.contentPanel.add(done);  // Add the done button to the content panel

        // Configure and add the back button using the Hotel class function
        JButton back = Hotel.createAndConfigureBackButton(hotelFrame);
        back.setBounds(1240, 2630, 60, 60);
        Hotel.contentPanel.add(back);  // Add the back button to the content panel
        Hotel.createAndAddButtons(buttonClickListener);
        // Revalidate the hotel frame to refresh the layout
        hotelFrame.revalidate();
    }
    ActionListener buttonClickListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();
            openButtonLink(buttonText);
        }
    };
    public void openButtonLink(String buttonText) 
    {
        switch (buttonText) {
            case "Button 1":
            Hotel.openURIInBrowser("");
            break;
            case "Button 2":
            Hotel.openURIInBrowser("");
            break;
            case "Button 3":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 4":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 5":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 6":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 7":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 8":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 9":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 10":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 11":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 12":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 13":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 14":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 15":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 16":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 17":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 18":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 19":
            Hotel.openURIInBrowser("");
            break;
        
            case "Button 20":
            Hotel.openURIInBrowser("");
            break;

            default:
            // Handle default case or throw an exception if needed
            throw new IllegalArgumentException("Invalid button text: " + buttonText);
    }
    }
    public static void main(String[] args) {
        new exp_hotel();
    }
}