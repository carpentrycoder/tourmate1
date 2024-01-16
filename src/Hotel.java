import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;

public class Hotel extends JFrame {
    public static JPanel contentPanel;
    public static JTextField checkin, checkout;
    public static ImageIcon imageIcon;
    public static JLabel label;
    public static JButton back, done;
    public static JButton[] buttons;
    public static JFrame rtnhotels;
    public static JScrollPane scrollPane; // Declare scrollPane as a class member variable
    public static String strday, endday;

    public static void setupScrollPane() {
        scrollPane = new JScrollPane(); // Initialize scrollPane
        scrollPane.setBounds(0, 0, 1366, 766);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rtnhotels.add(scrollPane);

        // Use getContentPane() to get the contentPane of the frame
        Container contentPane = rtnhotels.getContentPane();

        // Set background color for the contentPane
        contentPane.setBackground(new Color(0x592A7BA, true));

        setupScrollBar();

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 2790));
        contentPanel.setBackground(new Color(146, 167, 186, 0));
        scrollPane.setViewportView(contentPanel);
    }

    public static void addImageLabel(JPanel contentPanel, String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(1366, 3000, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        label = new JLabel(imageIcon);
        label.setSize(1366, 3000);
        contentPanel.add(label);
    }

    public static JTextField configureTextField(JTextField textField) {
        textField.setBorder(BorderFactory.createLineBorder(new Color(0xF1EBD0)));
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("Helvetica", Font.BOLD, 31));
        textField.setBackground(new Color(0xF1EBD0));
        textField.setHorizontalAlignment(JTextField.CENTER);
        contentPanel.add(textField);
        return textField;
    }
    public static JFrame rtnhotelframe() {
        rtnhotels = new JFrame();
        rtnhotels.setTitle("hotels");
        rtnhotels.setExtendedState(MAXIMIZED_BOTH);
        rtnhotels.setSize(1366, 766);
        rtnhotels.setUndecorated(true);
        rtnhotels.setLocationRelativeTo(null);
        rtnhotels.setLayout(null);
        setupScrollPane(); // Call setupScrollPane before adding components
        rtnhotels.setVisible(true);
        return rtnhotels;
    }

    //    Default set-bounds
//        checkin = configureTextField(new JTextField());
//        checkin.setBounds(220, 310, 390, 80);
//
//        checkout = configureTextField(new JTextField());
//        checkout.setBounds(350 + 400, 310, 390, 80);

       static ActionListener buttonClickListener_back_done = createBackDoneActionListener();
    public static JButton createAndConfigureDoneButton() {

        ImageIcon ok = new ImageIcon("\\tourmate1\\src\\DButns\\done_80.png");
        JButton done = new JButton(ok);
        done.setLayout(null);
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setBounds(640, 400, 80, 80);
        done.setBackground(new Color(0x3000000, true));
        done.addActionListener(buttonClickListener_back_done);
        return done;
    }

    public static JButton createAndConfigureBackButton() {

        ImageIcon backb = new ImageIcon("E:\\tourmate1\\src\\DButns\\Back.png");
        JButton back = new JButton(backb);
        back.setBackground(new Color(0xC8C8C8));
        back.setLayout(null);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1240, 2630, 60, 60);
        back.setFont(new Font("open sauce", Font.BOLD, 20));
        back.setForeground(Color.BLACK);
        back.addActionListener(buttonClickListener_back_done);
        rtnhotels.add(back);
        return null;
    }

    public static void createAndAddButtons(ActionListener buttonClickListener) {
        int buttonWidth = 166;
        int buttonHeight = 40;
        int verticalSpacing = 170;
        // Declare an array to store the buttons
        buttons = new JButton[20];
        // Calculate Y-coordinates based on the provided reference
        int startY = 630; // Adjusted starting Y-coordinate
        int[] yCoordinates = new int[10];
        String imagePath = "\\tourmate1\\src\\DButns\\deal_button.png";
        ImageIcon icon = new ImageIcon(imagePath);

        for (int i = 0; i < yCoordinates.length; i++) {
            yCoordinates[i] = startY + i * (buttonHeight + verticalSpacing);
        }
        // Calculate X-coordinates for the first row
        int xFirstRow = 490;
        // Calculate X-coordinates for the second row
        int xSecondRow = xFirstRow + buttonWidth + 480; // Adjust this spacing as needed

        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton("Button " + (i + 1), icon);
            buttons[i].setBounds(xFirstRow, yCoordinates[i], buttonWidth, buttonHeight);
            buttons[i].addActionListener(buttonClickListener);
            buttons[i].setBorder(BorderFactory.createEmptyBorder());
            buttons[i].setBackground(new Color(0xF9F8FC));
            contentPanel.add(buttons[i]);
        }
        for (int i = 10; i < buttons.length; i++) {
            buttons[i] = new JButton("Button " + (i + 1), icon);
            buttons[i].setBounds(xSecondRow, yCoordinates[i - 10], buttonWidth, buttonHeight);
            buttons[i].addActionListener(buttonClickListener);
            buttons[i].setBorder(BorderFactory.createEmptyBorder());
            buttons[i].setBackground(new Color(0xF9F8FC));
            contentPanel.add(buttons[i]);
        }
    }

    public static ActionListener createButtonClickListener(JTextField checkin, JTextField checkout) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                // You can now perform actions based on the clicked button
                openURLBasedOnButton(clickedButton.getText());

            }
        };
    }

    public static ActionListener createBackDoneActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == back) {
                    rtnhotels.setVisible(false);
                } else if (e.getSource() == done) {
                    // Assuming validateAndDisplayDates does not need checkin and checkout
                    validateAndDisplayDates( checkin,checkout);
                }
            }
        };
    }
    public static void setupScrollBar() {
        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0xC8C8C8);
                this.trackColor = new Color(0xFFFFFF);
            }
        });
    }

    // ... (Other setup methods)
    public static void validateAndDisplayDates(JTextField checkin, JTextField checkout) {
        LocalDate currentDate = LocalDate.now();
        int day1 = currentDate.getDayOfMonth();
        int month1 = currentDate.getMonthValue();
        int year1 = currentDate.getYear();

        String strCheckin = checkin.getText();
        String[] arr_in = strCheckin.split("-");
        int d_in = Integer.parseInt(arr_in[0]);
        int m_in = Integer.parseInt(arr_in[1]);
        int y_in = Integer.parseInt(arr_in[2]);

        String strCheckout = checkout.getText();
        String[] arr_out = strCheckout.split("-");
        int d_out = Integer.parseInt(arr_out[0]);
        int m_out = Integer.parseInt(arr_out[1]);
        int y_out = Integer.parseInt(arr_out[2]);

        if ((isValidDate(d_in, m_in, y_in) && isValidDate(d_out, m_out, y_out))
                && ((y_in > year1) || (y_in == year1 && m_in > month1) || (y_in == year1 && m_in == month1 && d_in >= day1))
                && ((y_out > year1) || (y_out == year1 && m_out > month1) || (y_out == year1 && m_out == month1 && d_out >= day1))) {
            JOptionPane.showMessageDialog(null, "Dates are valid  \uD83D\uDCC5");
        } else {
            JOptionPane.showInternalMessageDialog(null, "Dates are Invalid  \uD83D\uDCC5", "Error", JOptionPane.ERROR_MESSAGE);
            checkin.setText("");
            checkout.setText("");
        }
    }

    public static void openURLBasedOnButton(String buttonText)
    {
        switch (buttonText) {
            case "Button 1":
                openURIInBrowser("https://www.booking.com/hotel/in/blue-ocean-resort-amp-spa.en-gb.html?aid=7344211&label=metatripad-link-dmetain-hotel-1485713_xqdz-d4784da8944bb36df48b7b02b989b21b_los-07_bw-002_tod-20_dom-in_curr-INR_gst-02_nrm-01_clkid-4040a97c-6a25-4748-9218-f26a1f90713d_aud-0000_mbl-L_pd-_sc-2_defdate-0_spo-1_clksrc-0_mcid-10&sid=b8b1f48e2e72280c2afb21c08005d08b&all_sr_blocks=148571307_376994761_2_2_0;checkin=2024-01-07;checkout=2024-01-11;dest_id=900053379;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;highlighted_blocks=148571307_376994761_2_2_0;hpos=1;matching_block_id=148571307_376994761_2_2_0;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=148571307_376994761_2_2_0__3100000;srepoch=1704469015;srpvid=01706dc7454c0161;type=total;ucfs=1&#hotelTmpl");
                break;

            case "Button 2":
                openURIInBrowser("https://www.makemytrip.com/hotels/hotel-details/?hotelId=201502101214012130&_uCurrency=INR&checkin=01052024&checkout=01112024&city=CTXGP&country=IN&homeStay=true&lat=17.16512&lng=73.27727&locusId=CTXGP&locusType=city&rank=1&reference=hotel&rf=directSearch&roomStayQualifier=2e0e&rsc=1e2e0e&searchText=Viki%20Holiday%20Home&topHtlId=201502101214012130&type=hotel&mtkeys=defaultMtkey");
                break;

            case "Button 3":
                openURIInBrowser("https://www.makemytrip.com/hotels/hotel_waves_boutique-details-ganpatipule.html");
                break;

            case "Button 4":
                openURIInBrowser("https://www.makemytrip.com/hotels/hotel-details/?hotelId=202103161616038868&_uCurrency=INR&adg=136835929822&aid=613596584830&campaign_type=search&cid=CjwKCAiA7t6sBhAiEiwAsaieYk6AJ2X66_iAMqju1rs7ijIHrzWqOmHF2BKJyqbXAhvNz-jMZRvfBhoCE74QAvD_BwE&city=CTXGP&cmp=SEM%7CD%7CDH%7CG%7CHname%7CDomestic_HName_RLSA_Exact_9%7C202103161616038868%7CRSA&country=IN&device=c&gad_source=1&gclid=CjwKCAiA7t6sBhAiEiwAsaieYk6AJ2X66_iAMqju1rs7ijIHrzWqOmHF2BKJyqbXAhvNz-jMZRvfBhoCE74QAvD_BwE&kw=hotel%20madhuban%20ganpatipule&lat=17.14557&lng=73.26895&locusId=CTXGP&locusType=city&mf_campaign=%7BHARDCODE_CAMPAIGN_NAME%7D&mf_campaignid=17893254713&mf_medium=cpc&mf_source=google&pl=&rank=1&reference=hotel&roomStayQualifier=2e0e&searchText=Ganpatipule&topHtlId=202103161616038868&type=city&mtkeys=defaultMtkey");
                break;

            case "Button 5":
                openURIInBrowser("https://www.makemytrip.com/hotels/atharva_stay_home-details-ganpatipule.html");
                break;

            case "Button 6":
                openURIInBrowser("https://www.trip.com/hotels/ganpatipule-hotel-detail-10178120/moreshwar-holiday-rooms/");
                break;

            case "Button 7":
                openURIInBrowser("https://www.yatra.com/hotels/hotels-in-ganpatipule/mathura-lodge");
                break;

            case "Button 8":
                openURIInBrowser("https://www.agoda.com/vamoose-yashwant-niwas/hotel/ratnagiri-in.html?cid=1844104&ds=m1EEJ2U6CfwAxs%2Ft");
                break;

            case "Button 9":
                openURIInBrowser("https://www.makemytrip.com/hotels/westbay_resort_spa_ganpatipule-details-ganpatipule.html");
                break;

            case "Button 10":
                openURIInBrowser("https://www.makemytrip.com/hotels/center_point_residency-details-ganpatipule.html");
                break;

            case "Button 11":
                openURIInBrowser("https://www.vio.com/Hotel/Search?MBL_flag=M&ad_type=meta&checkIn=2024-01-07&checkOut=2024-01-14&clickId=08d21e90-2082-4f56-ac29-67ee93006b12&curr=INR&datype=selected&epv=MS4y&esd=gkRjy1QNgt908qYeP9M6x4BfSpCwf9H2mqTDpC2m79YLAHTi7FeSY7MPhGD2Jf26jdSDNJUcw9ML6AsJjYVp2Fqm97Gq7fQHwHLk8rvK40nGzEJ1NjzwF1Je9w%3D%3D&forceCurrencyChange=1&forceLanguageChange=1&fsmr=&hotelId=66548526&label=src%3DTripAdvisor%26price%3D19288.15%26currency%3DINR%26_th%3De5e1cbd735a95234244599b160c879208fafe31dfc9526c1%26olut%3D1704468554%26dts%3D1704468554%26canPayLater%3Dfalse&lang=en&oti=yFlX8SU6xVk&p=n&preferredRate=19288.15&profile=r2d2m73kn8&rate_qualifier=public&rooms=2&userCountry=IN&utm_campaign=TripAdvisor&utm_medium=cpc&utm_source=TripAdvisor");
                break;

            case "Button 12":
                openURIInBrowser("https://www.makemytrip.com/hotels/magnolia_by_the_beach-details-ganpatipule.html");
                break;

            case "Button 13":
                openURIInBrowser("https://www.makemytrip.com/hotels/shiv_sagar_palace-details-ganpatipule.html");
                break;

            case "Button 14":
                openURIInBrowser("https://www.makemytrip.com/hotels/yash_garden_residency-details-ganpatipule.html");
                break;

            case "Button 15":
                openURIInBrowser("https://www.makemytrip.com/hotels/redstone_house_by_ekdant_holiday_home-details-ganpatipule.html");
                break;

            case "Button 16":
                openURIInBrowser("https://www.makemytrip.com/hotels/sarthak_guest_house-details-ganpatipule.html");
                break;

            case "Button 17":
                openURIInBrowser("https://www.makemytrip.com/hotels/omkar_nivas-details-ganpatipule.html");
                break;

            case "Button 18":
                openURIInBrowser("https://www.makemytrip.com/hotels/hotel-details/?hotelId=201410301316054856&_uCurrency=INR&adg=139053219549&aid=626793713197&campaign_type=search&cid=CjwKCAiA7t6sBhAiEiwAsaieYk6AJ2X66_iAMqju1rs7ijIHrzWqOmHF2BKJyqbXAhvNz-jMZRvfBhoCE74QAvD_BwE&city=CTXGP&cmp=SEM%7CD%7CDH%7CG%7CHname%7CDomestic_HName_RLSA_Exact_9%7C201410301316054856%7CRSA%7C&country=IN&device=c&gad_source=1&gclid=CjwKCAiA7t6sBhAiEiwAsaieYk6AJ2X66_iAMqju1rs7ijIHrzWqOmHF2BKJyqbXAhvNz-jMZRvfBhoCE74QAvD_BwE&kw=hotel%20atithi%20lodge%20ganpatipule&lat=17.14277&lng=73.26962&locusId=CTXGP&locusType=city&mf_campaign=%7BHARDCODE_CAMPAIGN_NAME%7D&mf_campaignid=17893254713&mf_medium=cpc&mf_source=google&pl=&rank=1&reference=hotel&roomStayQualifier=2e0e&searchText=Ganpatipule&topHtlId=201410301316054856&type=city&mtkeys=defaultMtkey");
                break;

            case "Button 19":
                openURIInBrowser("https://www.agoda.com/en-in/green-leaf-resort-spa-ganpatipule/hotel/ganpatipule-in.html?finalPriceView=1&isShowMobileAppPrice=false&cid=1891440&numberOfBedrooms=&familyMode=false&adults=2&children=0&rooms=1&maxRooms=0&checkIn=2024-01-7&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=1&showReviewSubmissionEntry=false&currencyCode=INR&isFreeOccSearch=false&tag=fb8fe73f-7796-4a3f-91b0-387ebfa2db07&isCityHaveAsq=false&tspTypes=4%2C8&los=7&searchrequestid=18491037-ece9-48a2-bad3-0dff0ccc230a&ds=aVsz%2Fm8AT9epRCzN");
                break;

            case "Button 20":
                openURIInBrowser("https://www.makemytrip.com/hotels/oceano_retreat-details-ganpatipule.html");
                break;

            default:
                // Handle default case or throw an exception if needed
                throw new IllegalArgumentException("Invalid button text: " + buttonText);
        }
    }
    public static void openURIInBrowser(String uriString) {
        try {
            URI uri = new URI(uriString);
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    // Your existing isValidDate method
    public static boolean isValidDate(int day, int month, int year) {
        // Check if the month is valid (between 1 and 12)
        if (month < 1 || month > 12) {
            return false;
        }
        return true;
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new Hotel();
    }
}