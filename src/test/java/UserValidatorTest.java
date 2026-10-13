import org.example.UserValidator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserValidatorTest {

    private final UserValidator validator = new UserValidator();

    @Test
    void properEmailDoesNotThrowException() {
        assertThatCode(() -> validator.validateEmail("user@example.com"))
                .doesNotThrowAnyException();
    }

    @Test
    void emailWithoutAtThrowsIllegalArgumentException() {
        assertThatThrownBy(() -> validator.validateEmail("userexample.com"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void emptyEmailThrowsIllegalArgumentException() {
        assertThatThrownBy(() -> validator.validateEmail(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void nullThrowsNullPointerException() {
        assertThatThrownBy(() -> validator.validateEmail(null))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void errorMessageTest() {
        assertThatThrownBy(() -> validator.validateEmail(""))
                .hasMessage("Email cannot be empty");
    }
}