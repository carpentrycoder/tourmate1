import javax.swing.*;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MapInitializer {
    public static void initializeMap(double latitude, double longitude) {
        JFrame mapFrame = new JFrame();
        mapFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mapFrame.getContentPane().setBackground(new Color(0x001729));
        mapFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Initialize tile factory and map viewer
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        org.jxmapviewer.JXMapViewer jXMapViewer = new org.jxmapviewer.JXMapViewer();
        jXMapViewer.setTileFactory(tileFactory);
        jXMapViewer.setZoom(5);

        ImageIcon backb = new ImageIcon("\\tourmate1\\src\\DButns\\Back.png");
        JButton back = new JButton(backb); // back
        back.setBackground(new Color(0x0474856, true));
        back.setLayout(null);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1270, 630, 60, 60);
        back.addActionListener(e -> mapFrame.setVisible(false)); // Hides the map frame
        mapFrame.add(back);

        // Set initial position
        GeoPosition geo = new GeoPosition(latitude, longitude);
        jXMapViewer.setAddressLocation(geo);

        // Add map viewer to frame
        mapFrame.add(jXMapViewer);
        mapFrame.pack();
        mapFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mapFrame.getContentPane().setBackground(new Color(0x001729));
        mapFrame.setSize(1366, 766);
        mapFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mapFrame.setLocationRelativeTo(null);
        mapFrame.setVisible(true);

        // Add event listeners for map interaction
        MouseInputListener mm = new PanMouseInputListener(jXMapViewer);
        jXMapViewer.addMouseListener(mm);
        jXMapViewer.addMouseMotionListener(mm);
        jXMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer));
    }

    public static void main(String[] args) {
        // Example usage
        initializeMap(18.9156983, 73.3407465);
    }
}