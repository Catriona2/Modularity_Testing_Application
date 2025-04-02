import com.converter.CurrencyConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class CurrencyConverterTest {
    @Test
    void testUsdToEur() {
        assertEquals(85.0, CurrencyConverter.convert("USD", "EUR", 100.0), 0.01);
    }
}
