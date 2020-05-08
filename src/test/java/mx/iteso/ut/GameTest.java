package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


import java.io.ByteArrayInputStream;



public class GameTest {
        game game;

        @Before
        public void setUp(){
            game = new game();
        }

        @Test
        public void testLevel1_100() {
            //InputStream sysInBackup = System.in; // backup System.in to restore it later
            ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n1\n1\n1\n1\n1" +
                    "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
            System.setIn(in);

            Float score = game.level1(100);
            //System.setIn(sysInBackup);
            assertTrue(0.0 <= score);
        }
        @Test
        public void testLevel1_100A() {
        //InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream(("1\n0\n1\n0\n1\n0\n0\n1\n1" +
                "\n1\n1\n0\n1\n1\n0\n1\n0\n1\n0\n1\n1\n0\n1\n1\n1\n1\n1\n1\n").getBytes());
        System.setIn(in);

        Float score = game.level1(100);
        //System.setIn(sysInBackup);
        assertTrue(0.0 <= score);
    }

        @Test
        public void testLevel1_200() {

                //InputStream sysInBackup = System.in; // backup System.in to restore it later
            ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n1\n1\n1\n1\n1" +
                    "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
            System.setIn(in);

            Float score = game.level1(200);
            //System.setIn(sysInBackup);
            assertTrue(0.0 <= score);

        }
        @Test
        public void testLevel1_200A() {
            ByteArrayInputStream in = new ByteArrayInputStream(("0\n0\n1\n0\n0\n1\n0\n1\n0" +
                    "\n1\n1\n1\n1\n0\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
            System.setIn(in);
            Float score = game.level1(200);
            //System.setIn(sysInBackup);
            assertTrue(0.0 <= score);

    }
        @Test
        public void testLevel1_300() {

            ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n1\n1\n1\n1\n1" +
                    "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
            System.setIn(in);
            Float score = game.level1(100);
            assertTrue(0.0 <= score);
        }
        @Test
        public void testLevel1_300A() {

            ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n0\n0\n0\n0\n1" +
                    "\n1\n1\n0\n0\n1\n1\n0\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
            System.setIn(in);
            Float score = game.level1(100);
            assertTrue(0.0 <= score);
        }
        @Test
        public void testLevel2_100() {
            ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n1\n1\n1\n1\n1" +
                    "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
            System.setIn(in);
            Float score = game.level2(100);
            assertTrue(0.0 <= score);
        }
        @Test
        public void testLevel2_100A() {

            ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n0\n0\n0\n0\n1" +
                    "\n1\n1\n0\n0\n1\n1\n0\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
            System.setIn(in);
            Float score = game.level2(100);
            assertTrue(0.0 <= score);
        }
        @Test
        public void testLevel2_200() {
            ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n1\n1\n1\n1\n1" +
                    "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
            System.setIn(in);
            Float score = game.level2(200);
            assertTrue(0.0 <= score);
        }
        @Test
        public void testLevel2_200A() {
            ByteArrayInputStream in = new ByteArrayInputStream(("1\n0\n1\n0\n1\n0\n1\n0\n0" +
                    "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
            System.setIn(in);
            Float score = game.level2(200);
            assertTrue(0.0 <= score);
        }
    @Test
    public void testLevel2_300() {
        ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n1\n1\n1\n1\n1" +
                "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
        System.setIn(in);
        Float score = game.level2(300);
        assertTrue(0.0 <= score);
    }
    @Test
    public void testLevel3_100() {
        ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n1\n1\n1\n1\n1" +
                "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
        System.setIn(in);
        Float score = game.level3(100);
        assertTrue(0.0 <= score);
    }
    @Test
    public void testLevel3_100A() {

        ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n0\n0\n0\n0\n1" +
                "\n1\n1\n0\n0\n1\n1\n0\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
        System.setIn(in);
        Float score = game.level3(100);
        assertTrue(0.0 <= score);
    }
    @Test
    public void testLevel3_200() {
        ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n1\n1\n1\n1\n1" +
                "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
        System.setIn(in);
        Float score = game.level3(200);
        assertTrue(0.0 <= score);
    }
    @Test
    public void testLevel3_200A() {
        ByteArrayInputStream in = new ByteArrayInputStream(("1\n0\n1\n0\n1\n0\n1\n0\n0" +
                "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
        System.setIn(in);
        Float score = game.level3(200);
        assertTrue(0.0 <= score);
    }
    @Test
    public void testLevel3_300() {
        ByteArrayInputStream in = new ByteArrayInputStream(("1\n1\n1\n1\n1\n1\n1\n1\n1" +
                "\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n").getBytes());
        System.setIn(in);
        Float score = game.level3(300);
        assertTrue(0.0 <= score);
    }

}
