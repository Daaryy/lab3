package objects;

import interfaces.Conflict;
import interfaces.Die;

public class Monster extends Live implements Conflict, Die {
    public Monster(String name) {
        super(name);
    }

    @Override
    public void conflict(Obj obj, Obj obj1) {
        System.out.println("");
    }

    @Override
    public void die() {
        System.out.println("");
    }
}
