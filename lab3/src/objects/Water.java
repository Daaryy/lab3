package objects;

public class Water extends NotLive{
    public Water(String name) {
        super(name);
    }
    public void rising(Water water){
        System.out.println(name +"кипит");
    }
}
