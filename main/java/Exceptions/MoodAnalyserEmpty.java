package Exceptions;

public class MoodAnalyserEmpty {
    private String massage;

    public MoodAnalyserEmpty(String massage) {
        this.massage = massage;
    }

    // If Message is Empty.
    public String analyseMoodempty(Object o) throws MoodAnalyserExceptionEmpty {
        try {
            if (massage.length() == 0)
                throw new MoodAnalyserExceptionEmpty(MoodAnalyserExceptionEmpty.ExceptionType.ENTERED_EMPTY,"Please enter Proper Value");
            if (massage.contains("SAD"))
                return "SAD";
            else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalyserExceptionEmpty(MoodAnalyserExceptionEmpty.ExceptionType.ENTERED_NULL,"Please Enter Proper Message");
        }
    }
}
