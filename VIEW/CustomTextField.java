package VIEW;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CustomTextField {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Custom TextField Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            // Erstelle ein JTextField mit Anpassungen
            JTextField textField = new JTextField();
            textField.setBackground(Color.BLACK); // Hintergrundfarbe
            textField.setForeground(Color.GRAY);  // Textfarbe
            textField.setCaretColor(Color.WHITE); // Cursorfarbe

            // Versuche, eine benutzerdefinierte Schriftart zu laden
            try {
                // Ändere den Pfad zu deiner Schriftart-Datei
                String fontPath = "Font/Minecraft-Regular.otf";
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(18f); // Schriftgröße 18
                textField.setFont(customFont);
            } catch (FontFormatException | IOException e) {
                e.printStackTrace();
                // Fallback auf Standard-Schriftart
                textField.setFont(new Font("Arial", Font.PLAIN, 18));
            }

            // Lege Padding (Abstände) fest
            textField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            // Füge das Textfeld zum JFrame hinzu
            frame.setLayout(new BorderLayout());
            frame.add(textField, BorderLayout.CENTER);

            // Zeige das JFrame
            frame.setVisible(true);
        });
    }
}