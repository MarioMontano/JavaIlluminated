import java.io.*;

public class CountWord
{
    public static void main(String args[]) throws Exception
    {

        String testString = "Secret";
        String filePath = "Secret.txt";
        String strLine;
        int numRead = 0;

        try 
        {
            FileInputStream fstream = new FileInputStream(filePath);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            while ( ( strLine = br.readLine( ) ) != null )   
            {
                strLine = strLine + " ";
                String [] strArry = strLine.split(testString);

                if (strArry.length > 1) 
                {
                     numRead = numRead + strArry.length - 1;
                }
                else 
                {
                     if (strLine == testString) 
                     {
                         numRead++;
                     }
                }
            }

            in.close( );

            System.out.println(testString + " was found " + numRead + " times.");

        }
        catch (Exception e)
        {
            
        }
    }
}
