/**
 * Client class to test all the methods in Grade class.
 *
 * Mario Montano
 * 
 */
public class GradeClient
{
  public static void main(String [ ] args)
  {
      System.out.println("Instantiate Timmy");
      Grade timmy = new Grade( );
      
      System.out.println("\nInstantiate Susy");
      Grade susy = new Grade("Calculus", "A");
      
      System.out.println("\nInstantiate Bob");
      Grade bob = new Grade("Anthropology", "B");
  }
  {
      Grade mark = new Grade( );
      String markCourseName = mark.getCourseName( );
      String markLetterGrade = mark.getLetterGrade( );
      System.out.println("Mark: course name is " + markCourseName
                 + "\n letter grade is " + markLetterGrade);
                 
      Grade sam = new Grade("Astronomy", "B");
      String samCourseName = sam.getCourseName( );
      String samLetterGrade = sam.getLetterGrade( );
      System.out.println("Sam: course name is " + samCourseName
                 + "\n letter grade is " + samLetterGrade);
  }
  {
      Grade fernando = new Grade("Biology", "A");
      
      System.out.println("Fernando: course name is " + fernando.getCourseName( )
             + "\n letter grade is " + fernando.getLetterGrade( ));
             
      fernando.setCourseName("Materials Engineering");
      fernando.setLetterGrade("C");
      
      System.out.println("\nFernando: course name is " + fernando.getCourseName( )
             + "\n letter grade is " + fernando.getLetterGrade( ));
  }
  {
      Grade simon = new Grade("Physics", "A");
      System.out.println(simon.toString());
      
      Grade kassandra = new Grade("Ecology", "B");
      System.out.println( );
      System.out.println(kassandra);
      
      if (kassandra.equals(simon))
        System.out.println("\nkassandra and simon are equal");
      else
        System.out.println("\nkassandra and simon are not equal");   
  }
}
