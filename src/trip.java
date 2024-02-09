import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class trip extends JFrame implements ActionListener
{
    JButton startPlanning, invite, c1,c2,c3,c4,c5,b1,b2,b3,button1,yourButton,saveButton;
    int days, day;
    JButton[] customButtons,yourdel;
    JFrame itineraryFrame;
    String[] placesList = {
            "Ganpatipule Temple",
            "Ganpatipule Beach",
            "Jai Vinayak Temple",
            "Ratnadurg Fort",
            "Jaigad Lighthouse",
            "Bhatye Beach",
            "Aare Ware Beach",
            "Ganesh Ghule Beach",
            "Swami Swaroopanand Samadhi Math",
            "Kanakaditya Temple",
            "Tilak Ali Museum",
            "Thiba Palace"
    };
    String[] mumList = {
            "Gateway of India",
            "Siddhivinayak Temple",
            "Chhatrapati Shivaji Maharaj Terminus (CSMT)",
            "Marine Drive",
            "Chowpatty Beach",
            "Elephanta Caves",
            "Haji Ali Dargah",
            "Juhu Beach",
            "Colaba Causeway",
            "Kanheri Caves",
            "Nehru Science Centre",
            "Mumbai Film City"
    };
    String[] nashikList = {
            "Trimbakeshwar Temple",
            "Saptashrungi Devi Temple",
            "Kalaram Temple",
            "Muktidham",
            "Sula Vineyards",
            "Pandavleni Caves",
            "Sita Gufaa",
            "Coin Museum",
            "Someshwar Waterfalls",
            "Gangapur Dam",
            "Ram Kund",
            "Nashik Caves"
    };
    String[] sambhajinagarList = {
            "Bibi Ka Maqbara",
            "Ellora Caves",
            "Daulatabad Fort",
            "Aurangabad Caves",
            "Grishneshwar Jyotirlinga Temple",
            "Panchakki",
            "Siddharth Garden and Zoo",
            "Salim Ali Lake",
            "Gul Mandi",
            "Himayat Bagh",
            "Prozone Mall",
            "Goga Baba Hill"
    };
    String[] puneList = {
            "Shaniwar Wada",
            "Aga Khan Palace",
            "Sinhagad Fort",
            "Osho Ashram",
            "Dagdusheth Halwai Ganpati Temple",
            "Lal Mahal",
            "Raja Dinkar Kelkar Museum",
            "Katraj Snake Park",
            "Saras Baug",
            "Parvati Hill",
            "Mulshi Lake and Dam",
            "Chaturshringi Temple"
    };
    int OGHeight =1500,MaxHeight = OGHeight+100,i = 1,yPosition=10;
    JScrollPane scrollPane1;
    JPanel contentPanel,blackPanels;
    JPanel[] customlabel;
    ImageIcon place1,place2,place3;
    JFrame ratnagiriFrame,mumbaiFrame,puneFrame,SambhajinagerFrame,nashikFrame;

    JLabel label, startDateLabel, endDateLabel;
    String endDateStr, startDateStr, citystr, rtnstr, mumstr, pnstr, smbjstr, nshkstr;
    JTextField startDateField, endDateField;
    Font fontTxt = new Font("Open sauce", Font.PLAIN, 20);
    Font font = new Font("Arial", Font.BOLD, 29);

    trip() {
        setSize(730, 450);

        getContentPane().setBackground(new Color(0x92A7BA));
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/Copy of Untitled Design.png"));
        Image a2 = a1.getImage().getScaledInstance(683, 384, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(18, 0, 683, 384);
        add(a4);

        endDateField = new JTextField();
        endDateField.setBounds(290, 260, 194, 48);
        endDateField.setFont(fontTxt);
        add(endDateField);

        startDateField = new JTextField();
        startDateField.setBounds(50, 260, 194, 48);
        startDateField.setFont(fontTxt);
        add(startDateField);

        ImageIcon s = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\invite.png");
        invite = new JButton(s);
        invite.setBounds(532, 230, 136, 38);
        invite.setBorder(BorderFactory.createEmptyBorder());
        invite.addActionListener(this);
        add(invite);

        ImageIcon d = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\start planning.png");
        startPlanning = new JButton(d);
        startPlanning.setBounds(532, 280, 136, 38);
        startPlanning.setBorder(BorderFactory.createEmptyBorder());
        startPlanning.addActionListener(this);
        add(startPlanning);

        ImageIcon a = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\c1.png");
        c1 = new JButton(a);
        c1.setBounds(80, 128, 77, 24);
        c1.setBorder(BorderFactory.createEmptyBorder());
        c1.setBackground(new Color(0x09389F));
        c1.addActionListener(this);
        add(c1);

        ImageIcon b = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\c2.png");
        c2 = new JButton(b);
        c2.setBounds(160, 128, 77, 24);
        c2.setBorder(BorderFactory.createEmptyBorder());
        c2.addActionListener(this);
        c2.setBackground(new Color(0x09389F));
        add(c2);

        ImageIcon c = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\c3.png");
        c3 = new JButton(c);
        c3.setBounds(240, 128, 77, 24);
        c3.setBorder(BorderFactory.createEmptyBorder());
        c3.addActionListener(this);
        c3.setBackground(new Color(0x09389F));
        c3.setLayout(null);
        add(c3);

        ImageIcon e = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\c4.png");
        c4 = new JButton(e);
        c4.setBounds(320, 128, 77, 24);
        c4.setBorder(BorderFactory.createEmptyBorder());
        c4.addActionListener(this);
        c4.setBackground(new Color(0x09389F));
        add(c4);

        ImageIcon f = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\c5.png");
        c5 = new JButton(f);
        c5.setBounds(400, 128, 77, 24);
        c5.setBorder(BorderFactory.createEmptyBorder());
        c5.addActionListener(this);
        c5.setBackground(new Color(0x09389F));
        add(c5);

        rtnstr = "Ratnagiri";
        mumstr = "Mumbai";
        pnstr = "Pune";
        smbjstr = "Sambhajinager";
        nshkstr = "Nashik";

        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == c1) {
            citystr = rtnstr;
        } else if (e.getSource() == c2) {
            citystr = mumstr;
        } else if (e.getSource() == c3) {
            citystr = pnstr;
        } else if (e.getSource() == c4) {
            citystr = smbjstr;
        } else if (e.getSource() == c5) {
            citystr = nshkstr;
        }
       else if (e.getSource() == startPlanning) {
            startDateStr = startDateField.getText();
            endDateStr = endDateField.getText();

            try {
                Scanner scanner = new Scanner(startDateStr);
                scanner.useDelimiter("-");
                int startDay = scanner.nextInt();
                int startMonth = scanner.nextInt();
                int startYear = scanner.nextInt();

                scanner = new Scanner(endDateStr);
                scanner.useDelimiter("-");
                int endDay = scanner.nextInt();
                int endMonth = scanner.nextInt();
                int endYear = scanner.nextInt();
                LocalDate currentDate = LocalDate.now();

                // Extract day, month, and year
                int curday = currentDate.getDayOfMonth();
                int curmonth = currentDate.getMonthValue();
                int curyear = currentDate.getYear();

                if ((startYear == 2024) && (endYear == 2024))
                {
                    if (startYear < endYear || (startYear == endYear && startMonth < endMonth) || (startYear == endYear && startMonth == endMonth && startDay <= endDay)) {
                            Date startDate = new Date(startYear - 1900, startMonth - 1, startDay);
                            Date endDate = new Date(endYear - 1900, endMonth - 1, endDay);

                            long difference = endDate.getTime() - startDate.getTime();
                            days = (int) (difference / (24 * 60 * 60 * 1000));
                            JOptionPane.showMessageDialog(getContentPane(), "Number of days : " + days, "Result", JOptionPane.INFORMATION_MESSAGE);
                            setVisible(false);

                            // Call the appropriate itinerary method based on the selected city
                            if (citystr != null) {
                                switch (citystr) {
                                    case "Ratnagiri":
                                        ratnagiri(startDateStr, endDateStr);
                                        break;
                                    case "Mumbai":
                                        mumbai(startDateStr, endDateStr);
                                        break;
                                    case "Pune":
                                        pune(startDateStr, endDateStr);
                                        break;
                                    case "Sambhajinager":
                                        sambhajinager(startDateStr, endDateStr);
                                        break;
                                    case "Nashik":
                                        nashik(startDateStr, endDateStr);
                                        break;
                                    default:
                                        // Handle unexpected city
                                        break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(getContentPane(), "City isn't Selected !!!! ");
                                new trip();
                            }
                        } else {
                            JOptionPane.showMessageDialog(getContentPane(), "Dates are Invalid");
                        }

                    }
                else
                {
                    if (endYear >= 2024 || startYear >= 2024) {
                        JOptionPane.showMessageDialog(getContentPane(), "Sir you can't travel for Year \uD83D\uDC68\u200D✈\uFE0F", "Invalid Date", JOptionPane.INFORMATION_MESSAGE);
                    } else if (endYear <= 2024 || startYear >= 2024) {
                        JOptionPane.showMessageDialog(getContentPane(), "Sir you can't travel for in PAST ⌚ ", "Invalid Date", JOptionPane.ERROR_MESSAGE);
                    }

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(getContentPane(), "Invalid date format. Please use dd-MM-yyyy.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == invite) {
            openInviteFrame();
        } // Check if b1 (places) button is clicked

        if (e.getSource() == b1) {
            // Handle action for places button (e.g., show a dialog to add a new place)
            if (citystr == rtnstr) {
                new places_ratnagiri();
            } else if (citystr == smbjstr ) {
                JOptionPane.showMessageDialog(SambhajinagerFrame, "Button b1 (Places) clicked!");
            } else if (citystr == mumstr) {
                JOptionPane.showMessageDialog(mumbaiFrame, "Button b1 (Places) clicked!" );
            } else if (citystr == pnstr) {
                JOptionPane.showMessageDialog(puneFrame, "Button b1 (Places) clicked!");
            } else if (citystr == nshkstr) {
                JOptionPane.showMessageDialog(nashikFrame, " Button b1 (Places) clicked!" );
            }
        }
        // Check if b2 (hotels) button is clicked
        else if (e.getSource() == b2) {
            if (citystr == rtnstr) {
                new Hotel_ratnagiri();
            } else if (citystr == smbjstr ) {
                JOptionPane.showMessageDialog(SambhajinagerFrame, "Button b2 (Places) clicked!");
            } else if (citystr == mumstr) {
                JOptionPane.showMessageDialog(mumbaiFrame, "Button b2 (Places) clicked!" );
            } else if (citystr == pnstr) {
                JOptionPane.showMessageDialog(puneFrame, "Button b2 (Places) clicked!");
            } else if (citystr == nshkstr) {
                JOptionPane.showMessageDialog(nashikFrame, " Button b2 (Places) clicked!" );
            }
        }
        // Check if b3 (restaurants) button is clicked
        else if (e.getSource() == b3) {
            if (citystr == rtnstr) {
                JOptionPane.showMessageDialog(ratnagiriFrame, "Button b3 (Places) clicked!");
            } else if (citystr == smbjstr ) {
                JOptionPane.showMessageDialog(SambhajinagerFrame, "Button b3 (Places) clicked!");
            } else if (citystr == mumstr) {
                JOptionPane.showMessageDialog(mumbaiFrame, "Button b3 (Places) clicked!" );
            } else if (citystr == pnstr) {
                JOptionPane.showMessageDialog(puneFrame, "Button b3 (Places) clicked!");
            } else if (citystr == nshkstr) {
                JOptionPane.showMessageDialog(nashikFrame, " Button b3 (Places) clicked!" );
            };
        }
        for (int i = 0; i < yourdel.length; i++)
        {
            if (e.getSource() == yourdel[i]) {
                day = i; // Use the array index directly as it represents the day
                removePlaceFromDay(day);
                return; // Exit the method after handling the "Delete" button click
            }
        }
        if (e.getSource() == saveButton)
        {
            // Handle action for the saveButton (e.g., save places to the database)
            savePlacesToDatabase();
        }
        //array actionperfomred
        for (int i = 0; i < customButtons.length; i++)
        {
            if (e.getSource() == customButtons[i])
            {
                int day = findDayForButton(i);

                // Ensure a day is available
                if (day >= 0 && day < days) {
                    if (customlabel[day].getComponentCount() > 0)
                    {
                        itineraryFrame = new JFrame();
                        if (citystr == rtnstr)
                        {
                            itineraryFrame = ratnagiriFrame;
                        } else if (citystr == smbjstr )
                        {
                            itineraryFrame = SambhajinagerFrame;
                        } else if (citystr == mumstr)
                        {
                            itineraryFrame = mumbaiFrame;
                        } else if (citystr == pnstr)
                        {
                            itineraryFrame = puneFrame;
                        } else if (citystr == nshkstr) {
                            itineraryFrame = nashikFrame;
                        }

                        // Day is occupied, ask user if they want to remove the current place
                        int choice = JOptionPane.showConfirmDialog(itineraryFrame,
                                "Do you want to remove the current place for Day " + (day + 1) + " ?",
                                "Remove Place",
                                JOptionPane.YES_NO_OPTION);

                        if (choice == JOptionPane.YES_OPTION) {
                            // User wants to remove the current place
                            customlabel[day].removeAll();
                        } else {
                            // User canceled the removal, do nothing
                            return;
                        }
                    }

                    // Retrieve the place from the clicked JButton's text
                    String newPlace = customButtons[i].getText();

                    System.out.println("Button " + (i + 1) + " clicked for Day " + (day + 1));
                    System.out.println("Selected Place: " + newPlace);

                    // Add the new place to the day
                    addPlaceToDay(day, newPlace);
                }
            }
        }

    }

    public void ratnagiri(String startDateStr, String endDateStr)
    {
        ratnagiriFrame = new JFrame();
        ratnagiriFrame.setTitle("Itinerary");
        ratnagiriFrame.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1366, 768);
        ratnagiriFrame.add(scrollPane);
        ratnagiriFrame.setBackground(new Color(0x92A7BA));

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 1680));
        contentPanel.setBackground(new Color(146, 167, 186, 255));
        scrollPane.setViewportView(contentPanel);

        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0x267AEC);
                this.trackColor = new Color(0x1462CB);
            }
        });

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Copy of iternary.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        label = new JLabel(imageIcon);
        label.setSize(1366, 768);
        contentPanel.add(label);

        place1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB1.png");
        b1 = new JButton(place1);
        b1.setBounds(130,250,354,187);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        label.add(b1);

        place2 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB2.png");
        b2 = new JButton(place2);
        b2.setBounds(130 + 354 + 71, 250, 354, 187);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        label.add(b2);

        place3 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB3.png");
        b3 = new JButton(place3);
        b3.setBounds(130 + (354 + 71) * 2, 250, 354, 187);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        label.add(b3);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("DButns/JPanal.png"));
        Image a2 = a1.getImage().getScaledInstance(460, 80, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(550, 160, 470, 80);
        label.add(a4);

        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/Recommended_places_ratnagiri.png"));
        Image b2 = b1.getImage().getScaledInstance(1200, 259, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel b4 = new JLabel(b3);
        b4.setBounds(130,480, 1200, 259); // Adjust the y-coordinate as needed
        label.add(b4);

        ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("icons/itinerary_frame.png"));
        Image f2 = f1.getImage().getScaledInstance(1366,64, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel f4 = new JLabel(f3);
        f4.setBounds(0,780, 1366, 64); // Adjust the y-coordinate as needed
        contentPanel.add(f4);

        ImageIcon frame = new ImageIcon(ClassLoader.getSystemResource("icons/add_place.png"));
        Image frame1 = frame.getImage().getScaledInstance(729, 110, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(frame1);

        scrollPane1 = new JScrollPane();
        scrollPane1.setBounds(770, 870, 570, 470);
        scrollPane1.getViewport().setBackground(new Color(0x235568));
        scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        contentPanel.add(scrollPane1);

        JPanel subplaces = new JPanel();
        subplaces.setLayout(null);
        subplaces.setPreferredSize(new Dimension(555,1500));
        subplaces.setBackground(new Color(0x1462CB));
        scrollPane1.setViewportView(subplaces);

        //displaying using for loop places icons
        customButtons = new JButton[12];
        for (i = 1; i <= 12; i++) {
            String imagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Subplaces\\w" + i + ".png";
            ImageIcon qImageIcon = new ImageIcon(imagePath);
            Image img = qImageIcon.getImage().getScaledInstance(535, 112, Image.SCALE_SMOOTH);
            qImageIcon = new ImageIcon(img);

            JLabel qLabel = new JLabel(qImageIcon);
            qLabel.setBounds(5, yPosition, 535, 112);
            subplaces.add(qLabel);

            String buttonImagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\plus-32_add.png";
            ImageIcon buttonIcon = new ImageIcon(buttonImagePath);
            Image buttonImage = buttonIcon.getImage().getScaledInstance(34, 34, Image.SCALE_SMOOTH);
            buttonIcon = new ImageIcon(buttonImage);

            button1 = new JButton(buttonIcon);
            button1.setBounds(489, 9, 40, 34);
            button1.setBackground(new Color(0x235568));
            button1.setBorder(BorderFactory.createEmptyBorder());

            // Set the text of the button to the corresponding place from placesList
            button1.setText(placesList[i - 1]);

            customButtons[i - 1] = button1;
            button1.addActionListener(this);
            qLabel.add(button1);

            JScrollBar verticalScrollBar = scrollPane1.getVerticalScrollBar();
            verticalScrollBar.setUI(new BasicScrollBarUI() {
                @Override
                protected void configureScrollBarColors() {
                    this.thumbColor = new Color(0x267AEC);
                    this.trackColor = new Color(0x1462CB);
                }
            });
            yPosition += 127;
        }
        customlabel = new JPanel[days];
        yourdel = new JButton[days];

        for (int i = 0; i < days; i++) {
            JLabel label = new JLabel(scaledImageIcon);
            int xPos = 20;
            int yPos = 870 + i * 120;
            label.setBounds(xPos, yPos, 729, 110);

            int sentence = i + 1;
            JLabel no_days = new JLabel(String.valueOf(sentence));
            no_days.setBackground(new Color(0xFF000000, true));
            no_days.setForeground(new Color(0x000000));
            no_days.setBounds(49, 58, 35, 25);
            no_days.setFont(new Font("Open Sauce", Font.BOLD, 25));
            label.add(no_days);

            blackPanels = new JPanel();
            blackPanels.setBackground(new Color(0xE3E0DE));
            blackPanels.setBounds(140, 50, 546, 48);
            blackPanels.setFont(new Font("Open Sauce", Font.BOLD, 25));
            customlabel[i] = blackPanels;
            label.add(blackPanels);

            ImageIcon del = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Delete.png");
            yourButton = new JButton(del);
            yourButton.setSize(35, 35);
            // Set the location of the button to the right side of blackPanels
            int buttonX = blackPanels.getX() + blackPanels.getWidth();
            int buttonY = blackPanels.getY() + (blackPanels.getHeight() - yourButton.getHeight()) / 2;
            yourButton.setLocation(buttonX - 20, buttonY - 50);
            yourButton.setBackground(new Color(0xFF2FA3FF, true));
            yourButton.setBorder(BorderFactory.createEmptyBorder());
            yourdel[i] = yourButton; // Fix the array index here
            yourButton.addActionListener(this);
            label.add(yourButton);

            ImageIcon backIcon1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
            JButton back = new JButton(backIcon1); // back
            back.setBackground(new Color(0x2FA3FF));
            back.setBorder(BorderFactory.createEmptyBorder());
            back.setBounds(1260, 1300, 60, 60);
            back.setFont(new Font("open sauce", Font.BOLD, 20));
            back.setForeground(Color.BLACK);
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Set the JFrame to invisible when back button is clicked
                    ratnagiriFrame.setVisible(false);

                }
            });
            contentPanel.add(back);

            contentPanel.add(label);
            OGHeight = Math.max(OGHeight, yPosition + 110);
        }
        // Adjust the height of the contentPanel based on the maxHeight
        contentPanel.setPreferredSize(new Dimension(contentPanel.getPreferredSize().width,MaxHeight));

        saveButton = new JButton("Click Me !!! to save your Trip :)");
        saveButton.setBounds(770, 1340, 570, 30);
        saveButton.addActionListener(this);
        saveButton.setBackground(new Color(0xAF032C));
        saveButton.setBackground(new Color(0xF9F8FC));
        contentPanel.add(saveButton);

        startDateLabel = new JLabel(startDateStr);
        startDateLabel.setBounds(60, 18, 200, 40);
        startDateLabel.setFont(font);
        startDateLabel.setForeground(Color.BLACK);
        a4.add(startDateLabel);

        endDateLabel = new JLabel("TO:  " + endDateStr);
        endDateLabel.setBounds(200, 18, 230, 40);
        endDateLabel.setFont(font);
        endDateLabel.setForeground(new Color(0x000000));
        a4.add(endDateLabel);

        // Add specific content for Ratnagiri itinerary
        JLabel ratnagiriLabel = new JLabel("Ratnagiri Itinerary");
        ratnagiriLabel.setBounds(60, 80, 300, 40);
        ratnagiriLabel.setFont(font);
        ratnagiriLabel.setForeground(new Color(0x000000));
        a4.add(ratnagiriLabel);

        ratnagiriFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ratnagiriFrame.setLocationRelativeTo(null);
        ratnagiriFrame.setVisible(true);
    }
    private void mumbai(String startDateStr, String endDateStr)
    {
        mumbaiFrame = new JFrame();
        mumbaiFrame.setTitle("Itinerary");
        mumbaiFrame.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1366, 768);
        mumbaiFrame.add(scrollPane);
        mumbaiFrame.setBackground(new Color(0x92A7BA));

        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0x267AEC);
                this.trackColor = new Color(0x1462CB);
            }
        });

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 1680));
        contentPanel.setBackground(new Color(146, 167, 186, 255));
        scrollPane.setViewportView(contentPanel);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\mumbai_iternary.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        label = new JLabel(imageIcon);
        label.setSize(1366, 768);
        contentPanel.add(label);

        place1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB1.png");
        b1 = new JButton(place1);
        b1.setBounds(130,250,354,187);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        label.add(b1);

        place2 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB2.png");
        b2 = new JButton(place2);
        b2.setBounds(130 + 354 + 71, 250, 354, 187);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        label.add(b2);

// Third button with a space of 71
        place3 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB3.png");
        b3 = new JButton(place3);
        b3.setBounds(130 + (354 + 71) * 2, 250, 354, 187);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        label.add(b3);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("DButns/JPanal.png"));
        Image a2 = a1.getImage().getScaledInstance(460, 80, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(550, 160, 470, 80);
        label.add(a4);

        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/rec_mum.png"));
        Image b2 = b1.getImage().getScaledInstance(1200, 259, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel b4 = new JLabel(b3);
        b4.setBounds(130,480, 1200, 259); // Adjust the y-coordinate as needed
        label.add(b4);

        ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("icons/itinerary_frame.png"));
        Image f2 = f1.getImage().getScaledInstance(1366,64, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel f4 = new JLabel(f3);
        f4.setBounds(0,780, 1366, 64); // Adjust the y-coordinate as needed
        contentPanel.add(f4);

        ImageIcon frame = new ImageIcon(ClassLoader.getSystemResource("icons/add_place.png"));
        Image frame1 = frame.getImage().getScaledInstance(729, 110, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(frame1);

        scrollPane1 = new JScrollPane();
        scrollPane1.setBounds(770, 870, 570, 470);
        scrollPane1.getViewport().setBackground(new Color(0x235568));
        scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        contentPanel.add(scrollPane1);

        JPanel subplaces = new JPanel();
        subplaces.setLayout(null);
        subplaces.setPreferredSize(new Dimension(555,1500));
        subplaces.setBackground(new Color(0x1462CB));
        scrollPane1.setViewportView(subplaces);

        customButtons = new JButton[12];
        for (i = 1; i <= 12; i++) {
            String imagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Subplaces\\q" + i + ".png";
            ImageIcon qImageIcon = new ImageIcon(imagePath);
            Image img = qImageIcon.getImage().getScaledInstance(535, 112, Image.SCALE_SMOOTH);
            qImageIcon = new ImageIcon(img);

            JLabel qLabel = new JLabel(qImageIcon);
            qLabel.setBounds(5, yPosition, 535, 112);
            subplaces.add(qLabel);

            String buttonImagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\plus-32_add.png";
            ImageIcon buttonIcon = new ImageIcon(buttonImagePath);
            Image buttonImage = buttonIcon.getImage().getScaledInstance(34, 34, Image.SCALE_SMOOTH);
            buttonIcon = new ImageIcon(buttonImage);

            button1 = new JButton(buttonIcon);
            button1.setBounds(489, 9, 34, 34);
            button1.setBackground(new Color(0x235568));
            button1.setBorder(BorderFactory.createEmptyBorder());

            // Set the text of the button to the corresponding place from placesList
            button1.setText(mumList[i - 1]);

            customButtons[i - 1] = button1;
            button1.addActionListener(this);
            qLabel.add(button1);

            JScrollBar verticalScrollBar = scrollPane1.getVerticalScrollBar();
            verticalScrollBar.setUI(new BasicScrollBarUI() {
                @Override
                protected void configureScrollBarColors() {
                    this.thumbColor = new Color(0x267AEC);
                    this.trackColor = new Color(0x1462CB);
                }
            });
            yPosition += 127;
        }

        customlabel = new JPanel[days];
        yourdel = new JButton[days];

        for (int i = 0; i < days; i++) {
            JLabel label = new JLabel(scaledImageIcon);
            int xPos = 20;
            int yPos = 870 + i * 120;
            label.setBounds(xPos, yPos, 729, 110);

            int sentence = i + 1;
            JLabel no_days = new JLabel(String.valueOf(sentence));
            no_days.setBackground(new Color(0xFF000000, true));
            no_days.setForeground(new Color(0x000000));
            no_days.setBounds(49, 58, 35, 25);
            no_days.setFont(new Font("Open Sauce", Font.BOLD, 25));
            label.add(no_days);

            blackPanels = new JPanel();
            blackPanels.setBackground(new Color(0xE3E0DE));
            blackPanels.setBounds(140, 50, 546, 48);
            blackPanels.setFont(new Font("Open Sauce", Font.BOLD, 25));
            customlabel[i] = blackPanels;
            label.add(blackPanels);

            ImageIcon del = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Delete.png");
            yourButton = new JButton(del);
            yourButton.setSize(35, 35);
            // Set the location of the button to the right side of blackPanels
            int buttonX = blackPanels.getX() + blackPanels.getWidth();
            int buttonY = blackPanels.getY() + (blackPanels.getHeight() - yourButton.getHeight()) / 2;
            yourButton.setLocation(buttonX - 20, buttonY - 50);
            yourButton.setBackground(new Color(0xFF2FA3FF, true));
            yourButton.setBorder(BorderFactory.createEmptyBorder());
            yourdel[i] = yourButton; // Fix the array index here
            yourButton.addActionListener(this);
            label.add(yourButton);

            contentPanel.add(label);
            OGHeight = Math.max(OGHeight, yPosition + 110);
        }
        // Adjust the height of the contentPanel based on the maxHeight
        contentPanel.setPreferredSize(new Dimension(contentPanel.getPreferredSize().width,MaxHeight));


        startDateLabel = new JLabel(startDateStr);
        startDateLabel.setBounds(60, 18, 200, 40);
        startDateLabel.setFont(font);
        startDateLabel.setForeground(Color.BLACK);
        a4.add(startDateLabel);

        endDateLabel = new JLabel("TO:  " + endDateStr);
        endDateLabel.setBounds(200, 18, 230, 40);
        endDateLabel.setFont(font);
        endDateLabel.setForeground(new Color(0x000000));
        a4.add(endDateLabel);

        // Add specific content for Mumbsi itinerary
        JLabel mumbsiLabel = new JLabel("Mumbai Itinerary");
        mumbsiLabel.setBounds(60, 80, 300, 40);
        mumbsiLabel.setFont(font);
        mumbsiLabel.setForeground(new Color(0x000000));
        a4.add(mumbsiLabel);

        ImageIcon backIcon1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
        JButton back = new JButton(backIcon1); // back
        back.setBackground(new Color(0xDB9205));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1260, 1900, 60, 60);
        back.setFont(new Font("open sauce", Font.BOLD, 20));
        back.setForeground(Color.BLACK);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the JFrame to invisible when back button is clicked
                mumbaiFrame.setVisible(false);
                ImageIcon backIcon1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
                JButton back = new JButton(backIcon1); // back
                back.setBackground(new Color(0x2FA3FF));
                back.setBorder(BorderFactory.createEmptyBorder());
                back.setBounds(1260, 1300, 60, 60);
                back.setFont(new Font("open sauce", Font.BOLD, 20));
                back.setForeground(Color.BLACK);
                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Set the JFrame to invisible when back button is clicked
                        mumbaiFrame.setVisible(false);

                    }
                });
                contentPanel.add(back);
            }
        });
        contentPanel.add(back);

        mumbaiFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mumbaiFrame.setLocationRelativeTo(null);
        mumbaiFrame.setVisible(true);
    }
    private void pune(String startDateStr, String endDateStr)
    {
        puneFrame = new JFrame();
        puneFrame.setTitle("Itinerary");
        puneFrame.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1366, 768);
        puneFrame.add(scrollPane);
        puneFrame.setBackground(new Color(0x92A7BA));

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 1680));
        contentPanel.setBackground(new Color(146, 167, 186, 255));
        scrollPane.setViewportView(contentPanel);

        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0x267AEC);
                this.trackColor = new Color(0x1462CB);
            }
        });

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\pune_iternary.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        label = new JLabel(imageIcon);
        label.setSize(1366, 768);
        contentPanel.add(label);

        ImageIcon place1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB1.png");
        b1 = new JButton(place1);
        b1.setBounds(130,250,354,187);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        label.add(b1);

        ImageIcon place2 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB2.png");
        b2 = new JButton(place2);
        b2.setBounds(130 + 354 + 71, 250, 354, 187);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        label.add(b2);

        ImageIcon place3 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB3.png");
        b3 = new JButton(place3);
        b3.setBounds(130 + (354 + 71) * 2, 250, 354, 187);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        label.add(b3);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("DButns/JPanal.png"));
        Image a2 = a1.getImage().getScaledInstance(460, 80, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(550, 160, 470, 80);
        label.add(a4);

        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/rec_mum.png"));
        Image b2 = b1.getImage().getScaledInstance(1200, 259, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel b4 = new JLabel(b3);
        b4.setBounds(130,480, 1200, 259); // Adjust the y-coordinate as needed
        label.add(b4);

        ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("icons/itinerary_frame.png"));
        Image f2 = f1.getImage().getScaledInstance(1366,64, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel f4 = new JLabel(f3);
        f4.setBounds(0,780, 1366, 64); // Adjust the y-coordinate as needed
        contentPanel.add(f4);

        ImageIcon frame = new ImageIcon(ClassLoader.getSystemResource("icons/add_place.png"));
        Image frame1 = frame.getImage().getScaledInstance(729, 110, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(frame1);

        scrollPane1 = new JScrollPane();
        scrollPane1.setBounds(770, 870, 570, 470);
        scrollPane1.getViewport().setBackground(new Color(0x235568));
        scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        contentPanel.add(scrollPane1);

        JPanel subplaces = new JPanel();
        subplaces.setLayout(null);
        subplaces.setPreferredSize(new Dimension(555, 1700));
        subplaces.setBackground(new Color(0x1462CB));
        scrollPane1.setViewportView(subplaces);

        customButtons = new JButton[12];
        for (i = 1; i <= 12; i++) {
            String imagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Subplaces\\d" + i + ".png";
            ImageIcon qImageIcon = new ImageIcon(imagePath);
            Image img = qImageIcon.getImage().getScaledInstance(535, 112, Image.SCALE_SMOOTH);
            qImageIcon = new ImageIcon(img);

            JLabel qLabel = new JLabel(qImageIcon);
            qLabel.setBounds(5, yPosition, 535, 112);
            subplaces.add(qLabel);

            String buttonImagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\plus-32_add.png";
            ImageIcon buttonIcon = new ImageIcon(buttonImagePath);
            Image buttonImage = buttonIcon.getImage().getScaledInstance(34, 34, Image.SCALE_SMOOTH);
            buttonIcon = new ImageIcon(buttonImage);

            button1 = new JButton(buttonIcon);
            button1.setBounds(489, 9, 34, 34);
            button1.setBackground(new Color(0x235568));
            button1.setBorder(BorderFactory.createEmptyBorder());

            // Set the text of the button to the corresponding place from placesList
            button1.setText(puneList[i - 1]);

            customButtons[i - 1] = button1;
            button1.addActionListener(this);
            qLabel.add(button1);

            JScrollBar verticalScrollBar = scrollPane1.getVerticalScrollBar();
            verticalScrollBar.setUI(new BasicScrollBarUI() {
                @Override
                protected void configureScrollBarColors() {
                    this.thumbColor = new Color(0x267AEC);
                    this.trackColor = new Color(0x1462CB);
                }
            });
            yPosition += 127;
        }

        customlabel = new JPanel[days];
        yourdel = new JButton[days];

        for (int i = 0; i < days; i++) {
            JLabel label = new JLabel(scaledImageIcon);
            int xPos = 20;
            int yPos = 870 + i * 120;
            label.setBounds(xPos, yPos, 729, 110);

            int sentence = i + 1;
            JLabel no_days = new JLabel(String.valueOf(sentence));
            no_days.setBackground(new Color(0xFF000000, true));
            no_days.setForeground(new Color(0x000000));
            no_days.setBounds(49, 58, 35, 25);
            no_days.setFont(new Font("Open Sauce", Font.BOLD, 25));
            label.add(no_days);

            blackPanels = new JPanel();
            blackPanels.setBackground(new Color(0xE3E0DE));
            blackPanels.setBounds(140, 50, 546, 48);
            blackPanels.setFont(new Font("Open Sauce", Font.BOLD, 25));
            customlabel[i] = blackPanels;
            label.add(blackPanels);

            ImageIcon del = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Delete.png");
            yourButton = new JButton(del);
            yourButton.setSize(35, 35);
            // Set the location of the button to the right side of blackPanels
            int buttonX = blackPanels.getX() + blackPanels.getWidth();
            int buttonY = blackPanels.getY() + (blackPanels.getHeight() - yourButton.getHeight()) / 2;
            yourButton.setLocation(buttonX - 20, buttonY - 50);
            yourButton.setBackground(new Color(0xFF2FA3FF, true));
            yourButton.setBorder(BorderFactory.createEmptyBorder());
            yourdel[i] = yourButton; // Fix the array index here
            yourButton.addActionListener(this);
            label.add(yourButton);

            ImageIcon backIcon1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
            JButton back = new JButton(backIcon1); // back
            back.setBackground(new Color(0x2FA3FF));
            back.setBorder(BorderFactory.createEmptyBorder());
            back.setBounds(1260, 1300, 60, 60);
            back.setFont(new Font("open sauce", Font.BOLD, 20));
            back.setForeground(Color.BLACK);
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Set the JFrame to invisible when back button is clicked
                    puneFrame.setVisible(false);

                }
            });
            contentPanel.add(back);

            contentPanel.add(label);
            OGHeight = Math.max(OGHeight, yPosition + 110);
        }
        // Adjust the height of the contentPanel based on the maxHeight
        contentPanel.setPreferredSize(new Dimension(contentPanel.getPreferredSize().width,MaxHeight));

        startDateLabel = new JLabel(startDateStr);
        startDateLabel.setBounds(60, 18, 200, 40);
        startDateLabel.setFont(font);
        startDateLabel.setForeground(Color.BLACK);
        a4.add(startDateLabel);

        endDateLabel = new JLabel("TO:  " + endDateStr);
        endDateLabel.setBounds(200, 18, 230, 40);
        endDateLabel.setFont(font);
        endDateLabel.setForeground(new Color(0x000000));
        a4.add(endDateLabel);

        // Add specific content for Pune itinerary
        JLabel puneLabel = new JLabel("Pune Itinerary");
        puneLabel.setBounds(60, 80, 300, 40);
        puneLabel.setFont(font);
        puneLabel.setForeground(new Color(0x000000));
        a4.add(puneLabel);

        puneFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        puneFrame.setLocationRelativeTo(null);
        puneFrame.setVisible(true);
    }
    private void sambhajinager(String startDateStr, String endDateStr)
    {
        SambhajinagerFrame = new JFrame();
        SambhajinagerFrame.setTitle("Itinerary");
        SambhajinagerFrame.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1366, 768);
        SambhajinagerFrame.add(scrollPane);
        SambhajinagerFrame.setBackground(new Color(0x92A7BA));

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 1680));
        contentPanel.setBackground(new Color(146, 167, 186, 255));
        scrollPane.setViewportView(contentPanel);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\smbj_iternary.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        label = new JLabel(imageIcon);
        label.setSize(1366, 768);
        contentPanel.add(label);

        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0x267AEC);
                this.trackColor = new Color(0x1462CB);
            }
        });

        ImageIcon place1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB1.png");
        b1 = new JButton(place1);
        b1.setBounds(130,250,354,187);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        label.add(b1);

        ImageIcon place2 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB2.png");
        b2 = new JButton(place2);
        b2.setBounds(130 + 354 + 71, 250, 354, 187);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        label.add(b2);

// Third button with a space of 71
        ImageIcon place3 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB3.png");
        b3 = new JButton(place3);
        b3.setBounds(130 + (354 + 71) * 2, 250, 354, 187);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        label.add(b3);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("DButns/JPanal.png"));
        Image a2 = a1.getImage().getScaledInstance(460, 80, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(550, 160, 470, 80);
        label.add(a4);

        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/rec_smbj.png"));
        Image b2 = b1.getImage().getScaledInstance(1200, 259, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel b4 = new JLabel(b3);
        b4.setBounds(130,480, 1200, 259); // Adjust the y-coordinate as needed
        label.add(b4);

        ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("icons/itinerary_frame.png"));
        Image f2 = f1.getImage().getScaledInstance(1366,64, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel f4 = new JLabel(f3);
        f4.setBounds(0,780, 1366, 64); // Adjust the y-coordinate as needed
        contentPanel.add(f4);

        ImageIcon frame = new ImageIcon(ClassLoader.getSystemResource("icons/add_place.png"));
        Image frame1 = frame.getImage().getScaledInstance(729, 110, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(frame1);

        scrollPane1 = new JScrollPane();
        scrollPane1.setBounds(770, 870, 570, 470);
        scrollPane1.getViewport().setBackground(new Color(0x235568));
        scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        contentPanel.add(scrollPane1);

        JPanel subplaces = new JPanel();
        subplaces.setLayout(null);
        subplaces.setPreferredSize(new Dimension(555, 1700));
        subplaces.setBackground(new Color(0x1462CB));
        scrollPane1.setViewportView(subplaces);

        customButtons = new JButton[12];
        for (i = 1; i <= 12; i++) {
            String imagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Subplaces\\r" + i + ".png";
            ImageIcon qImageIcon = new ImageIcon(imagePath);
            Image img = qImageIcon.getImage().getScaledInstance(535, 112, Image.SCALE_SMOOTH);
            qImageIcon = new ImageIcon(img);

            JLabel qLabel = new JLabel(qImageIcon);
            qLabel.setBounds(5, yPosition, 535, 112);
            subplaces.add(qLabel);

            String buttonImagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\plus-32_add.png";
            ImageIcon buttonIcon = new ImageIcon(buttonImagePath);
            Image buttonImage = buttonIcon.getImage().getScaledInstance(34, 34, Image.SCALE_SMOOTH);
            buttonIcon = new ImageIcon(buttonImage);

            button1 = new JButton(buttonIcon);
            button1.setBounds(489, 9, 34, 34);
            button1.setBackground(new Color(0x235568));
            button1.setBorder(BorderFactory.createEmptyBorder());

            // Set the text of the button to the corresponding place from placesList
            button1.setText(sambhajinagarList[i - 1]);

            customButtons[i - 1] = button1;
            button1.addActionListener(this);
            qLabel.add(button1);

            JScrollBar verticalScrollBar = scrollPane1.getVerticalScrollBar();
            verticalScrollBar.setUI(new BasicScrollBarUI() {
                @Override
                protected void configureScrollBarColors() {
                    this.thumbColor = new Color(0x267AEC);
                    this.trackColor = new Color(0x1462CB);
                }
            });
            yPosition += 127;
        }

        customlabel = new JPanel[days];
        yourdel = new JButton[days];

        for (int i = 0; i < days; i++) {
            JLabel label = new JLabel(scaledImageIcon);
            int xPos = 20;
            int yPos = 870 + i * 120;
            label.setBounds(xPos, yPos, 729, 110);

            int sentence = i + 1;
            JLabel no_days = new JLabel(String.valueOf(sentence));
            no_days.setBackground(new Color(0xFF000000, true));
            no_days.setForeground(new Color(0x000000));
            no_days.setBounds(49, 58, 35, 25);
            no_days.setFont(new Font("Open Sauce", Font.BOLD, 25));
            label.add(no_days);

            blackPanels = new JPanel();
            blackPanels.setBackground(new Color(0xE3E0DE));
            blackPanels.setBounds(140, 50, 546, 48);
            blackPanels.setFont(new Font("Open Sauce", Font.BOLD, 25));
            customlabel[i] = blackPanels;
            label.add(blackPanels);

            ImageIcon del = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Delete.png");
            yourButton = new JButton(del);
            yourButton.setSize(35, 35);
            // Set the location of the button to the right side of blackPanels
            int buttonX = blackPanels.getX() + blackPanels.getWidth();
            int buttonY = blackPanels.getY() + (blackPanels.getHeight() - yourButton.getHeight()) / 2;
            yourButton.setLocation(buttonX - 20, buttonY - 50);
            yourButton.setBackground(new Color(0xFF2FA3FF, true));
            yourButton.setBorder(BorderFactory.createEmptyBorder());
            yourdel[i] = yourButton; // Fix the array index here
            yourButton.addActionListener(this);
            label.add(yourButton);

            ImageIcon backIcon1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
            JButton back = new JButton(backIcon1); // back
            back.setBackground(new Color(0x2FA3FF));
            back.setBorder(BorderFactory.createEmptyBorder());
            back.setBounds(1260, 1300, 60, 60);
            back.setFont(new Font("open sauce", Font.BOLD, 20));
            back.setForeground(Color.BLACK);
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Set the JFrame to invisible when back button is clicked
                    SambhajinagerFrame.setVisible(false);

                }
            });
            contentPanel.add(back);

            contentPanel.add(label);
            OGHeight = Math.max(OGHeight, yPosition + 110);
        }
        // Adjust the height of the contentPanel based on the maxHeight
        contentPanel.setPreferredSize(new Dimension(contentPanel.getPreferredSize().width,MaxHeight));

        startDateLabel = new JLabel(startDateStr);
        startDateLabel.setBounds(60, 18, 200, 40);
        startDateLabel.setFont(font);
        startDateLabel.setForeground(Color.BLACK);
        a4.add(startDateLabel);

        endDateLabel = new JLabel("TO:  " + endDateStr);
        endDateLabel.setBounds(200, 18, 230, 40);
        endDateLabel.setFont(font);
        endDateLabel.setForeground(new Color(0x000000));
        a4.add(endDateLabel);

        // Add specific content for Sambhajinager itinerary
        JLabel sambhajinagerLabel = new JLabel("Sambhajinager Itinerary");
        sambhajinagerLabel.setBounds(60, 80, 300, 40);
        sambhajinagerLabel.setFont(font);
        sambhajinagerLabel.setForeground(new Color(0x000000));
        a4.add(sambhajinagerLabel);

        SambhajinagerFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        SambhajinagerFrame.setLocationRelativeTo(null);
        SambhajinagerFrame.setVisible(true);
    }
    private void nashik(String startDateStr, String endDateStr)
    {
        nashikFrame = new JFrame();
        nashikFrame.setTitle("Itinerary");
        nashikFrame.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1366, 768);
        nashikFrame.add(scrollPane);
        nashikFrame.setBackground(new Color(0x92A7BA));

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 1680));
        contentPanel.setBackground(new Color(146, 167, 186, 255));
        scrollPane.setViewportView(contentPanel);

        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0x267AEC);
                this.trackColor = new Color(0x1462CB);
            }
        });

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\nashik_iternary.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        label = new JLabel(imageIcon);
        label.setSize(1366, 768);
        contentPanel.add(label);

        ImageIcon place1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB1.png");
        b1 = new JButton(place1);
        b1.setBounds(130,250,354,187);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        label.add(b1);

        ImageIcon place2 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB2.png");
        b2 = new JButton(place2);
        b2.setBounds(130 + 354 + 71, 250, 354, 187);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        label.add(b2);

// Third button with a space of 71
        ImageIcon place3 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\IB3.png");
        b3 = new JButton(place3);
        b3.setBounds(130 + (354 + 71) * 2, 250, 354, 187);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        label.add(b3);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("DButns/JPanal.png"));
        Image a2 = a1.getImage().getScaledInstance(460, 80, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(550, 160, 470, 80);
        label.add(a4);

        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/rec_nashik.png"));
        Image b2 = b1.getImage().getScaledInstance(1200, 259, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel b4 = new JLabel(b3);
        b4.setBounds(130,480, 1200, 259); // Adjust the y-coordinate as needed
        label.add(b4);

        ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("icons/itinerary_frame.png"));
        Image f2 = f1.getImage().getScaledInstance(1366,64, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel f4 = new JLabel(f3);
        f4.setBounds(0,780, 1366, 64); // Adjust the y-coordinate as needed
        contentPanel.add(f4);

        ImageIcon frame = new ImageIcon(ClassLoader.getSystemResource("icons/add_place.png"));
        Image frame1 = frame.getImage().getScaledInstance(729, 110, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(frame1);

        scrollPane1 = new JScrollPane();
        scrollPane1.setBounds(770, 870, 570, 470);
        scrollPane1.getViewport().setBackground(new Color(0x235568));
        scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        contentPanel.add(scrollPane1);

        JPanel subplaces = new JPanel();
        subplaces.setLayout(null);
        subplaces.setPreferredSize(new Dimension(555, 1700));
        subplaces.setBackground(new Color(0x1462CB));
        scrollPane1.setViewportView(subplaces);

        customButtons = new JButton[12];
        for (i = 1; i <= 12; i++) {
            String imagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Subplaces\\z" + i + ".png";
            ImageIcon qImageIcon = new ImageIcon(imagePath);
            Image img = qImageIcon.getImage().getScaledInstance(535, 112, Image.SCALE_SMOOTH);
            qImageIcon = new ImageIcon(img);

            JLabel qLabel = new JLabel(qImageIcon);
            qLabel.setBounds(5, yPosition, 535, 112);
            subplaces.add(qLabel);

            String buttonImagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\plus-32_add.png";
            ImageIcon buttonIcon = new ImageIcon(buttonImagePath);
            Image buttonImage = buttonIcon.getImage().getScaledInstance(34, 34, Image.SCALE_SMOOTH);
            buttonIcon = new ImageIcon(buttonImage);

            button1 = new JButton(buttonIcon);
            button1.setBounds(489, 9, 34, 34);
            button1.setBackground(new Color(0x235568));
            button1.setBorder(BorderFactory.createEmptyBorder());

            // Set the text of the button to the corresponding place from placesList
            button1.setText(nashikList[i - 1]);

            customButtons[i - 1] = button1;
            button1.addActionListener(this);
            qLabel.add(button1);

            JScrollBar verticalScrollBar = scrollPane1.getVerticalScrollBar();
            verticalScrollBar.setUI(new BasicScrollBarUI() {
                @Override
                protected void configureScrollBarColors() {
                    this.thumbColor = new Color(0x267AEC);
                    this.trackColor = new Color(0x1462CB);
                }
            });
            yPosition += 127;
        }

        customlabel = new JPanel[days];
        yourdel = new JButton[days];

        for (int i = 0; i < days; i++) {
            JLabel label = new JLabel(scaledImageIcon);
            int xPos = 20;
            int yPos = 870 + i * 120;
            label.setBounds(xPos, yPos, 729, 110);

            int sentence = i + 1;
            JLabel no_days = new JLabel(String.valueOf(sentence));
            no_days.setBackground(new Color(0xFF000000, true));
            no_days.setForeground(new Color(0x000000));
            no_days.setBounds(49, 58, 35, 25);
            no_days.setFont(new Font("Open Sauce", Font.BOLD, 25));
            label.add(no_days);

            blackPanels = new JPanel();
            blackPanels.setBackground(new Color(0xE3E0DE));
            blackPanels.setBounds(140, 50, 546, 48);
            blackPanels.setFont(new Font("Open Sauce", Font.BOLD, 25));
            customlabel[i] = blackPanels;
            label.add(blackPanels);

            ImageIcon del = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Delete.png");
            yourButton = new JButton(del);
            yourButton.setSize(35, 35);
            // Set the location of the button to the right side of blackPanels
            int buttonX = blackPanels.getX() + blackPanels.getWidth();
            int buttonY = blackPanels.getY() + (blackPanels.getHeight() - yourButton.getHeight()) / 2;
            yourButton.setLocation(buttonX - 20, buttonY - 50);
            yourButton.setBackground(new Color(0xFF2FA3FF, true));
            yourButton.setBorder(BorderFactory.createEmptyBorder());
            yourdel[i] = yourButton; // Fix the array index here
            yourButton.addActionListener(this);
            label.add(yourButton);

            contentPanel.add(label);
            OGHeight = Math.max(OGHeight, yPosition + 110);
        }
        // Adjust the height of the contentPanel based on the maxHeight
        contentPanel.setPreferredSize(new Dimension(contentPanel.getPreferredSize().width,MaxHeight));

        startDateLabel = new JLabel(startDateStr);
        startDateLabel.setBounds(60, 18, 200, 40);
        startDateLabel.setFont(font);
        startDateLabel.setForeground(Color.BLACK);
        a4.add(startDateLabel);

        endDateLabel = new JLabel("TO:  " + endDateStr);
        endDateLabel.setBounds(200, 18, 230, 40);
        endDateLabel.setFont(font);
        endDateLabel.setForeground(new Color(0x000000));
        a4.add(endDateLabel);

        // Add specific content for Nashik itinerary
        JLabel nashikLabel = new JLabel("Nashik Itinerary");
        nashikLabel.setBounds(60, 80, 300, 40);
        nashikLabel.setFont(font);
        nashikLabel.setForeground(new Color(0x000000));
        a4.add(nashikLabel);

        ImageIcon backIcon1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
        JButton back = new JButton(backIcon1); // back
        back.setBackground(new Color(0x2FA3FF));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1260, 1450, 60, 60);
        back.setFont(new Font("open sauce", Font.BOLD, 20));
        back.setForeground(Color.BLACK);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the JFrame to invisible when back button is clicked
                nashikFrame.setVisible(false);
            }
        });
        contentPanel.add(back);

        nashikFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        nashikFrame.setLocationRelativeTo(null);
        nashikFrame.setVisible(true);
    }

    private void addPlaceToDay(int day, String newPlace) {
        // Create a JLabel with the new place
        JLabel newLabel = new JLabel("Selected Place: " + newPlace);
        newLabel.setForeground(new Color(0x1333A2));
        newLabel.setBounds(140, 50, 546, 48);
        newLabel.setFont(new Font("Open Sauce", Font.BOLD, 25));
        // Add the new JLabel to the corresponding customlabel JPanel
        customlabel[day].add(newLabel);
        // Update placesList with the new place for the current day
        if (citystr == rtnstr) {
            placesList[day] = newPlace;
        } else if (citystr == smbjstr) {
            sambhajinagarList[day] = newPlace;
        } else if (citystr == mumstr) {
            mumList[day]= newPlace;
        } else if (citystr == pnstr) {
            puneList[day] = newPlace;
        } else if (citystr == nshkstr) {
            nashikList[day] = newPlace;
        }
        // Repaint the container (contentPanel) to reflect the changes
        contentPanel.repaint();
    }

    private int findDayForButton(int buttonIndex) {
        // Calculate the day index based on the button clicked
        return buttonIndex % days;
    }

    private void savePlacesToDatabase() {
        JOptionPane.showConfirmDialog(saveButton,
                "Coming soon !!",
                "Save Your Trip",
                JOptionPane.YES_NO_OPTION);
    }
//     return; // Exit the method after handling the "Delete" button click
    private void removePlaceFromDay(int day) {
        if (customlabel[day].getComponentCount() > 0) {
            // Day has a place, remove it
            customlabel[day].removeAll();
            contentPanel.repaint();
        } else {
            // Day is already empty, show a JOptionPane
            JOptionPane.showMessageDialog(itineraryFrame, "No place added for Day " + (day + 1));
        }
    }
    private void openInviteFrame()
    {
        JFrame inviteFrame = new JFrame("Invite Friend");
        inviteFrame.setSize(400, 200);
        inviteFrame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 10, 100, 20);
        nameLabel.setFont(fontTxt);
        inviteFrame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 10, 200, 30);
        nameField.setFont(fontTxt);
        inviteFrame.add(nameField);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(50, 60, 100, 20);
        mobileLabel.setFont(fontTxt);
        inviteFrame.add(mobileLabel);

        JTextField mobileField = new JTextField();
        mobileField.setBounds(150, 60, 200, 30);
        mobileLabel.setFont(fontTxt);
        inviteFrame.add(mobileField);

        JButton saveButton = new JButton("Invite");
        saveButton.setFont(fontTxt);
        saveButton.setBounds(150, 110, 100, 30);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String mobile = mobileField.getText();
                inviteFrame.dispose();
                System.out.println(name);
                System.out.println(mobile);
            }
        });
        inviteFrame.add(saveButton);
        inviteFrame.setLocationRelativeTo(null);
        inviteFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new trip();
    }
}
