import java.util.*;

public class Lang{
    public Lang(){
    }

    public String getText(String input){
        

        Map<String, String> text = new HashMap<>();
        //---------------------------------------------------------------------------------------------------------------------------------//
        text.put("SysName",          "Student Grading System"); //JUST COPY AND PAST FOR NEW TEXT (EDIT LANGUAGE HERE)
        text.put("lockAccount",      "Account locked due to multiple failed attempts. Please try again later.");
        text.put("import",           "Import");
        text.put("report",           "Grade Report");
        text.put("listStudent",      "List Student"); //TODO : If NOT USE REMOVE
        text.put("exit",             "Exit");
        


        //--------------------------------------------------------------------------------------------------------------------------------//
        // Access elements using string keys
        String outputText = text.get(input);
        return outputText;
    }
}