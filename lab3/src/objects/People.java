package objects;

import enums.Gender;
import enums.Nationality;
import exceptions.NameException;
import interfaces.Conflict;
import interfaces.Die;

public class People extends Live implements Die, Conflict {
     String name;
    private Gender gender;
    private Nationality nationality;
    public People (String name, Gender gender, Nationality nationality){
        super(name);
        this.gender=gender;
        this.nationality=nationality;
    }
    @Override
    public String toString(){
        return name;
    }


    public Nationality getNationality() {
        return nationality;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public String getName() {
       return this.name;
    }
        @Override
    public void conflict(People object) throws ConflictException {
        if (this.equals(object)) {
            throw new ConflictException("Объект не может конфликтовать сам собой");
        }
        System.out.println(name + " конфликт произошел c " + object.name);


    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Live live = (Live) o;
        return Objects.equals(name.toLowerCase(), live.name.toLowerCase());
    }

    @Override
    public void conflict(Obj obj) throws ConflictException {

 

    @Override
    public void die() {
        System.out.println("f");

    }

    public void setName() throws NameException {
        if (name == null) throw new NameException();
        this.name = name;
    }
}
