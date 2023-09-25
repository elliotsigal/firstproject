public class Player {
    private String name;
    private int osis;
    private String email;
    private double score;
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public int getOsis() {
        return osis;
    }
    public void setOsis(int osis) {
        this.osis = osis;
    }
    public String getEmail() {
        return email;

    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void addScore(double correct)
    {

        score = (correct/4)*100;
    }
    public double getScore()
    {
        return score;
    }



}





