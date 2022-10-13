package kpijunit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeTest {
	@Test
	public void evaluateExpression() {
		Prime p = new Prime();
		boolean ans = p.isPrime(15);
		assertEquals(false, ans);
	}
}