public class Studentt {
    String name;
    String surname;
    String happyBirthday;
    int age;

    public Studentt(){

    }

    public Studentt(String name, String surname, String happyBirthday, int age) {
        this.name = name;
        this.surname = surname;
        this.happyBirthday = happyBirthday;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", happyBirthday='" + happyBirthday + '\'' +
                ", age=" + age +
                '}';
    }
}



