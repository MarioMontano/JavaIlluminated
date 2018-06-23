/**
 * A client class to test all the methods in TestGrade class.
 * Obviously, all the sections have to be tested separately. 
 * Little tweaks have to be added to the class, for example when testing selection sort.
 * 
 * Mario Montano
 * 
 */
public class TestGradeClient
{
   public static void main(String [ ] args)
   {
      
      System.out.println("Instantiate first test");
      TestGrade first = new TestGrade( );
       
      System.out.println("\nInstantiate second test");
      TestGrade second = new TestGrade(50);
      
      System.out.println("\nInstantiate third test");
      TestGrade third = new TestGrade(49);
      
      TestGrade first = new TestGrade( );
      int firstNumberStudents = first.getNumberStudents( );
      System.out.println("number of students " + firstNumberStudents);
      
      TestGrade second = new TestGrade(48);
      int secondNumberStudents = second.getNumberStudents( );
      System.out.println("number of students " + secondNumberStudents);
      
      /**/
      
      TestGrade first = new TestGrade(54);
      System.out.println("number of students " + first.getNumberStudents( ));
      
      first.setNumberStudents(47);
      
      System.out.println("\nnumber of students " + first.getNumberStudents( ));
      
      first.setNumberStudents(-2);
      
      System.out.println("\nnumber of students " + first.getNumberStudents( ));
      
      /**/
      
      TestGrade fourth = new TestGrade(50);
      System.out.println(fourth.toString( ));
      
      TestGrade fifth = new TestGrade(51);
      System.out.println(fifth);
      
      if (fifth.equals(fourth))
        System.out.println("\nfourth and fifth are equal");
      else
        System.out.println("\nfourth and fifth are not equal");
      
      /**/

      int [ ] testGrade = new int[3];
      testGrade[0] = 55;
      testGrade[1] = 67;
      testGrade[2] = 40;
      
      TestGrade t1 = new TestGrade( );
      
      TestGrade t2 = new TestGrade(40);
      TestGrade t3 = new TestGrade(40);
      
      System.out.println("t1 = " + t1.toString( ));
      System.out.println("t2 = " + t2.toString( ));
      
      System.out.println("\nThe maximum score is "
                     + t2.highestGrade( ));
      
      System.out.println("\nThe average of all scores is "
                     + t2.average( ));
                     
      System.out.println("\nThe median of all scores is "
                     + t2.median( ));
      
      System.out.println("\nThe mode of all scores is "
                     + t2.mode( ));
                     
      System.out.println( );
      
      if(t2.equals(t3))
        System.out.println("t2 and t3 are equal");
      else
        System.out.println("t2 and t3 are not equal");
      
      testGrade[2] = 100;
      System.out.println("\nafter client changes original array\n"
                          + "t2 = " + t2.toString( ));
                          
      /**/

      int [ ] testGrade = new int [6];
      Random rand = new Random( );
      for (int i = 0; i < testGrade.length; i++)
      {
          testGrade[i] = rand.nextInt(100) + 1;
      }
      
      System.out.println("Before Selection Sort, the array is");
      for (int i = 0; i < testGrade.length; i++)
        System.out.print(testGrade[i] + "\t");
      System.out.println( );
      
      Sorter.selectionSort(testGrade);
      
      System.out.println("\nAfter Selection Sort, the array is");
      for (int i = 0; i < testGrade.length; i++)
        System.out.print(testGrade[i] + "\t");
      System.out.println( );
   }
}
