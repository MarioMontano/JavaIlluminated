/**
 * Program that retrieves the file 
 * extension and output it. For instance, if the user inputs index.html, 
 * it should output html; if the user inputs MyClass.java, it should 
 * output java.
 
 *
 * Mario Montano
 * 
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class RetrieveFileExtension
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(null,
        "Please enter a file name");
        int point = input.indexOf('.');
        String fileextension = input.substring(point+1);
        JOptionPane.showMessageDialog(null, "The file extension is " +
        fileextension);
    }
}
