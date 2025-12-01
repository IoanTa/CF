package gr.aueb.cf.cf9.review.challenges;
/*
Κρυπτογράφιση με μετατροπή των χαρακτήρων σε ακεραίους
 */
public class CryptographyApp {
    public static void main(String[] args) {
        String str = "Coding Factory!";
        final int KEY = 256;
        System.out.println(cipher(str, KEY));
        System.out.println(decipher(cipher(str, KEY), KEY));
    }
    public static String cipher(String str, int key) {
        int prevCipher;
        int cipher;
        StringBuilder cipherArray = new StringBuilder();

        prevCipher = str.charAt(0);
        cipherArray.append(prevCipher);
        cipherArray.append(" ");

        for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '#') {
                    cipherArray.append("-1");
                    break;
                }
                cipher = (str.charAt(i) + prevCipher) % key;
                cipherArray.append(cipher);
                cipherArray.append(" ");
                prevCipher = cipher;
        }
        return cipherArray.toString();
    }

    public static String decipher(String str, int key) {
        StringBuilder decipherArray = new StringBuilder();
        String[] tokens = str.split(" ");
        char decipher;
        int cipher;

        int prevCipher = Integer.parseInt(tokens[0]);
        decipher = (char) prevCipher;
        decipherArray.append(decipher);

        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i].equals("-1")) {
                decipherArray.append("#");
                break;
            }
            cipher = Integer.parseInt(tokens[i]);
            decipher = (char) ((cipher - prevCipher + key) % key);
            decipherArray.append(decipher);
            prevCipher = cipher;
        }
    return decipherArray.toString();
    }
}
