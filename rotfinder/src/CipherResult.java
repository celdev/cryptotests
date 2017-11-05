import java.util.Comparator;

public class CipherResult {

    private int rot;
    private long hits;
    private String plaintext;

    public CipherResult(int rot, long hits, String plaintext) {
        this.rot = rot;
        this.hits = hits;
        this.plaintext = plaintext;
    }

    public void print() {
        System.out.println("ROT" + rot + " result: \n" + plaintext);
    }

    public static Comparator<CipherResult> cipherResultComparator = (cr1, cr2) -> (int)(cr2.hits - cr1.hits);

}
