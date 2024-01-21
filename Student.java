public class Student {
    private int age;
    private int averageage;
    private ID id1;

    public Student(int dob, int currentyear, ID id) {
        age = currentyear - dob;
        id1 = new ID(id.getSchoolname(), id.getGraduationyear());


    }
    public Student(ID id) {
        averageage = 16;
        id1 = new ID(id.getSchoolname(), id.getGraduationyear());
    }
    public int getAge() {
        return age;
    }
    public int getAverageage() {
        return averageage;
    }
    public ID getID(){
        return id1;
    }

}