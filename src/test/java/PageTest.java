import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PageTest extends BaseTest {

    @Test
    public void testOpenSite() {
        Page page = new Page(driver);
        page.openHomePage();
        String actual = page.getEmailText();
        Assertions.assertEquals("market@panda.by", actual);
    }
}
