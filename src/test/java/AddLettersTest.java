import org.junit.Test;

import static org.junit.Assert.*;


public class AddLettersTest {


    @Test
    public void doit_renvoyer_numero_par_lettre() {

        long numericPosition = AddLetters.transformLetterToNumericPosition("a");
        long numericPosition1 = AddLetters.transformLetterToNumericPosition("b");
        long numericPosition2 = AddLetters.transformLetterToNumericPosition("z");

        assertEquals(1, numericPosition);
        assertEquals(2, numericPosition1);
        assertEquals(0, numericPosition2);
    }

    @Test
    public void doit_convertir_nombre_en_position_alphabet() {

        String letter = AddLetters.transformNumberIntoAlphabetLetterAtPosition(1);
        String letter1 = AddLetters.transformNumberIntoAlphabetLetterAtPosition(26);

        assertEquals("a", letter);
        assertEquals("z", letter1);
    }

    @Test
    public void doit_renvoyer_lettre_apres_concatenation_valeur_lettres() {

        String letter = AddLetters.addLetters("a", "b", "c");
        String letter1 = AddLetters.addLetters();
        String letter2 = AddLetters.addLetters("z");
        String letter3 = AddLetters.addLetters("y", "y", "y");

        assertEquals("f", letter);
        assertEquals("z", letter2);
        assertEquals("z", letter1);
        assertEquals("w", letter3);
    }
}
