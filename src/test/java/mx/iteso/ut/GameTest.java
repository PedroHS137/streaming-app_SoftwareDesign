package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class GameTest {
        game game;

        @Before
        public void setUp(){
            game = new game();
        }

        @Test
        public void testLevel1_100() {
            game.level1(100);

            InputStream sysInBackup = System.in; // backup System.in to restore it later
            ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
            System.setIn(in);

            System.setIn(sysInBackup);
            assertTrue(0.0 <= game.level1(100));
        }
        @Test
        public void testLevel1_200() {
            game.level1(200);
            assertTrue(0.0 <= game.level1(200));
        }
        @Test
        public void testLevel1_300() {
            game.level1(300);
            assertTrue(0.0 <= game.level1(300));
        }
        @Test
        public void testLevel2_100() {
            game.level2(100);
            assertTrue(0.0 <= game.level2(100));
        }
        @Test
        public void testLevel2_200() {
            game.level2(200);
            assertTrue(0.0 <= game.level2(200));
        }
        @Test
        public void testLevel2_300() {
            game.level2(300);
            assertTrue(0.0 <= game.level2(300));
        }
        @Test
        public void testLevel3_100() {
            game.level3(100);
            assertTrue(0.0 <= game.level3(100));
        }
        @Test
        public void testLevel3_200() {
            game.level3(200);
            assertTrue(0.0 <= game.level3(200));
        }
        @Test
        public void testLevel3_300() {
            game.level3(300);
            assertTrue(0.0 <= game.level3(100));
        }

}
