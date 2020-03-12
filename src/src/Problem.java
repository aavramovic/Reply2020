import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyPair;
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
    ArrayList<KeyPair> solution = new ArrayList<>();
    Character[][] map;

    public Problem(String fileIn) throws IOException {
        this.fileIn = fileIn;
        Scanner scanner = new Scanner(new File("src/src/Input/" + fileIn));
        x = Integer.parseInt(scanner.next());//5
        y = Integer.parseInt(scanner.next());//3
        map = new Character[y][x];
        for (int i = 0; i < y; i++) {
            String line = scanner.next();
            for (int j = 0; j < x; j++) {
                map[i][j] = line.charAt(j);
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
            ProjectMenager projectMenager = new ProjectMenager(i, company, bonusPotential);
            projectMenagers.add(projectMenager);
        }
    }

    public void Solve() {
        int counterDeveloper = 0;
        int counterProjectMenager = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (map[i][j] == "_".charAt(0) && counterDeveloper < noOfDevelopers) {
                    developers.get(counterDeveloper).x = j;
                    developers.get(counterDeveloper).y = i;
                    counterDeveloper++;
                }
                if (map[i][j] == "M".charAt(0) && counterProjectMenager < noOfProjectManagers) {
                    projectMenagers.get(counterProjectMenager).x = j;
                    projectMenagers.get(counterProjectMenager).y = i;
                    counterProjectMenager++;
                }
            }
        }
    }

    public void WriteList() throws IOException {
        FileWriter fileWriter = new FileWriter("src/src/Output/" + fileIn);
        for (Developer d : developers) {
            if (d.x == -1)
                fileWriter.write("X");
            else {
                fileWriter.write(d.x + " " + d.y);
            }
            fileWriter.write("\n");
        }
        for (ProjectMenager p : projectMenagers) {
            if (p.x == -1)
                fileWriter.write("X");
            else {
                fileWriter.write(p.x + " " + p.y);
            }
            if (p.id != noOfProjectManagers - 1)
                fileWriter.write("\n");
        }
        fileWriter.close();
    }
}
