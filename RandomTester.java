import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random rand;
    
    public RandomTester() {
        rand = new Random();
    }
    
    public void printOneRandom() {
        System.out.println(rand.nextInt(100));
    }
    
    public void printMultiRandom(int howMany) {
        for(int i = 1; i <= howMany; i++) {
            System.out.println(rand.nextInt(100));
        }
    }
    
    public int throwDice() {
        return rand.nextInt(6)+1;
    }
    
    public String getResponse() {
        ArrayList<String> response = new ArrayList<String>();
        response.add("yes");
        response.add("no");
        response.add("maybe");
        return response.get(rand.nextInt(3));
    }
    
    public void minMax(int min, int max) {
        throwDice();
    }
}
