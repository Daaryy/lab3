package exceptions;

public class NameException extends Exception {
    public NameException(){
        super("Данное имя не может использоваться");
    }
}
