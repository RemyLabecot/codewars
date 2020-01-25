public class AddLetters {

    // renvoi la lettre qui correspond à la position dans l'alphabet
    // de l'addition de la position de chaques lettres passées dans la méthode
    // Si la lettre z est passée avec d'autres lettres, elle vaut 0
    public static String addLetters(String... letters) {
        long nombreTotal = 0;

        if(letters.length == 0) {
            return "z";
        }
        for (String letter:letters) {
            if(letter.equals("z") && letters.length == 1) {
                return "z";
            }
            nombreTotal += transformLetterToNumericPosition(letter);
        }
        if(nombreTotal > 26) nombreTotal = nombreTotal%26;
        if(nombreTotal<1) nombreTotal =26;

        return transformNumberIntoAlphabetLetterAtPosition(nombreTotal);
    }

    public static long transformLetterToNumericPosition(String letter) {

        if(letter.equals("z")) {
            return 0;
        } else {
            return letter.charAt(0) - 96;
        }
    }

    public static String transformNumberIntoAlphabetLetterAtPosition(long numericValue) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] arrayChar = alphabet.toCharArray();
        String result = "";

        for(int i = 0; i <  arrayChar.length; i++) {
            if (numericValue == i+1) {
                result = String.valueOf(arrayChar[i]);
            }
        }
        return result;
    }
}
