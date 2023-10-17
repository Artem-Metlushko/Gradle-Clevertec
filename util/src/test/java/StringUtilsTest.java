import org.junit.jupiter.api.Test;


class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertFalse(StringUtils.isPositiveNumber("123"));

    }
}