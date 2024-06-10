import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CobaFrame extends JFrame {

    JButton btn1 = new JButton("Tambah"); // ini OOT dikit ngebahas tentang objek dan parameternya
    JLabel label = new JLabel("Nama");

    public static void main(String[] args) {
        CobaFrame cf = new CobaFrame();
        cf.setSize(600, 400);
        cf.setTitle("Coba Frame");
        cf.setLocationRelativeTo(null);
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cf.setVisible(true);
    }
}
