package objects;

import enums.Condition;

import java.util.Objects;

public class Live extends Obj  {
    String name;
    public Live(String name){
        super(name);
        this.name=name;
    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Live live = (Live) o;
        return Objects.equals(name.toLowerCase(), live.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void feeling () {
        System.out.println(name +" "+ "чувствует, что");
    }



    public void feeling (Condition condition){
        feeling();
    switch (condition){
            case  MADNESS :
                System.out.println("потерял рассудок");
                break;
            case FUN:
                System.out.println("смеется");
                break;
            case DESPAIR:
                System.out.println("в отчаянии");
                break;
        case DETERMINATION  :
            System.out.println("решился");
            break;
        case TIRED:
            System.out.println("силы оставили его");
            break;
        case CONFUSION :
            System.out.println("не знает, что предпринять");
            break;

        case HUNGRY:
            System.out.println("слюни потекли");
            break;
        }

    }
}
