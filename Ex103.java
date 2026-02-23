import javax.swing.JOptionPane;

public class Ex103 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(
                null,
                "Hello, I am YOUR NAME"
        );

        JOptionPane.showMessageDialog(
                null,
                "Hello, I am YOUR NAME",
                "Message",
                JOptionPane.WARNING_MESSAGE
        );

        JOptionPane.showMessageDialog(
                null,
                "Hello, I am YOUR NAME",
                "Message",
                JOptionPane.ERROR_MESSAGE
        );

        JOptionPane.showMessageDialog(
                null,
                "Hello, I am YOUR NAME",
                "Message",
                JOptionPane.QUESTION_MESSAGE
        );

        JOptionPane.showMessageDialog(
                null,
                "Hello, I am YOUR NAME",
                "Message",
                JOptionPane.PLAIN_MESSAGE
        );
    }
}