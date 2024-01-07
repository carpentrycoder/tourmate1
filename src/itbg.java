import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class itbg extends JFrame implements ActionListener {
    int i = 0, width1 = 768, maxHeight = 1680, yPosition = 10, days = 4;
    JPanel contentPanel, blackPanels;
    JButton saveButton;  // Add a new button for saving places to the database
    JPanel[] customlabel;
    JLabel label, startDateLabel, endDateLabel;
    JScrollPane scrollPane1;
    JButton b1, b2, b3, button1, yourButton;
    JButton[] customButtons, yourdel;
    Font font = new Font("Arial.", Font.BOLD, 29);
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

    public itbg(String startDateStr, String endDateStr) {
        itineraryFrame = new JFrame();
        itineraryFrame.setTitle("Iternary");
        itineraryFrame.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1366, width1);
        itineraryFrame.add(scrollPane);
        itineraryFrame.setBackground(new Color(0x92A7BA));

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, maxHeight));
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

        ImageIcon imageIcon = new ImageIcon("\\tourmate1\\src\\icons\\Copy of iternary.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        label = new JLabel(imageIcon);
        label.setSize(1366, 768);
        contentPanel.add(label);

        ImageIcon place1 = new ImageIcon("\\tourmate1\\src\\DButns\\IB1.png");
        b1 = new JButton(place1);
        b1.setBounds(130, 250, 354, 187);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        label.add(b1);

        ImageIcon place2 = new ImageIcon("\\tourmate1\\src\\DButns\\IB2.png");
        b2 = new JButton(place2);
        b2.setBounds(130 + 354 + 71, 250, 354, 187);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        label.add(b2);

        ImageIcon place3 = new ImageIcon("\\tourmate1\\src\\DButns\\IB3.png");
        b3 = new JButton(place3);
        b3.setBounds(130 + (354 + 71) * 2, 250, 354, 187);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        label.add(b3);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("DButns/JPanal.png"));
        Image a2 = a1.getImage().getScaledInstance(470, 80, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(550, 160, 470, 80);
        label.add(a4);

        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/Recommended_places_ratnagiri.png"));
        Image b2 = b1.getImage().getScaledInstance(1200, 259, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel b4 = new JLabel(b3);
        b4.setBounds(130, 480, 1200, 259);
        label.add(b4);

        ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("icons/itinerary_frame.png"));
        Image f2 = f1.getImage().getScaledInstance(1366, 64, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel f4 = new JLabel(f3);
        f4.setBounds(0, 780, 1366, 64);
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
            String imagePath = "\\tourmate1\\src\\Subplaces\\w" + i + ".png";
            ImageIcon qImageIcon = new ImageIcon(imagePath);
            Image img = qImageIcon.getImage().getScaledInstance(535, 112, Image.SCALE_SMOOTH);
            qImageIcon = new ImageIcon(img);

            JLabel qLabel = new JLabel(qImageIcon);
            qLabel.setBounds(5, yPosition, 535, 112);
            subplaces.add(qLabel);

            String buttonImagePath = "\\tourmate1\\src\\DButns\\plus-32_add.png";
            ImageIcon buttonIcon = new ImageIcon(buttonImagePath);
            Image buttonImage = buttonIcon.getImage().getScaledInstance(34, 34, Image.SCALE_SMOOTH);
            buttonIcon = new ImageIcon(buttonImage);

            button1 = new JButton(buttonIcon);
            button1.setBounds(489, 9, 34, 34);
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

            ImageIcon del = new ImageIcon("tourmate1\\src\\DButns\\Delete.png");
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
            maxHeight = Math.max(maxHeight, yPosition + 110);
        }
        contentPanel.setPreferredSize(new Dimension(contentPanel.getPreferredSize().width, maxHeight + 100));

        // Create a new JButton for saving places to the database
        saveButton = new JButton("Click Me !!! to save your Trip :)");
        saveButton.setBounds(770, 1340, 570, 30);
        saveButton.addActionListener(this);
        saveButton.setBackground(new Color(0xAF032C));
        saveButton.setBackground(new Color(0xF9F8FC));
        contentPanel.add(saveButton);

        startDateLabel = new JLabel("1.2.2024");
        startDateLabel.setBounds(60, 18, 200, 40);
        startDateLabel.setFont(font);
        startDateLabel.setForeground(Color.BLACK);
        a4.add(startDateLabel);

        endDateLabel = new JLabel("TO:   3.2.2024");
        endDateLabel.setBounds(200, 18, 200, 40);
        endDateLabel.setFont(font);
        endDateLabel.setForeground(new Color(0x000000));
        a4.add(endDateLabel);

        itineraryFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        itineraryFrame.setLocationRelativeTo(null);
        itineraryFrame.setVisible(true);
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
        placesList[day] = newPlace;

        // Repaint the container (contentPanel) to reflect the changes
        contentPanel.repaint();
    }
    private int findDayForButton(int buttonIndex) {
        // Calculate the day index based on the button clicked
        return buttonIndex % days;
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < customButtons.length; i++) {
            if (e.getSource() == customButtons[i]) {
                int day = findDayForButton(i);

                // Ensure a day is available
                if (day >= 0 && day < days) {
                    if (customlabel[day].getComponentCount() > 0) {
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
        // Check if b1 (places) button is clicked
        if (e.getSource() == b1) {
            // Handle action for places button (e.g., show a dialog to add a new place)
            JOptionPane.showMessageDialog(itineraryFrame, "Button b1 (Places) clicked!");
        }
        // Check if b2 (hotels) button is clicked
        else if (e.getSource() == b2) {
            // Handle action for hotels button (e.g., show a dialog to add a new hotel)
            JOptionPane.showMessageDialog(itineraryFrame, "Button b2 (Hotels) clicked!");
        }
        // Check if b3 (restaurants) button is clicked
        else if (e.getSource() == b3) {
            // Handle action for restaurants button (e.g., show a dialog to add a new restaurant)
            JOptionPane.showMessageDialog(itineraryFrame, "Button b3 (Restaurants) clicked!");
        }
        for (int i = 0; i < yourdel.length; i++) {
            if (e.getSource() == yourdel[i]) {
                int day = i; // Use the array index directly as it represents the day
                removePlaceFromDay(day);
                return; // Exit the method after handling the "Delete" button click
            }
        }
        if (e.getSource() == saveButton) {
            // Handle action for the saveButton (e.g., save places to the database)
            savePlacesToDatabase();
        }

    }
    private void savePlacesToDatabase() {
        JOptionPane.showConfirmDialog(saveButton,
                "Coming soon !!",
                "Save Your Trip",
                JOptionPane.YES_NO_OPTION);
    }
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

    public static void main (String[]args)
        {
            new itbg("startDate", "endDate");
        }
}


