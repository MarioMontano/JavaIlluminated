/**
 * A class encapsulating a web store, which inherits from Store. 
 * The web store has the following additional attributes: an 
 * Internet address and the programming language in which the website 
 * was written. It contains the constructor and the toString method of 
 * the new class.

 * Mario Montano
 * 
 */
public class WebStore extends Store
{
  public String internetAddress;
  public String programmingLanguage;
  
  public WebStore( )
  {
      internetAddress = "www.vitrifyher.com";
      programmingLanguage = "PHP";
  }
  public WebStore( String startInternetAddress,
                   String startProgrammingLanguage )
  {
      internetAddress = startInternetAddress;
      programmingLanguage = startProgrammingLanguage;     
  }
  public String toString( )
  {
      return "Internet address: " + internetAddress
             +"; programming language: " + programmingLanguage;
  }
}
