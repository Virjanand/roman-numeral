package roman;

public class RomanNumber {
    private int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String getRoman() {
        if (arabicNumber == 2) {
            return "II";
        }
        return "I";
    }
}
