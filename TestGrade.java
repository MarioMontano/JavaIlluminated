/**
 * Encapsulates the concept of student grades on a test, 
 * assuming student grades are composed of a list of integers 
 * between 0 and 100.

 * Mario Montano
 * 
 */

public class TestGrade
{   
    private int numberStudents;
    
    public TestGrade(int startNumberStudents)
    {
        setNumberStudents(startNumberStudents);
    }
    
    public int getNumberStudents( )
    {
        return numberStudents;
    }
    
    public void setNumberStudents(int newNumberStudents)
    {
        if( newNumberStudents >=0 )
            numberStudents = newNumberStudents;
        else
        {
            System.err.println("Number of students cannot be negative.");
            System.err.println("Value not changed.");
        }
    }
    
    public String toString( )
    {
        return "Number of students: " + numberStudents;
    }
    
    public boolean equals(Object o)
    {
        if(!(o instanceof TestGrade))
            return false;
        else
        {
            TestGrade objTestGrade = (TestGrade) o;
            if (numberStudents == objTestGrade.numberStudents)
                    return true;
            else
                    return false;
        }
    }
    
    public void testGrade( String [ ] args)
    {
        int [ ] testGrade = new int [numberStudents];
    
        for (int i = 0; i < testGrade.length; i++)
        {
            testGrade[i] = (int)(Math.random()*100 + 1);
        }
    }
    
    public static void selectionSort(int [ ] testGrade)
    {
        int temp;
        int max;
        
        for ( int i = 0; i < testGrade.length -1; i++)
        {
            max = indexOfLargestElement(testGrade, testGrade.length - i);
            
            temp = testGrade[max];
            testGrade[max] = testGrade[testGrade.length - i - 1];
            testGrade[testGrade.length - i - 1] = temp;
        }
    }
    private static int indexOfLargestElement(int [ ] testGrade, int size)
    {
        int index = 0;
        for (int i = 1; i < size; i++)
        {
            if (testGrade[i] > testGrade[index])
                index = i;
        }
        return index;
    }
    
    public static void highestGrade(int [ ] testGrade)
    {
        int maxIndex = 0;
        for (int i = 1; i < testGrade.length; i++)
        {
            if (testGrade[i] > testGrade[maxIndex])
            maxIndex = i;
        }
        
        System.out.println("The highest grade, " + testGrade[maxIndex]);
    }
    
    public static void average(int [ ] testGrade)
    {
        int total = 0;
        for (int i = 0; i < testGrade.length; i++)
        {
            total += testGrade[i];
        }
        
        System.out.println("Average: " + (total/testGrade.length));    
    } 
    
    public static void median(int [ ] testGrade)
    {
       int median;
       if (testGrade.length % 2 == 0)
            median = (testGrade[testGrade.length/2] + testGrade[testGrade.length/2 - 1])/2;
       else 
            median = testGrade[testGrade.length/2];
    }
    
    public static void mode(int [ ] testGrade)
    {
        int count1 = 0;
        int count2 = 0;
        int popular1 = 0;
        int popular2 = 0;


        for (int i = 0; i < testGrade.length; i++)
        {
            popular1 = testGrade[i];
            count1 = 1; 

            for (int j = i + 1; j < testGrade.length; j++)
            {
                if (popular1 == testGrade[j]) 
                count1++;
            }

            if (count1 > count2)
            {
                popular2 = popular1;
                count2 = count1;
            }
        }
        System.out.println("Mode: " + popular2);
    }
}
