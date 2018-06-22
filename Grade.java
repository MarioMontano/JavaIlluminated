/**
 * Encapsulates the concept of a course grade.
 *
 * Mario Montano
 * 
 */

public class Grade
{
  private String courseName; 
  private String letterGrade;
  
  public Grade( )
  {
      courseName = "Calculus";
      letterGrade = "A";
  }
  
  public Grade(String startCourseName,
               String startLetterGrade)
  {
      courseName = startCourseName;
      letterGrade = startLetterGrade;
  }
  
  public String getCourseName( )
  {
      return courseName;
  }
  
  public String getLetterGrade( )
  {
      return letterGrade;
  }
  
  public void setCourseName(String newCourseName)
  {
      courseName = newCourseName;
  }
  
  public void setLetterGrade(String newLetterGrade)
  {
      letterGrade = newLetterGrade;
  }
  
  public String toString( )
  {
      return "Course name: " + courseName
             + "; letter grade: " + letterGrade;
  }
  
  public boolean equals(Object o)
    {
        if(!(o instanceof Grade))
            return false;
        else
        {
            Grade objGrade = (Grade) o;
            if (courseName.equals(objGrade.courseName)
                && letterGrade.equals(objGrade.letterGrade))
                    return true;
            else
                    return false;
        }
    }
}
