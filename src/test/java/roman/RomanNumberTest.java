package roman;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumberTest {

    @Test
    void convert1ToI() {

        RomanNumber romanNumber = new RomanNumber(1);
        assertThat(romanNumber.getRoman()).isEqualTo("I");
    }
}