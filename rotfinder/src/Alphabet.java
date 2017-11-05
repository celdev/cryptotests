import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Alphabet {

    public static final char[] BASE_ALPHABET =
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                    'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                    's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private final Map<Character, Character> charMap = new HashMap<>();

    private char[] shiftedAlphabet;

    public Alphabet(int shift){
        shift = shift % BASE_ALPHABET.length;
        shiftedAlphabet = shiftAlphabet(shift);
        buildCharMap(shiftedAlphabet);
    }

    private void buildCharMap(char[] shiftedAlphabet) {
        for(int i = 0; i < BASE_ALPHABET.length; i++) {
            charMap.put(shiftedAlphabet[i], BASE_ALPHABET[i]);
        }
    }

    public String shiftString(String toShift) {
        char[] sh = toShift.toCharArray();
        char[] nch = new char[sh.length];
        for(int i = 0; i < sh.length; i++) {
            if (charMap.containsKey(sh[i])) {
                nch[i] = charMap.get(sh[i]);
            } else {
                nch[i] = sh[i];
            }
        }
        return new String(nch);
    }

    private char[] shiftAlphabet(int shift) {
        char[] shifted_alphabet = new char[BASE_ALPHABET.length];
        int index = 0;
        for(int i = shift; i < BASE_ALPHABET.length; i++) {
            shifted_alphabet[index++] = BASE_ALPHABET[i];
        }
        for(int i = 0; i < shift; i++) {
            shifted_alphabet[index++] = BASE_ALPHABET[i];
        }
        return shifted_alphabet;
    }




}
