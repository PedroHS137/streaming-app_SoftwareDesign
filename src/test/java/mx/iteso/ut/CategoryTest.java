package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.junit.Assert.assertThat;

public class CategoryTest {
    category category;

    @Before
    public void setUp(){
        category = new category();
    }

    @Test
    public void testLevel1() {
        category.getCategorylv1();
        assertTrue(!category.getCategorylv1().isEmpty());
    }
    @Test
    public void testLevel2() {
        category.getCategorylv2();
        assertTrue(!category.getCategorylv2().isEmpty());
    }
    @Test
    public void testLevel3() {
        category.getCategorylv3();
        assertTrue(!category.getCategorylv3().isEmpty());
    }
    @Test
    public void testRandomShow() {
        category.getRndShow();
        assertTrue(!category.getRndShow().isEmpty());
    }
    @Test
    public void testRandomShowPos() {
        category.getRndShowPos();
        int high = 202;
        int low = 0;
        assertTrue("Error, value is too high", high >= category.getRndShowPos());
        assertTrue("Error, value is too low",  low  <= category.getRndShowPos());
    }
    @Test
    public void testReadCellData1() {
        int a = category.getRndShowPos();
        assertTrue(!category.ReadCellData(a,1).isEmpty());
    }
    @Test
    public void testReadCellData2() {
        int a = category.getRndShowPos();
        assertTrue(!category.ReadCellData(a,2).isEmpty());
    }
    @Test
    public void testReadCellData3() {
        int a = category.getRndShowPos();
        assertTrue(!category.ReadCellData(a,3).isEmpty());
    }

}
