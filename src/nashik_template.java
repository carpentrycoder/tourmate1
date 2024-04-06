import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nashik_template {
    public static void openNashikTemplate(String title) {
        PlaceTemplateFunc.PlaceTemplateFunc(title,"Dash_Icons/NASHIKimg.png","Dash_Icons/sula-wine.png","Dash_Icons/nashik_famous.png","Dash_Icons/nashik_about.png","Dash_Icons/nashik-food.png","Dash_Icons/Nashik-review1.png","Dash_Icons/Nashik-review2.png","Dash_Icons/Nashik-review3.png");

        PlaceTemplateFunc.getaskme().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = " https://www.google.com/maps/dir/Karjat,+Maharashtra+410201/Nashik,+Maharashtra/@19.4464024,72.7389013,9z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3be7fb9cd0a4ab33:0x24c28f0e92e5594f!2m2!1d73.3282612!2d18.9102069!1m5!1m1!1s0x3bddd290b09914b3:0xcb07845d9d28215c!2m2!1d73.7898023!2d19.9974533!3e0?entry=ttu";
                Delivery_web(url);
            }
        });



        PlaceTemplateFunc.getMapButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.google.com/maps/place/Nashik,+Maharashtra/@19.9911053,73.7210782,12z/data=!3m1!4b1!4m6!3m5!1s0x3bddd290b09914b3:0xcb07845d9d28215c!8m2!3d19.9974533!4d73.7898023!16zL20vMDM3dmtr?entry=ttu"; // Replace this with your actual delivery website URL
                Delivery_web(url);
            }

        });

        PlaceTemplateFunc.getDirectionButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.google.com/maps/dir/Karjat,+Maharashtra+410201/Pune,+Maharashtra/@18.7192286,73.2525316,10z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3be7fb9cd0a4ab33:0x24c28f0e92e5594f!2m2!1d73.3282612!2d18.9102069!1m5!1m1!1s0x3bc2bf2e67461101:0x828d43bf9d9ee343!2m2!1d73.8567437!2d18.5204303!3e0?entry=ttu"; // Replace this with your actual delivery website URL
                Delivery_web(url);
            }
        });

        PlaceTemplateFunc.getRentButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rentalcar.rentalrtn("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\QR\\Nashik-rental.png");
            }
        });

        PlaceTemplateFunc.getWeatherButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://weather.com/en-IN/weather/tenday/l/Nashik+Maharashtra?canonicalCityId=1efbf84f6933598f729946df68b3ca2c3a3d41f4c5ebc21d8e1997189d25cb73"; // Replace this with your actual delivery website URL
                Delivery_web(url);
            }
        });

        PlaceTemplateFunc.gethotl().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.booking.com/searchresults.en-gb.html?ss=Nashik%2C+Maharashtra%2C+India&ssne=New+Delhi&ssne_untouched=New+Delhi&label=aurangabad-yR9HD2DX6zxUnwkfasFo_gS110121702269%3Apl%3Ata%3Ap170%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-710652116%3Alp1007788%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YZVcNNsENnH02-pWD53qm9c&aid=306395&lang=en-gb&sb=1&src_elem=sb&src=searchresults&dest_id=-2105851&dest_type=city&ac_position=3&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=d57b16f31ab900d5&ac_meta=GhBkNTdiMTZmMzFhYjkwMGQ1IAMoATICZW46Ak5hQABKAFAA&checkin=2024-03-29&checkout=2024-03-30&group_adults=2&no_rooms=1&group_children=0";
                Delivery_web(url);
            }
        });


    }

    public static void Delivery_web(String url) {

        JFrame frame = new JFrame("Food-Delivery-Services");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1366, 768);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);

        // Embed JavaFX WebView into Swing
        JFXPanel jfxPanel = new JFXPanel();
        frame.add(jfxPanel, BorderLayout.CENTER);

        JButton hideButton = new JButton("Back");
        hideButton.setPreferredSize(new Dimension(100, 20));
        hideButton.setBackground(new Color(0x0D8AF1));
        hideButton.setForeground(Color.white);
        hideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose(); // Dispose the frame to stop running the code
            }
        });
        frame.add(hideButton, BorderLayout.SOUTH);

        // Initialize JavaFX
        Platform.runLater(() -> {
            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();

            // Load the specified website URL
            webEngine.load(url);

            // Add WebView to JFXPanel
            jfxPanel.setScene(new Scene(webView));
        });

        // Display the JFrame
        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}
