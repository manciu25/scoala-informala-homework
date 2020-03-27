package test;

import com.ski.biathlons.Util;
import org.junit.Assert;
import org.junit.Test;

/**Class that test the Util class*/
public class UtilTest {

    @Test
    public void utilShootingTest() {
        long number = Util.shooting("oodo");
        Assert.assertEquals(3, number);
    }
}
