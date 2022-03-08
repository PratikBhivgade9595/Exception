package Exceptions;

public class MoodAnalyser {
    private String massage;

    public MoodAnalyser(String massage) {
        this.massage = massage;
    }

    // Null pointer Exception Without throw.
    public String analyseMood1() {
        try {
            if (massage.contains("Sad"))
                return "SAD";
            else
                return "Happy";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }

    // Handling Null Point Exception with throw.
    public String analyseMood() throws MoodAnalyserException {
        try {
            if (massage.contains("SAD"))
                return "SAD";
            else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Please Enter Proper Message");
        }
    }
 /*
    // If Message is Empty.
    public String analyseMood2() throws MoodAnalyserException {
        try {
            if (massage.length() == 0)
                throw new MoodAnalyserException("Please enter Proper Value");
            if (massage.contains("SAD"))
                return "SAD";
            else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Please Enter Proper Message");
        }
    }*/
}
