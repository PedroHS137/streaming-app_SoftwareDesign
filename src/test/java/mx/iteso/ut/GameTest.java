package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class GameTest {
        game game;

        @Before
        public void setUp(){
            game = new game();
        }

        @Test
        public void testLevel1_100() {
            game.level1(100);
        }
        @Test
        public void testLevel1_200() {
            game.level1(200);
        }
        @Test
        public void testLevel1_300() {
            game.level1(300);
        }
        @Test
        public void testLevel2_100() {
            game.level1(100);
        }
        @Test
        public void testLevel2_200() {
            game.level1(200);
        }
        @Test
        public void testLevel2_300() {
            game.level1(300);
        }
        @Test
        public void testLevel3_100() {
            game.level1(100);
        }
        @Test
        public void testLevel3_200() {
            game.level1(200);
        }
        @Test
        public void testLevel3_300() {
            game.level1(300);
        }

}
