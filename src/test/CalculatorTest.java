package test;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;


/**
 * Created by Nekisse_lee on 2017. 8. 26..
 */
public class CalculatorTest {
    private Calculator cal;

    @Before
    public void setCal(){
        cal = new Calculator();
    }
    @Test
    public void add(){
        assertThat(cal.add(1,2),is(3));
        assertEquals(3,cal.add(1,2));

    }
}
