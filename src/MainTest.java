import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    @Test
    void stampaData() {
        String result = testing.stampaData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("01 marzo 2023", result);
    }
}