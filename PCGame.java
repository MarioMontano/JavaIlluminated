/**
 * A class encapsulating a PC-based game, which inherits from Game. A 
 * PC-based game has the following additional attributes: the minimum 
 * megabytes of RAM needed to play the game, the number of megabytes needed 
 * on the hard drive to install the game, and the minimum GHz performance of 
 * the CPU. Has code for the constructor and the toString method of the new 
 * class. 
 * 
 * Mario Montano
 * 
 */
public class PCGame extends Game
{
    public double megabytesRAM;
    public double megabytesHardDrive;
    public double ghzCPU;
    
    public PCGame( String description )
    {
        super( description );
    }
    public String toString( )
    {
        return "Minimum Megabytes RAM: " + megabytesRAM
                + "; Minimum Megabytes Hard Drive: " + megabytesHardDrive
                + "; Minimum GHZ CPU: " + ghzCPU;
    }    
}
