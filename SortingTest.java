import java.util.Arrays;
/**
 * Write a description of class SortingTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingTest
{
    /**
     * Constructor for objects of class SortingTest
     */
    public SortingTest()
    {
        // initialise instance variables'
        
    }
    
    public void printSortingTest(int[] numbers) {
        Arrays.sort(numbers);
        for(int num : numbers) {
            System.out.println(num);
        }
    }
}
