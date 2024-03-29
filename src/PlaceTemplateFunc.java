import javax.swing.*;
import java.awt.*;

public class PlaceTemplateFunc {
    public static JFrame frame;
    public static JScrollPane scrollPane;
    public static JButton back, map, wt, itr,rent,trip,hotl;

    public static JButton createButton(String imagePath, int x, int y, int width, int height) {
        ImageIcon icon = new ImageIcon(imagePath);
        JButton button = new JButton(icon);
        button.setBounds(x, y, width, height);
        button.setBackground(new Color(0x474856));
        button.setBorder(BorderFactory.createEmptyBorder());
        return button;
    }

    public static void PlaceTemplateFunc(String cityName,String imagePath1,String imagePath2,String famous,String about,String Food,String review1,String review2,String review3)
    { // Corrected constructor
        frame = new JFrame();
//        frame.setSize(1366,768);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Initialize scrollPane
        scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        // Create contentPanel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 1680));
        contentPanel.setBackground(new Color(71, 72, 86, 255));

        JPanel k1 = new JPanel();
        k1.setLayout(null);
        k1.setBackground(new Color(0x6B7A99));
        k1.setBounds(0, 0, 1600, 57);
        contentPanel.add(k1);

        JLabel cityLabel = new JLabel(cityName);
        cityLabel.setBounds(25, 70, 200, 45);
        cityLabel.setFont(new Font("Poppins", Font.BOLD, 40));
        cityLabel.setForeground(new Color(0xF9F8FC));
        contentPanel.add(cityLabel);

        JLabel n = new JLabel("City in Maharashtra");
        n.setBounds(28, 110, 200, 20);
        n.setFont(new Font("Poppins", Font.BOLD, 12));
        n.setForeground(new Color(0xF9F8FC));
        contentPanel.add(n);


        String backbstr = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png";
        ImageIcon backb = new ImageIcon(backbstr);
        JButton back = new JButton(backb); // back button
        back.setBackground(new Color(0x474856));
        back.setLayout(null);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1270, 1470, 60, 60);
        back.addActionListener(e -> {
            // Add ActionListener internally
            frame.setVisible(false); // Hide the frame
        });
        contentPanel.add(back);

        String a1str = imagePath1;
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource(a1str));
        Image a2 = a1.getImage().getScaledInstance(614, 355, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(28, 150, 614, 355);
        contentPanel.add(a4);

        String h1str = imagePath2;
        ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource(h1str));
        Image h2 = h1.getImage().getScaledInstance(477, 318, Image.SCALE_DEFAULT);
        ImageIcon h3 = new ImageIcon(h2);
        JLabel h4 = new JLabel(h3);
        h4.setBounds(778, 528, 487, 318);
        contentPanel.add(h4);

        String z1str = about;
        ImageIcon z1 = new ImageIcon(ClassLoader.getSystemResource(z1str));
        Image z2 = z1.getImage().getScaledInstance(400, 452, Image.SCALE_DEFAULT);
        ImageIcon z3 = new ImageIcon(z2);
        JLabel z4 = new JLabel(z3);
        z4.setBounds(356, 525, 400, 452);
        contentPanel.add(z4);

        String v1str = famous;
        ImageIcon v1 = new ImageIcon(ClassLoader.getSystemResource(v1str));
        Image v2 = v1.getImage().getScaledInstance(326, 309, Image.SCALE_DEFAULT);
        ImageIcon v3 = new ImageIcon(v2);
        JLabel v4 = new JLabel(v3);
        v4.setBounds(18, 665, 326, 309);
        contentPanel.add(v4);

        String j1str = Food;
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource(j1str));
        Image j2 = j1.getImage().getScaledInstance(284, 333, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel j4 = new JLabel(j3);
        j4.setBounds(18, 990, 284, 333);
        contentPanel.add(j4);

        String s1Str = "icons/client reviwes.png";
        ImageIcon s1 = new ImageIcon(ClassLoader.getSystemResource(s1Str));
        Image s2 = s1.getImage().getScaledInstance(489, 553, Image.SCALE_DEFAULT);
        ImageIcon s3 = new ImageIcon(s2);
        JLabel s4 = new JLabel(s3);
        s4.setBounds(778, 868, 489, 553);
        contentPanel.add(s4);

        String g1str = review1;
        ImageIcon g1 = new ImageIcon(ClassLoader.getSystemResource(g1str));
        Image g2 = g1.getImage().getScaledInstance(431, 132, Image.SCALE_DEFAULT);
        ImageIcon g3 = new ImageIcon(g2);
        JLabel g4 = new JLabel(g3);
        g4.setBounds(30, 100, 431, 132);
        s4.add(g4);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource(review2));
        Image c2 = c1.getImage().getScaledInstance(431, 132, Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel c4 = new JLabel(c3);
        c4.setBounds(30, 238, 431, 132);
        s4.add(c4);

        ImageIcon w1 = new ImageIcon(ClassLoader.getSystemResource(review3));
        Image w2 = w1.getImage().getScaledInstance(431, 132, Image.SCALE_DEFAULT);
        ImageIcon w3 = new ImageIcon(w2);
        JLabel w4 = new JLabel(w3);
        w4.setBounds(30, 378, 431, 132);
        s4.add(w4);

        ImageIcon Q1 = new ImageIcon(ClassLoader.getSystemResource("DButns/ask.png"));
        Image Q2 = Q1.getImage().getScaledInstance(307, 124, Image.SCALE_DEFAULT);
        ImageIcon Q3 = new ImageIcon(Q2);
        JLabel Q4 = new JLabel(Q3);
        Q4.setBounds(28, 520, 307, 124);
        contentPanel.add(Q4);

        trip = new JButton("ASK ME");
        trip.setBounds(190, 70, 102, 37);
        trip.setBackground(new Color(71, 72, 86, 255));
        trip.setForeground(new Color(0xFFFFFF));
        trip.setBorder(BorderFactory.createEmptyBorder());
        Q4.add(trip);

        ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("DButns/Quote.png"));
        Image f2 = f1.getImage().getScaledInstance(480, 180, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel f4 = new JLabel(f3);
        f4.setBounds(50, 1360, 480, 180);
        contentPanel.add(f4);

        hotl = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\hotelbutn (1).png",161, 109, 296, 54);
        f4.add(hotl);

        rent = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\rental.png", 350, 1000, 377, 347);
        rent.setForeground(new Color(0xFFFFFF));
        contentPanel.add(rent);

         map = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\mapicon-universal.png", 658, 150, 282, 355);
        contentPanel.add(map);

        wt = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\weather.png", 958, 150, 300, 171);
        contentPanel.add(wt);

         itr = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\direction.png", 958, 330, 300, 171);
        contentPanel.add(itr);

        scrollPane.setViewportView(contentPanel);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static JButton getaskme(){
        return trip;
    }

    public static JButton gethotl(){
        return hotl;
    }

    public static JButton getMapButton() {
        return map;
    }

    // Method to get the weather button
    public static JButton getWeatherButton() {
        return wt;
    }

    // Method to get the direction button
    public static JButton getDirectionButton() {
        return itr;
    }

    // Method to get the rent button
    public static JButton getRentButton() {
        return rent;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
//             PlaceTemplateFunc("Mumbai","Dash_Icons/rtn.png","icons/thiba.png","");

        });
    }
}


/**
 * To add a specific action listener for the rent button created in the `PlaceTemplateFunc` method from another class,
 * you can follow a similar approach. Here's how you can do it:
 * <ol>
 *   <li>Modify the `PlaceTemplateFunc` method to return the rent button:</li>
 *   <pre>{@code
 *   public static JButton createRentButton(String imagePath, int x, int y, int width, int height) {
 *       ImageIcon icon = new ImageIcon(imagePath);
 *       JButton button = new JButton(icon);
 *       button.setBounds(x, y, width, height);
 *       button.setBackground(new Color(71, 72, 86, 255));
 *       button.setBorder(BorderFactory.createEmptyBorder());
 *       return button;
 *   }
 *   }</pre>
 *   <li>Add the rent button creation and add it to the content panel in the `PlaceTemplateFunc` method:</li>
 *   <pre>{@code
 *   JButton rent = createRentButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\rental.png", 350, 1000, 377, 347);
 *   rent.setForeground(new Color(0xFFFFFF));
 *   contentPanel.add(rent);
 *   }</pre>
 *   <li>Create a method to get the rent button:</li>
 *   <pre>{@code
 *   public static JButton getRentButton() {
 *       return rent;
 *   }
 *   }</pre>
 *   <li>In the other class, after calling `PlaceTemplateFunc.PlaceTemplateFunc(...)`, obtain the rent button and add a specific action listener:</li>
 *   <pre>{@code
 *   JButton rentButton = PlaceTemplateFunc.getRentButton();
 *   rentButton.addActionListener(new ActionListener() {
 *       public void actionPerformed(ActionEvent e) {
 *           // Add your action here for the rent button
 *       }
 *   });
 *   }</pre>
 * </ol>
 * With this approach, you can add a specific action listener for the rent button created in the `PlaceTemplateFunc` method from another class.
 */
