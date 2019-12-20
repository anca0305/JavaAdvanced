import org.junit.Assert;
import org.junit.Test;

public class NumbersCheckTest {
    @Test
    public void testThat246AreGood() {
        //pregatire ipoteze de test
        NumbersCheck numbersCheck = new NumbersCheck();
        boolean result = numbersCheck.verify(2,4,6);
        //verificare (pasul de verificare)
        Assert.assertEquals(result, true);
    }
    @Test
    public void testThat247AreNotGood() {
        //pregatire ipoteze de test
        NumbersCheck numbersCheck = new NumbersCheck();
        boolean result = numbersCheck.verify(2,4,7);
        //verificare (pasul de verificare)
        Assert.assertEquals(result, false);
    }
    @Test
    public void testThat594AreGood() {
        //pregatire ipoteze de test
        NumbersCheck numbersCheck = new NumbersCheck();
        boolean result = numbersCheck.verify(5,9,4);
        //verificare (pasul de verificare)
        Assert.assertEquals(result, true);
    }
}
