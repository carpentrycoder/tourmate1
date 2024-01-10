import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlaceObj extends JFrame {

    public PlaceObj() {
        initializeUI();
    }

    private void initializeUI() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setTitle("Ratnagiri");
        setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1366, 768);
        getContentPane().add(scrollPane);

        ContentPanel contentPanel = new ContentPanel();
        scrollPane.setViewportView(contentPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PlaceObj());
    }
}

class ContentPanel extends JPanel {
    public ContentPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(1366, 1680));
        setBackground(new Color(71, 72, 86, 255));

        // Add your components here
    }
}

class ActionListenerImpl implements ActionListener {
    private final PlaceObj placeObj;

    public ActionListenerImpl(PlaceObj placeObj) {
        this.placeObj = placeObj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle actions based on the source
        // Example: placeObj.setVisible(false);
    }
}
