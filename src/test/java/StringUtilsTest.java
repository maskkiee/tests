import org.example.StringUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {

    private final StringUtils utils = new StringUtils();

    @Test
    void palindromeKajakReturnsTrue() {
        assertThat(utils.isPalindrome("kajak")).isTrue();
    }

    @Test
    void palindromeKajakWithCapitalLetterReturnsTrue() {
        assertThat(utils.isPalindrome("Kajak")).isTrue();
    }

    @Test
    void notPalindromeJavaReturnsFalse() {
        assertThat(utils.isPalindrome("java")).isFalse();
    }

    @Test
    void emptyStringIsPalindrome() {
        assertThat(utils.isPalindrome("")).isTrue();
    }

    @Test
    void nullIsPalindromem() {
        assertThat(utils.isPalindrome(null)).isTrue();
    }
}