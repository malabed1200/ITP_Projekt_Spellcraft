package VIEW;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.io.File;

public class Button {

    private Font loadMinecraftFont() {
        try {
            // Der Pfad zur Schriftart-Datei auf deinem Computer
            File fontFile = new File("Font/Minecraft-Regular.otf");

            // Font wird aus der lokalen Datei geladen
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            return font.deriveFont(Font.PLAIN, 20); // Schriftgröße auf 20 setzen
        } catch (Exception e) {
            // Fallback-Schriftart verwenden, falls das Laden fehlschlägt
            return new Font("Arial", Font.PLAIN, 20);
        }
    }

    public Button() {
        // Minecraft-Schriftart laden oder Fallback verwenden
        Font minecraftFont = loadMinecraftFont();

        // Erstelle den Button und setze die Schriftart
        JButton button = new JButton("Singleplayer");
        button.setFont(minecraftFont);
        button.setBackground(Color.GRAY); // Setze die Hintergrundfarbe auf Grau
        button.setForeground(Color.WHITE); // Setze die Schriftfarbe auf Weiß
        button.setOpaque(true); // Wichtig, um die Hintergrundfarbe sichtbar zu machen
        button.setFocusPainted(false); // Entfernt den blauen Fokusrahmen
        button.setBorder(new LineBorder(Color.BLACK, 2)); // Setzt einen schwarzen Rand mit 2 Pixeln Dicke

        // Setze die bevorzugte Größe des Buttons
        button.setPreferredSize(new Dimension(300, 40)); // Behalte die Breite bei, aber verringere die Höhe

        // Erstelle ein JFrame, um den Button anzuzeigen
        JFrame frame = new JFrame("Custom Font Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200); // Vergrößert den Frame, um Platz für den Button zu schaffen
        frame.setLayout(new FlowLayout());

        // Füge den Button zum JFrame hinzu
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Button();
    }
}
