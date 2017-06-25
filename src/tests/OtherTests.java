package tests;

import classes.Bank;
import classes.Money;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Łukasz on 2017-06-23.
 */
public class OtherTests {
    @Test
    public void testArrayEquals(){
        assertEquals(new Object[] {"abc"}, new Object[] {"abc"});
    }

    @Test
    public void testIdentityRate(){
        assertEquals(1, new Bank().rate("USD", "USD"));
    }
}
