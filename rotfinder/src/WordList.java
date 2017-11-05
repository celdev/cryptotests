import java.util.*;
import java.util.stream.Collectors;

public class WordList {

    private Set<String> wordSet = new HashSet<>();

    public WordList(String in) {
        in = in.toLowerCase();
        wordSet.addAll(Arrays.asList(in.split("\n")));
    }

    public boolean containsWord(String word) {
        return wordSet.contains(word);
    }

    public long getMatchesOfText(String text) {
        long hits = 0;
        for (String s : text.split(" ")) {
            if (containsWord(s)) {
                hits++;
            }
        }
        return hits;
    }


    public String getListAsString() {
        return wordSet.stream().collect(Collectors.joining(" "));
    }
}
