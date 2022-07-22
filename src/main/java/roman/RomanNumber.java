package roman;

public class RomanNumber {
    private final int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String getRoman() {
        return "I".repeat(Math.max(0, arabicNumber));
    }
}
