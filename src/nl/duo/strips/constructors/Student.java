package nl.duo.strips.constructors;

public class Student {

    private String name;
    private int age;

    // onthoud! Als ik een constructor maak, dan wordt de default constructor NIET meer voor mij gemaakt

    public Student(String name) {
        this.name = name;
    }

    // overloaded constructor
    public Student(int age) {
        this("Onbekend", age);
//        this.age = age;// of iets anders
    }


    // overloaded constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
