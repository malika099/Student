public class Curss {
    String name;
    int number;
    String nameTeacher;
    String dayCURS;
   public Curss(){

   }

    public Curss(String name, int number, String nameTeacher,String dayCURS) {
        this.name = name;
        this.number = number;
        this.nameTeacher = nameTeacher;

        this.dayCURS = dayCURS;
    }

    @Override
    public String toString() {
        return "Curss{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", nameTeacher='" + nameTeacher + '\'' +

                ", dayCURS='" + dayCURS + '\'' +
                '}';


    }
}
