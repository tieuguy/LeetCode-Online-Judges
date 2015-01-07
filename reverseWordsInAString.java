import java.util.ArrayList;
import java.util.Arrays;

/*
    "the sky is blue" -> "blue is the sky"
    "       the sky is blue" -> "blue is the sky"
    "the sky is blue       " -> "blue is the sky"
*/
public class Solution {
    public static String reverseWords(String s) {
        ArrayList<String> tokens = new ArrayList();
        int ctr = 0;
        StringBuffer output = new StringBuffer();
        tokens.addAll(listOfStrings(s));
        
        // add tokens in reverse order
        for(ctr = tokens.size() - 1; ctr >= 0; ctr--){
            if(ctr == 0){
                output.append(tokens.get(ctr));
            }else{
                output.append(tokens.get(ctr));
                output.append(" ");
            }    
        }
        return output.toString();
    }
    
    public static ArrayList<String> listOfStrings (String s){
        ArrayList<String> tokens = new ArrayList();
        StringBuffer token = new StringBuffer();
        int i = 0;
        
        for(i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
            	// avoid many spaces
            	if(token.length() > 0){
            		tokens.add(token.toString());
            		token.setLength(0);
            	}
            }else if(i == s.length() - 1){
                token.append(s.charAt(i));
                tokens.add(token.toString());
            }else{
            	token.append(s.charAt(i));
            }
        }
        return tokens;
    }
}