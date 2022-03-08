package Exceptions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTestCase {

    @Test
    public void giveNullMoodShouldReturnHappyWithoutTryCatch() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String analyse = moodAnalyser.analyseMood1();
        Assert.assertEquals("Happy",analyse);
    }

    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String analyse = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            analyse = moodAnalyser.analyseMood();
            Assert.assertEquals("Happy",analyse);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullMoodShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
        }
    }

    @Test
    public void givenNullMoodAnalyserEmptyThrowException() {
        MoodAnalyserEmpty moodAnalyserEmpty = new MoodAnalyserEmpty(null);
        try {
            moodAnalyserEmpty.analyseMoodempty(null);
        } catch (MoodAnalyserExceptionEmpty e){
            Assert.assertEquals(MoodAnalyserExceptionEmpty.ExceptionType.ENTERED_NULL,e.type);
        }
    }
}
