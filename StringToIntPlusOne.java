import javax.swing.JOptionPane;

public class StringToIntPlusOne
{
    public static void main(String[] args)
    {
     String input = JOptionPane.showInputDialog(null,
        "Please enter an integer");
     int integer = Integer.parseInt(input);
     JOptionPane.showMessageDialog(null, "The new value is " +
     ++integer);
    }
}
