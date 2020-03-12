import java.security.KeyPair;
import java.util.ArrayList;

public class Developer {
    int id;
    String company;
    int bonusPotential;
    int numberOfSkills;
    ArrayList<String> skills;
    int x = -1;
    int y = -1;

    public Developer(int id, String company, int bonusPotential, int numberOfSkills, ArrayList<String> skills) {
        this.id = id;
        this.company = company;
        this.bonusPotential = bonusPotential;
        this.numberOfSkills = numberOfSkills;
        this.skills = skills;
    }
}
