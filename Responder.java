import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private ArrayList<String> response;
    private HashMap responseBook;
    private Random rand;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        
    }
    
    public Responder(int number){
        response = new ArrayList<String>();
        responseBook = new HashMap();
        rand = new Random();
        fillResponses();
        System.out.println(response.get(rand.nextInt(number)));
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String[] word)
    {
        if(responseBook.containsKey(word)) {
            return responseBook.get(word).toString();
        } else {
            return pickDefaultResponse();
        }
    }
    
    public String pickDefaultResponse() {
        return responseBook.get("Okay").toString();
    }
    
    public void fillResponses() {
        response.add("Okay");
        response.add("Cool");
        response.add("Whatever");
    }
    
    public void fillResponsesMap() {
        responseBook.put("Okay", "Okay, that's interesting!");
        responseBook.put("Cool", "Cool Story bro");
        responseBook.put("Whatever", "Whatever you say man");
    }
}
