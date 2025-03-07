import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    private HashMap phoneBook;
    private ArrayList<HashMap> checkBook;
    private Iterator<HashMap> iterateBook;
    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        phoneBook = new HashMap();
        phoneBook.put("Hello","514");
        phoneBook.put("World","614");
        phoneBook.put("Hi","714");
    }
    
    public void enterNumber(String name, String number) {
        phoneBook.put(name,number);
    }
    
    public String lookupNumber(String name) {
        return phoneBook.get(name).toString();
    }
    
    public void lookupValue(String number) {
        System.out.println(phoneBook.containsValue(number));
    }
    
    public void viewCollection() {
        System.out.println(phoneBook.containsKey("Hello"));
    }
    
    public void viewKeys() {
        System.out.println(phoneBook.keySet());
    }
    
}
