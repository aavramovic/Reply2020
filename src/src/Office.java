import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Office {
    public static void main(String[] args) throws IOException {
        List<String> listIn = new ArrayList<>();
        listIn.add("a_solar.txt");
        listIn.add("b_dream.txt");
        listIn.add("c_soup.txt");
        listIn.add("d_maelstrom.txt");
        listIn.add("e_igloos.txt");
        listIn.add("f_glitch.txt");
        for (String s : listIn) {
            Problem problem = new Problem(s);
            problem.Solve();
            problem.WriteList();
        }
    }
}
