package Books;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class FictionEnglish extends FictionBook {
    private static List<String> titles;
    private static Random random = new Random();

    static {
        try {
            titles = Files.readAllLines(Paths.get("src/Books/Fiction_English.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            titles = List.of("Untitled");
        }
    }

    public FictionEnglish() {
        super(getRandomTitle());
    }

    private static String getRandomTitle() {
        int index = random.nextInt(titles.size());
        return titles.get(index);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
