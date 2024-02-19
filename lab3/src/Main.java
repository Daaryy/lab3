import objects.*;
import enums.Condition;
import enums.Gender;
import enums.Nationality;

public class Main {
    public static void main(String[] args) {
        People jo = new People("Йохансен", Gender.MALE, Nationality.NORVEGIAN);
        People br = new People("Брайден", Gender.MALE, Nationality.UNKNOWN);
        Monster monster= new Monster("Существо");
        monster.feeling(Condition.HUNGRY);
        br.feeling(Condition.MADNESS);
        br.feeling(Condition.FUN);
        jo.feeling(Condition.DESPAIR);
        jo.feeling(Condition.CONFUSION);
        jo.feeling(Condition.DETERMINATION);
        jo.feeling(Condition.TIRED);
        jo.feeling(Condition.INSANITY);
        Live t = new Live("name");
        Live f = new Live("name");
        Ship ship= new Ship("Бдительная");
        ship.conflict(ship, jo);
        Water waves = new Water("Неизвестное море");
        Water waves1 = new Water("Волны") {
            public void rising(Water water) {
                System.out.println(name+" " + "колышутся");
            }
        };
        waves1.rising(waves1);

        //System.out.println(t.equals(f));

    }
}
