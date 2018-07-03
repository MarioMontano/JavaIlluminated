/**
 * A client class to test MusicStore.
 *
 * Mario Montano
 * 
 */
public class MusicStoreClient
{
    public static void main( String [ ] args )
    {
        System.out.println( "Instantiate guitarcenter" );
        MusicStore guitarcenter = new MusicStore( );
        
        System.out.println( "\nInstantiate soundmusicinc" );
        MusicStore soundmusicinc = new MusicStore( 800, "Evergreen Park, IL" );
    }
}
