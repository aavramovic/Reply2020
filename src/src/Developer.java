import java.util.ArrayList;

public class Developer {
    int id;
    String company;
    int bonusPotential;
    int numberOfSkills;
    ArrayList<String> skills;

    public Developer(int id, String company, int bonusPotential, int numberOfSkills, ArrayList<String> skills) {
        this.id = id;
        this.company = company;
        this.bonusPotential = bonusPotential;
        this.numberOfSkills = numberOfSkills;
        this.skills = skills;
    }
}
