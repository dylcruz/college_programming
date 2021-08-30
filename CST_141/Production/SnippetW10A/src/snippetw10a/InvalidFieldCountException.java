package snippetw10a;

/**
 * Dylan Cruz | CST141-SP17 | SnippetWeek10
 */
public class InvalidFieldCountException extends Exception{
    
    private int fieldCount;
    
    public InvalidFieldCountException(int fieldCount){
        super("Invalid field count " + fieldCount);
        this.fieldCount = fieldCount;
    }
    
    public int getFieldCount(){
        return fieldCount;
    }
}
