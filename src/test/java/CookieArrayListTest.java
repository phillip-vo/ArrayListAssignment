import org.junit.Assert;
import org.junit.Test;

import cookies.Cookie;
import cookies.CookieArrayList;

public class CookieArrayListTest {
    /*
    I would like you all to write some automated testing methods
    in junit
    using:
    @Test
    some form of assertion
    (assertTrue, assertEquals)

    As well as continuing to work on your Arraylist implementations
    (make them generic if you like, it might help you
    on your projects)
     */

    @Test
    public void ContainsOneAddedCookie() {
        CookieArrayList cookies1 = new CookieArrayList(1);
        Cookie c1 = new Cookie("chocolate chip", 100);
        cookies1.addCookie(c1);
        Assert.assertTrue((cookies1.containsCookie(c1)));
    }

    @Test
    public void ContainsTwoAddedCookie() {
        CookieArrayList cookies1 = new CookieArrayList(2);
        Cookie c1 = new Cookie("chocolate chip", 100);
        Cookie c2 = new Cookie("gingersnaps", 100);
        cookies1.addCookie(c1);
        cookies1.addCookie(c2);
        Assert.assertTrue(cookies1.containsCookie(c1) && cookies1.containsCookie(c2));
    }

    @Test
    public void DoesNotContainCookie() {
        CookieArrayList cookies1 = new CookieArrayList((3));
        Cookie c1 = new Cookie("chocolate chip", 100);
        Cookie c2 = new Cookie("oatmeal", 100);
        Cookie c3 = new Cookie("peanut butter", 100);
        cookies1.addCookie(c1);
        cookies1.addCookie(c2);
        Assert.assertTrue(!(cookies1.containsCookie(c3)));
    }

}
