package mx.iteso.ut;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


import java.util.ArrayList;

public class ScoreTest {
    Score score;
    category category;

    @Before
    public void setUp() {
        score = new Score();
        category = new category();
    }

    @Test
    public void testGetTotalScoreWithTrashShows() {
        int n = 10;
        ArrayList<String> list = new ArrayList<>();
        list.add("hola");
        list.add("hola");
        list.add("hola");
        list.add("hola");
        list.add("sexual");
        list.add("hola");
        list.add("hola");
        list.add("violento");
        list.add("hola");
        list.add("hola");
        score.getTotalScore(list, n);
        assertTrue(0.0 <= score.getTotalScore(list, n));

    }
    @Test
    public void testGetTotalScore() {
        int n = 10;
        ArrayList<String> list = new ArrayList<>();
        list.add("hola");
        list.add("hola");
        list.add("hola");
        list.add("hola");
        list.add("naturaleza");
        list.add("hola");
        list.add("hola");
        list.add("ciencia");
        list.add("hola");
        list.add("hola");
        score.getTotalScore(list, n);
        assertTrue(0.0 <= score.getTotalScore(list, n));

    }

}
