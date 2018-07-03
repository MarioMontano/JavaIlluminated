/**
 * A client class to test WebStore.
 *
 * Mario Montano
 * 
 */
public class WebStoreClient
{
    public static void main( String [ ] args )
    {
        System.out.println( "Instantiate scienceasattire" );
        WebStore scienceasattire = new WebStore( );
        
        System.out.println( "\nInstantiate seele" );
        WebStore seele = new WebStore( "www.seele.com", "Scala" );
    }
}
