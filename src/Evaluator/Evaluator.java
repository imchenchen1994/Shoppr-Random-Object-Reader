package Evaluator;

public class Evaluator {

    public Evaluator() {
    }

    
    public int evaluate(String object){
        char[] charArray = object.toCharArray();
        boolean isNumeric = false;
        boolean isAlphabet = false;
        for(int i =0; i < charArray.length; i++){
            //if it contains decimal, it is a real number
            if(charArray[i] == '.')
                return 4;
            if(Character.isDigit(charArray[i])){
                isNumeric = true;
            }
            if(Character.getType(charArray[i]) == Character.LOWERCASE_LETTER){
                isAlphabet = true;
            }
            
        }
        
        if(isNumeric){
            //if it contains numeric and contains alphabet, it is a alphanumeric
            if(isAlphabet)
                return 3;
            
            //else it is an integer
            return 1;
        }
        
        //else it is a alphabeticalString
        return 2;


    }
    

}
