package test;

import com.ski.biathlons.ReadingResults;
import org.junit.Assert;
import org.junit.Test;


import java.io.FileNotFoundException;
import java.util.ArrayList;

/**Class that test the ReadingResults class*/

public class ReadingResultsTest {

    ArrayList<String> arrayAthlete = new ArrayList<String>();

    @Test
    public void readingResultsTest() throws FileNotFoundException {
        arrayAthlete = ReadingResults.readFromFile();
        Assert.assertEquals(3, arrayAthlete.size());
    }


}
