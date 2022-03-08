package Exceptions;

public class MoodAnalyserExceptionEmpty extends  Exception{
    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY
    }
    ExceptionType type;

    public MoodAnalyserExceptionEmpty(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
