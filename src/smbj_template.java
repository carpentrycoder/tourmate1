import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class smbj_template {
    public static void opensmbj_template(String title){
        PlaceTemplateFunc.PlaceTemplateFunc(title,"Dash_Icons/Sambhajinagarimg.png","Dash_Icons/smbj-bibika-makbara.png","Dash_Icons/Sambhajinagar_famous.png","Dash_Icons/smbj-about.png","Dash_Icons/smbj-food .png","Dash_Icons/smbj-review1.png","Dash_Icons/smbj-review2.png","Dash_Icons/smbj-review3.png");

        PlaceTemplateFunc.getaskme().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.google.com/maps/dir/Aurangabad,+Maharashtra/Karjat,+Maharashtra+410201/@19.4399802,73.0319779,8z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3bdb9815a369bc63:0x712d538b29a2a73e!2m2!1d75.3433139!2d19.8761653!1m5!1m1!1s0x3be7fb9cd0a4ab33:0x24c28f0e92e5594f!2m2!1d73.3282612!2d18.9102069!3e0?entry=ttu"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.getMapButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.google.com/maps/place/Aurangabad,+Maharashtra/@19.8548119,75.2329621,12.26z/data=!4m6!3m5!1s0x3bdb9815a369bc63:0x712d538b29a2a73e!8m2!3d19.8761653!4d75.3433139!16zL20vMDJucGs1?entry=ttu"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.getDirectionButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.google.com/maps/place/Aurangabad,+Maharashtra/@19.8701759,75.0098248,11z/data=!3m1!4b1!4m6!3m5!1s0x3bdb9815a369bc63:0x712d538b29a2a73e!8m2!3d19.8761653!4d75.3433139!16zL20vMDJucGs1?entry=ttu"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.getWeatherButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://weather.com/en-MU/weather/tenday/l/1456e8349ce55ff11b4ab871292d1938a6aa1bb66ec365fc4fedf2d83a5ca950"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

        PlaceTemplateFunc.gethotl().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String url = "https://www.booking.com/city/in/aurangabad.en.html?aid=306395;label=aurangabad-yR9HD2DX6zxUnwkfasFo_gS110121702269:pl:ta:p170:p2:ac:ap:neg:fi:tikwd-710652116:lp1007788:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YZVcNNsENnH02-pWD53qm9c;ws=&gad_source=1&gclid=Cj0KCQjwqpSwBhClARIsADlZ_TkIpX6H9EI9pgEmsgveVaCTm1lKa_flgt60NqxCOGQ1Gp05w8B7fwAaAkKZEALw_wcB"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });    }
}