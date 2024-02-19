package objects;

import interfaces.Conflict;

public class Ship extends NotLive implements Conflict {
    public Ship(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public void conflict(Obj obj, Obj obj1) {

    System.out.println(Ship.name +"столкнулся с"+ "чудовищем");

    }

    class Deck{}
    class Bridge{}
    class Feed {}
    class Bow{}
    class Bowsprit{}
    class Сabin{}
    class SteeringWheel{}
}
