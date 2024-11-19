package VIEW;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        // Erstelle das Hauptfenster
        setTitle("Minecraft Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(null);

        // Hintergrundpanel hinzufügen
        BackgroundPanel backgroundPanel = new BackgroundPanel("C:\\Users\\amira\\Downloads\\Bilder111.gif");
        backgroundPanel.setLayout(null); // Absolute Positionierung
        setContentPane(backgroundPanel);

        // Buttons hinzufügen
        Button buttonFactory = new Button();
        JButton button1 = buttonFactory.createButton("Singleplayer");
        JButton button2 = buttonFactory.createButton("Multiplayer");
        JButton button3 = buttonFactory.createButton("Options");

        // Buttons zum Hintergrund hinzufügen
        backgroundPanel.add(button1);
        backgroundPanel.add(button2);
        backgroundPanel.add(button3);

        // Zentrierung der Buttons sicherstellen
        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                int windowWidth = getWidth();
                int windowHeight = getHeight();

                int buttonWidth = 300;
                int buttonHeight = 40;

                // Buttons dynamisch zentrieren
                button1.setBounds((windowWidth - buttonWidth) / 2, (windowHeight - buttonHeight) / 2 - 60, buttonWidth, buttonHeight);
                button2.setBounds((windowWidth - buttonWidth) / 2, (windowHeight - buttonHeight) / 2, buttonWidth, buttonHeight);
                button3.setBounds((windowWidth - buttonWidth) / 2, (windowHeight - buttonHeight) / 2 + 60, buttonWidth, buttonHeight);
            }
        });

        // Frame anzeigen
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}

// Benutzerdefiniertes JPanel für den flexiblen Hintergrund
class BackgroundPanel extends JPanel {
    private final Image backgroundImage;

    public BackgroundPanel(String imagePath) {
        backgroundImage = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Hintergrundbild auf die gesamte Fenstergröße skalieren
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
