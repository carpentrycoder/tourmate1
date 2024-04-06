import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mum_template{
    public static void openmum_template(String Title) {
        PlaceTemplateFunc.PlaceTemplateFunc(Title,"Dash_Icons/queens-necklace.png","Dash_Icons/gate-of-india.png","Dash_Icons/famous-mum.png","Dash_Icons/info-mum.png","Dash_Icons/vadapav.png","Dash_Icons/mum-client1.png","Dash_Icons/mum-client2.png","Dash_Icons/mum-client3.png");
        PlaceTemplateFunc.getaskme().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "http://surl.li/rrunl"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });
        PlaceTemplateFunc.getRentButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rentalcar.rentalrtn("QR/Mumbai-rentals.png");
            }
        });

        PlaceTemplateFunc.getMapButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "http://surl.li/rrupi"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.getDirectionButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "http://surl.li/rrunl"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.getWeatherButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.accuweather.com/en/in/mumbai/204842/weather-forecast/204842"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.gethotl().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                all_hotels.mumbai_hotels();
            }
        });

    }
}
