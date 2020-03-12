import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
    String fileIn;
    int x;
    int y;
    int noOfDevelopers;
    int noOfProjectManagers;
    ArrayList<Developer> developers = new ArrayList<>();
    ArrayList<ProjectMenager> projectMenagers = new ArrayList<>();

    public Problem(String fileIn) throws FileNotFoundException {
        this.fileIn = fileIn;
        Scanner scanner = new Scanner(new File("src/src/Input/" + fileIn));
        x = Integer.parseInt(scanner.next());//5
        y = Integer.parseInt(scanner.next());//3
        Character[][] map = new Character[x][y];
        for (int i = 0; i < y; i++) {
            String line = scanner.next();
            for (int j = 0; j < x; j++) {
                map[j][i] = line.charAt(j);
                System.out.println(map[j][i]);
            }
        }
        noOfDevelopers = Integer.parseInt(scanner.next());
        for (int i = 0; i < noOfDevelopers; i++) {
            String company = scanner.next();
            int bonusPotential = Integer.parseInt(scanner.next());
            int numberOfSkills = Integer.parseInt(scanner.next());
            ArrayList<String> skills = new ArrayList<>();
            for (int j = 0; j < numberOfSkills; j++) {
                skills.add(scanner.next());
            }
            Developer developer = new Developer(i, company, bonusPotential, numberOfSkills, skills);
            developers.add(developer);
        }
        noOfProjectManagers = Integer.parseInt(scanner.next());
        for (int i = 0; i < noOfProjectManagers; i++) {
            String company = scanner.next();
            int bonusPotential = Integer.parseInt(scanner.next());
            ProjectMenager projectMenager = new ProjectMenager(noOfDevelopers + i, company, bonusPotential);
            projectMenagers.add(projectMenager);
        }
    }
}
