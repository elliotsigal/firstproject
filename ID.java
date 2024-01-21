public class ID {
    private String schoolname;
    private int graduationyear;
    public ID(String schoolname, int graduationyear){
        this.schoolname = schoolname;
        this.graduationyear = graduationyear;
    }

    public String getSchoolname() {
        return schoolname;
    }
    public int getGraduationyear() {
        return graduationyear;
    }

    public String toString(){
        return "Your school names is: " + schoolname + " and you are graduating in " + graduationyear;
    }
}
