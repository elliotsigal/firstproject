public class Player {
    private String name;
    private int osis;
    private String email;
    private double score;
    public void setName(String name) {
        System.out.println("Hello " + name);
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

        score = (correct/5)*100;
    }
    public double getScore()
    {
        return score;
    }
    public boolean equals (Player player2) {return player2.getOsis()==(this.getOsis());}



}