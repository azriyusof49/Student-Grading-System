import java.util.*;

public class Lang{
    private String INPUT;
    public Lang(){
    }

    public String getText(String input){
        
        this.INPUT = input;

        Map<String, String> text = new HashMap<>();
        //---------------------------------------------------------------------------------------------------------------------------------//
        text.put("SysName",     "Student Grading System"); //JUST COPY AND PAST FOR NEW TEXT (EDIT LANGUAGE HERE)
        text.put("second",      "This is the second element");
        text.put("third",       "This is the third element");


        //--------------------------------------------------------------------------------------------------------------------------------//
        // Access elements using string keys
        String outputText = text.get(input);
        return outputText;
    }
}