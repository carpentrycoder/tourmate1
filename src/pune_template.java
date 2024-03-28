import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pune_template {
    public static void openPuneTemplate(String title) {
        PlaceTemplateFunc.PlaceTemplateFunc(title,"Dash_Icons/pune-img1.png","Dash_Icons/dagdu-shet.png","Dash_Icons/famous -pune.png","Dash_Icons/about -pune.png","Dash_Icons/misal-pune.png","Dash_Icons/pune-review1.png","Dash_Icons/pune-review2.png","Dash_Icons/pune-review3.png");

        PlaceTemplateFunc.getaskme().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.google.com/maps/place/Pune,+Maharashtra/@18.524545,73.6981553,11z/data=!3m1!4b1!4m6!3m5!1s0x3bc2bf2e67461101:0x828d43bf9d9ee343!8m2!3d18.5204303!4d73.8567437!16zL20vMDE1eTJx?entry=ttu"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.getMapButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.google.com/maps/place/Pune,+Maharashtra/@18.5248706,73.6981514,11z/data=!3m1!4b1!4m6!3m5!1s0x3bc2bf2e67461101:0x828d43bf9d9ee343!8m2!3d18.5204303!4d73.8567437!16zL20vMDE1eTJx?entry=ttu"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.getDirectionButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.google.com/maps/dir/Karjat,+Maharashtra+410201/Pune,+Maharashtra/@18.7192286,73.2525316,10z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3be7fb9cd0a4ab33:0x24c28f0e92e5594f!2m2!1d73.3282612!2d18.9102069!1m5!1m1!1s0x3bc2bf2e67461101:0x828d43bf9d9ee343!2m2!1d73.8567437!2d18.5204303!3e0?entry=ttu"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.getWeatherButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.accuweather.com/en/in/pune/204848/weather-forecast/204848"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });
    }
    }

