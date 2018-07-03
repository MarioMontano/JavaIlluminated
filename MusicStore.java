/**
 * A class encapsulating a music store, which inherits from Store. 
 * This music store has the following additional attributes: the number 
 * of titles it offers and its address. It contains the constructor 
 * and the toString method of the new class. 


 * Mario Montano
 * 
 */
public class MusicStore extends Store
{
  public int numberTitles;
  public String address;
  
  public MusicStore( )
  {
      numberTitles = 100;
      address = "Country Club Plaza, Country Club Hills, IL";
  }
   public MusicStore( int startNumberTitles,
                      String startAddress )
  {
      numberTitles = startNumberTitles;
      address = startAddress;     
  }
  public String toString( )
  {
      return "Number of titles offered: " + numberTitles
             +"; address: " + address;
  }
}
