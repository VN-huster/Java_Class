import javax.swing.JOptionPane;
public class ChoosingOption{
    public static void main(String[] args) {
        int option  = JOptionPane.showConfirmDialog(null, "Do u want to change to the first ticket?");
        JOptionPane.showMessageDialog(null, "You have choosen: " + (option == JOptionPane.YES_OPTION? "Yes":"No"));
        System.exit(0);
        
    }
}