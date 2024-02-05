import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class restaurents_rtn extends JFrame implements ActionListener {
    JScrollPane scrollPane;
    JButton view_map,swiggy,Zomato,Uber_eats,Food_Panda,Dunzo;
    JFXPanel jfxPanel;

    JFrame rtn;
    public static void main(String[] args) {
        restaurents_rtn restro1 = new restaurents_rtn();
        restro1.initializeFrame();

    }
    public void initializeFrame()
    {
        rtn = new JFrame();
        rtn.setExtendedState(MAXIMIZED_BOTH);
        scrollPane = new JScrollPane(); // Initialize scrollPane
        scrollPane.setBounds(0, 0, 1366, 766);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rtn.add(scrollPane);
        // Use getContentPane() to get the contentPane of the frame
        Container contentPane = rtn.getContentPane();
        contentPane.setBackground(new Color(0x592A7BA, true));
        setupScrollBar();
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 2000));
        contentPanel.setBackground(new Color(219, 146, 5, 255));
        scrollPane.setViewportView(contentPanel);

        jfxPanel = new JFXPanel();

        ImageIcon imageIcon = new ImageIcon("src/icons/ratangiri_places-restaurents.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 231, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 1366, 231);
        contentPanel.add(label);

        ImageIcon backIcon = new ImageIcon("src/Dash_Icons/view_on_map.png");
        view_map = new JButton(backIcon);
        view_map.setBackground(new Color(0xDB9205));
        view_map.setBounds(20,250, 353,223);
        view_map.setBorder(BorderFactory.createEmptyBorder());
        view_map.addActionListener(this);
        contentPanel.add(view_map);

        JLabel label_a = createImageLabel("src/Dash_Icons/browse_restro.png", 845, 81, 250, 250);
        contentPanel.add(label_a);
        places_ratnagiri.loadAndSetCustomFont(label_a, "\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Browse Ratnagiri by Food", Font.BOLD, 33, new Color(0xFFFFFF), 280, 13, 531,50);


        JLabel label_b = createImageLabel("src/Dash_Icons/cuisines.png",386,499,12,490);
        contentPanel.add(label_b);

        JLabel label_c = createImageLabel("src/DButns/Delivery.png",418,91,0,490+20+399+100);
        contentPanel.add(label_c);

        JLabel label_d = createImageLabel("src/DButns/Delivery_box.png",394,636,0,490+20+399+100+91+20);
        contentPanel.add(label_d);

        JButton viewMapButton = createImageButton("src/Dash_Icons/view_on_map.png", 20, 250, 353, 223);
        viewMapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action to perform when the button is clicked
                System.out.println("View Map button clicked!");
            }
        });
        contentPanel.add(viewMapButton);

        Zomato = createImageButton("src/Dash_Icons/Zomato.png",-40,30,431,86);
        Zomato.setBackground(new Color(0x21A9FF));
        Zomato.addActionListener(this);
        label_d.add(Zomato);

        swiggy = createImageButton("src/Dash_Icons/Swiggy.png",-40,130,431,86);
        swiggy.setBackground(new Color(0x21A9FF));
        swiggy.addActionListener(this);
        label_d.add(swiggy);

        Uber_eats = createImageButton("src/Dash_Icons/Uber_Eats.png",-40,58+(86*2),431,86);
        Uber_eats.setBackground(new Color(0x21A9FF));
        Uber_eats.addActionListener(this);
        label_d.add(Uber_eats);

        Food_Panda = createImageButton("src/Dash_Icons/Food_Panda.png",-40,74+(86*3),431,86);
        Food_Panda.setBackground(new Color(0x21A9FF));
        Food_Panda.addActionListener(this);
        label_d.add(Food_Panda);

        Dunzo = createImageButton("src/Dash_Icons/Dunzo.png",-40,89+(86*4),431,86);
        Dunzo.setBackground(new Color(0x21A9FF));
        Dunzo.addActionListener(this);
        label_d.add(Dunzo);

        rtn.setUndecorated(true);
        rtn.setVisible(true);
    }
    public void setupScrollBar() {
        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0xFFD302);
                this.trackColor = new Color(0xFFDB9205, true);
            }
        });
    }

    public static JLabel createImageLabel(String imagePath, int width, int height, int x, int y) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(x, y, width, height);
        return label;
    }

    public static JButton createImageButton(String imagePath, int x, int y, int width, int height) {
        ImageIcon icon = new ImageIcon(imagePath);
        JButton button = new JButton(icon);
        button.setBackground(new Color(0xDB9205));
        button.setBounds(x, y, width, height);
        button.setBorder(BorderFactory.createEmptyBorder());
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view_map) {
            Platform.runLater(() -> {
                JFrame frame1 = new JFrame();
                frame1.setSize(1366,771);
                frame1.setExtendedState(MAXIMIZED_BOTH);
                WebView webView = new WebView();

                // HTML content to be displayed
                String htmlContent = """
                        <!DOCTYPE html>
                        <html lang="en">
                        <head>
                            <meta charset="UTF-8">
                            <meta name="viewport" content="width=device-width, initial-scale=1.0">
                            <title>Embedded Google Map</title>
                        </head>
                        <body>
                            <iframe
                                src="https://www.google.com/maps/embed?pb=!1m12!1m8!1m3!1d61050.185489388576!2d73.26917424414033!3d16.992416720036204!3m2!1i1024!2i768!4f13.1!2m1!1srestaurants%20in%20ratnagiri%20embed%20on%20map!5e0!3m2!1sen!2sin!4v1707014888645!5m2!1sen!2sin" width="1366" height="820" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade">
                            </iframe>
                        </body>
                        </html>""";

                // Load HTML content into the WebView
                webView.getEngine().loadContent(htmlContent);

                // Create a JFXPanel
                JFXPanel jfxPanel = new JFXPanel();
                jfxPanel.setSize(1366, 771);

                // Set up the JFXPanel with the WebView
                jfxPanel.setScene(new Scene(webView));

                // Add the JFXPanel to the JFrame
                frame1.add(jfxPanel);
                frame1.setVisible(true);
                frame1.setLocationRelativeTo(null);
            });

        } else if (e.getSource()==Zomato) {
            restaurent_func.Delivery_web("https://www.zomato.com/ratnagiri");
        } else if (e.getSource()==swiggy) {
            restaurent_func.Delivery_web("https://www.swiggy.com/city/ratnagiri");
        } else if (e.getSource()==Uber_eats){
            restaurent_func.Delivery_web("https://www.ubereats.com/");
        } else if (e.getSource()==Dunzo){
            restaurent_func.Delivery_web("https://www.dunzo.com/search");
        } else if (e.getSource()==Food_Panda) {
            restaurent_func.Delivery_web("https://www.eatsure.com/");
        }

    }
}

