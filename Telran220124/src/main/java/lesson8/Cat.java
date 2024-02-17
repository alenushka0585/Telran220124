package lesson8;

public class Cat {
    private String nick;
    private int age;
    private String color;

    public Cat(String nick, int age, String color) {
        this.nick = nick;
        this.age = age;
        this.color = color;
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat:" + nick  +
                ", age: " + age +
                ", color: " + color;
    }
}
