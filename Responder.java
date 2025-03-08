import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

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
    private HashMap<String,String> responseBook;
    private Random rand;
    private int index = -1;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        response = new ArrayList<String>();
        responseBook = new HashMap<>();
        rand = new Random();
        fillResponsesMap();
        fillDefaultResponses();
    }
    
    public Responder(int number){
        response = new ArrayList<String>();
        responseBook = new HashMap<>();
        rand = new Random();
        fillResponses();
        fillResponsesMap();
        System.out.println(response.get(rand.nextInt(number)));
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    {
        for(String word : words) {
            if(responseBook.containsKey(word)) {
                return responseBook.get(word).toString();
            }
        } return pickDefaultResponse(cycleDefaultResponse());
    }
    
    public String pickDefaultResponse(int index) {
        //return responseBook.get("okay").toString(); //Question 33
        return response.get(index);
    }
    
    public int cycleDefaultResponse() {
        if(this.index+1 ==response.size()){
            this.index = -1;
        }
        index++;
        return index;
    }
    
    public void fillResponses() {
        response.add("Okay");
        response.add("Cool");
        response.add("Whatever");
    }
    
    public void fillResponsesMap() {
        responseBook.put("okay", "Okay, that's interesting!");
        responseBook.put("ok", "Okay, that's interesting!");
        responseBook.put("k", "Okay, that's interesting!");
        responseBook.put("cool", "Cool Story bro");
        responseBook.put("whatever", "Whatever you say man");
        responseBook.put("w/e", "Whatever you say man");
        responseBook.put("help", "I cannot help you");
        responseBook.put("gelp", "I cannot help you");
        responseBook.put("!help", "I cannot help you");
        responseBook.put("please", "Sorry I have a partner");
        responseBook.put("pls", "Sorry I have a partner");
        responseBook.put("plz", "Sorry I have a partner");
        responseBook.put("why", "why not?");
        responseBook.put("how", "how so?");
        responseBook.put("who", "who cares");
    }
    
    public void fillDefaultResponses() {
        response.add("Okay");
        response.add("Cool");
        response.add("Whatever");
        response.add("Nice");
        response.add("I See..");
        response.add("Alright");
    }
}
