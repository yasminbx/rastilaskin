package laskin;

import org.example.Laskin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;


public class LaskinTest {

    // Fixture: using the same calculator object for all tests, reset before each test
    private final Laskin laskin = new Laskin();

    @BeforeEach
    public void clearCalculator() {
        laskin.nollaa();
    }

    @Test
    public void testLisaa() {
        laskin.lisaa(1);
        laskin.lisaa(2);
        assertEquals(3, laskin.annaTulos(), "Lukujen 1 ja 2 summa väärin");
    }

    @Test
    public void testVahenna() {
        laskin.lisaa(10);
        laskin.vahenna(2);
        assertEquals(8, laskin.annaTulos(), "Lukujen 10 ja 2 erotus väärin");
    }

    @Test
    @DisplayName("Testaa jakolasku 8 / 2")
    public void testJaa() {
        laskin.lisaa(8);
        laskin.jaa(2);
        assertEquals(4, laskin.annaTulos(), "Jakolasku 8/2 väärin");
    }

    @Test
    @DisplayName("Testaa nollallajako")
    public void testJaaNollalla() {
        IllegalArgumentException poikkeus = assertThrows(IllegalArgumentException.class, () -> laskin.jaa(0));
        assertEquals("Nollalla ei voi jakaa!", poikkeus.getMessage(), "Virheilmoituksen tulisi olla 'Nollalla ei voi jakaa!'");
    }


    @Test
    public void testNelio() {
        laskin.nelio(4);
        assertEquals(16, laskin.annaTulos(), "Luvun 4 neliöön korotus väärin");
    }


}
