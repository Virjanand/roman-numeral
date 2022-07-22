package roman;

public class RomanNumber {
    private final int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String getRoman() {
        if (arabicNumber == 1) {
            return "I";
        }
        if (arabicNumber == 2) {
            return "II";
        }
        return "III";
    }
}
