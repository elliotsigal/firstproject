public class Student {
    private int age;
    private int averageage;

    public Student(int dob, int currentyear) {
        age = currentyear - dob;

    }
    public Student() {
        averageage = 16;

    }
    public int getAge() {
        return age;
    }
    public int getAverageage() {
        return averageage;
    }

}