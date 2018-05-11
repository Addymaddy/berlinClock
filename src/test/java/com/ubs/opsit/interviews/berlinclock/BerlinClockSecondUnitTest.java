package com.ubs.opsit.interviews.berlinclock;


import org.junit.Assert;
import org.junit.Test;

public class BerlinClockSecondUnitTest {

    private BerlinClockSecond berlinClockSecond = new BerlinClockSecond();

    @Test
    public void testSecondRepresentationForEvenNumberOfSeconds(){
        int seconds= 2;
        String result = berlinClockSecond.getTimeRepresentation(seconds);
        Assert.assertEquals("Y", result);
    }

    @Test
    public void testSecondRepresentationForOddNumberOfSeconds(){
        int seconds = 1 ;
        String result = berlinClockSecond.getTimeRepresentation(seconds);
        Assert.assertEquals("O", result);
    }


    @Test
    public void testSecondRepresentationForZeroSeconds(){
        int seconds=0;
        String result = berlinClockSecond.getTimeRepresentation(seconds);
        Assert.assertEquals("Y", result);
    }


    //Add unit test for 59 seconds
    //Add unit Test case for 60 seconds

}

