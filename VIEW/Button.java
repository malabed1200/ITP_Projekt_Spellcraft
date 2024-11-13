package VIEW;


import java.awt.*;
import javax.swing.*;
import java.io.File;

public class Button {

    public Button() throws Exception {
        // Der Pfad zur Schriftart-Datei auf deinem Computer
        File fontFile = new File("src/Minecraft/Minecraft-Regular.otf");

        // Font wird aus der lokalen Datei geladen
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        font = font.deriveFont(Font.PLAIN, 16);

        // Registriere die Schriftart im Grafik-Umfeld
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);

        // Erstelle den Button und setze die Schriftart
        JButton button = new JButton("Minecraft Button");
        button.setFont(font);

        // Erstelle ein JFrame, um den Button anzuzeigen
        JFrame frame = new JFrame("Custom Font Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Füge den Button zum JFrame hinzu
        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            new Button();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
