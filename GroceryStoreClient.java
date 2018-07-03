/**
 * A client class to test GroceryStore.
 *
 * Mario Montano
 * 
 */
public class GroceryStoreClient
{
    public static void main( String [ ] args )
    {
        System.out.println( "Instantiate meijer" );
        GroceryStore meijer = new GroceryStore( );
        
        System.out.println( "\nInstantiate mariano's" );
        GroceryStore marianos = new GroceryStore( 5300840.94, "Part of a chain" );
    }    
}
