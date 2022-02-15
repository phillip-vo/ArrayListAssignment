import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import cookies.Cookie;
import cookies.CookieArrayList;
import org.testng.annotations.BeforeClass;

/*
Import for JUni 4.13.2
import org.junit.Test;
*/

/*
Note: to avoid needing to reference Assert every time, we can use a static import org.junit.Assert.*;
statement to import all static members of the Assert class.
 */

/*
Used for JUnit 4.13.2
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
*/


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


class CookieArrayListTest {
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
    void ContainsOneAddedCookie() {
        CookieArrayList cookies1 = new CookieArrayList(1);
        Cookie c1 = new Cookie("chocolate chip", 100);
        cookies1.addCookie(c1);
        assertTrue((cookies1.containsCookie(c1)));
    }

    @Test
    void ContainsTwoAddedCookie() {
        CookieArrayList cookies1 = new CookieArrayList(2);
        Cookie c1 = new Cookie("chocolate chip", 100);
        Cookie c2 = new Cookie("gingersnaps", 100);
        cookies1.addCookie(c1);
        cookies1.addCookie(c2);
        assertTrue(cookies1.containsCookie(c1) && cookies1.containsCookie(c2));
    }

    @Test
    void DoesNotContainCookie() {
        CookieArrayList cookies1 = new CookieArrayList((3));
        Cookie c1 = new Cookie("chocolate chip", 100);
        Cookie c2 = new Cookie("oatmeal", 100);
        Cookie c3 = new Cookie("peanut butter", 100);
        cookies1.addCookie(c1);
        cookies1.addCookie(c2);
        assertTrue(!(cookies1.containsCookie(c3)));
    }

    @Test
    void CompareTwoCookieArrayListForTrue() {
        CookieArrayList cookies1 = new CookieArrayList(1);
        Cookie c1 = new Cookie("chocolate chip", 100);

        CookieArrayList cookies2 = new CookieArrayList(1);
        Cookie c2 = new Cookie("chocolate chip", 100);

        assertTrue(cookies1.compareCookie(cookies2));

    }

    @Test
    void CompareTwoCookieArrayListForFalse() {
        CookieArrayList cookies1 = new CookieArrayList(1);
        Cookie c1 = new Cookie("chocolate chip", 100);

        CookieArrayList cookies2 = new CookieArrayList(1);
        Cookie c2 = new Cookie("oatmeal", 100);

        assertFalse(!cookies1.compareCookie(cookies2));
    }


}
