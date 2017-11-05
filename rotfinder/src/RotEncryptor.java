public class RotEncryptor {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Incorrect arguments");
        }
        int rot = Integer.parseInt(args[0]);
        Alphabet alphabet = new Alphabet(rot);
        System.out.println(alphabet.shiftString(args[1]).toLowerCase());
    }
}
