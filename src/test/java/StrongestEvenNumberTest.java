
import org.junit.Test;

import static org.junit.Assert.*;

public class StrongestEvenNumberTest {


    @Test
    public void doit_renvoyer_le_nombre_avec_la_plus_haute_strongness_dans_une_intervale() {

        assertEquals(2, StrongestEvenNumber.strongestEven(1,2));
        assertEquals(8, StrongestEvenNumber.strongestEven(5,10));
        assertEquals(48, StrongestEvenNumber.strongestEven(48,56));
        assertEquals(192, StrongestEvenNumber.strongestEven(129,193));
    }

    @Test
    public void doit_renvoyer_la_strongness_de_deux_nombres() {

        assertEquals(2, StrongestEvenNumber.computeStrongnessOfANumber(8));
        assertEquals(0, StrongestEvenNumber.computeStrongnessOfANumber(17));
        assertEquals(4, StrongestEvenNumber.computeStrongnessOfANumber(48));
    }
}
