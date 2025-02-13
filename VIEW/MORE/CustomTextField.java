package VIEW.MORE;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CustomTextField extends JTextField {
    public CustomTextField(){
        // Erstelle ein JTextField mit Anpassungen
        setBackground(Color.BLACK); // Hintergrundfarbe
        setForeground(Color.GRAY);  // Textfarbe
        setCaretColor(Color.WHITE); // Cursorfarbe

        // Versuche, eine benutzerdefinierte Schriftart zu laden
        try {
            // Ändere den Pfad zu deiner Schriftart-Datei
            String fontPath = "Font/Minecraft-Regular.otf";
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(18f); // Schriftgröße 18
            setFont(customFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            // Fallback auf Standard-Schriftart
            setFont(new Font("Arial", Font.PLAIN, 18));
        }

        // Lege Padding (Abstände) fest
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
    }


    //TEST methode
    public static void main(String[] args) {
        // Erstelle ein JFrame, um das Textfeld anzuzeigen
        JFrame frame = new JFrame("Custom TextField Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // CustomTextField hinzufügen
        CustomTextField textField = new CustomTextField();
        frame.add(textField, BorderLayout.CENTER);

        // Frame sichtbar machen
        frame.setVisible(true);
    }
}
