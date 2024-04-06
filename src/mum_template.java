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
                rentalcar.rentalrtn("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\QR\\Mumbai-rentals.png");
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
                String url = "https://www.booking.com/searchresults.en-gb.html?ss=Mumbai%2C+Maharashtra%2C+India&ssne=Goa&ssne_untouched=Goa&label=aurangabad-yR9HD2DX6zxUnwkfasFo_gS110121702269%3Apl%3Ata%3Ap170%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-710652116%3Alp1007788%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YZVcNNsENnH02-pWD53qm9c&aid=306395&lang=en-gb&sb=1&src_elem=sb&src=searchresults&dest_id=-2092174&dest_type=city&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=6f6216c082a600c5&ac_meta=GhA2ZjYyMTZjMDgyYTYwMGM1IAAoATICZW46A211bUAASgBQAA%3D%3D&checkin=2024-03-29&checkout=2024-03-30&group_adults=2&no_rooms=1&group_children=0"; // Replace this with your actual delivery website URL
                restaurent_func.Delivery_web(url);
            }
        });

    }
}
