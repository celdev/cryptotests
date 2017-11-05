import java.util.ArrayList;
import java.util.List;

public class RotFinder {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error incorrect arguments");
            System.exit(1);
            return;
        }
        final String ciphertext = args[0].toLowerCase();
        final WordList wordList = new WordList(args[1]);
        final List<CipherResult> cipherResults = new ArrayList<>();
        for(int i = 1; i < Alphabet.BASE_ALPHABET.length; i++) {
            String decryptTest = new Alphabet(i).shiftString(ciphertext);
            long matchesOfText = wordList.getMatchesOfText(decryptTest);
            cipherResults.add(new CipherResult(i, matchesOfText, decryptTest));
        }
        cipherResults.sort(CipherResult.cipherResultComparator);
        cipherResults.get(0).print();
    }


}
