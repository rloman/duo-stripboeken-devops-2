package nl.duo.strips.access;

public class Student {

    private String name;
    private int age;
    private boolean isMan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) {
            this.name = "Onbekend";
        }
        else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }
}
