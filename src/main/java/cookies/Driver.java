package cookies;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Driver {

    private static final Logger logger = LogManager.getLogger(Driver.class);

    public static void main(String[] args) {
    /*
        // Basic log4j configurator
        logger.info("Hello world");
        logger.info("We are in logger info mode");
    */

        /*
        // Create CookieArrayList
        CookieArrayList cookies = new CookieArrayList(4);

        // Create cookie objects
        Cookie c1 = new Cookie("chocolate chip", 100);
        Cookie c2 = new Cookie("oatmeal", 100);
        Cookie c3 = new Cookie("butter", 100);
        Cookie c4 = new Cookie("strawberry", 100);
        Cookie c5 = new Cookie("gingersnap", 100);
        Cookie c6 = new Cookie("sugar", 100);
        Cookie c7 = new Cookie("peanut butter", 100);
        Cookie c8 = new Cookie("chocolate", 100);
        Cookie c9 = new Cookie("butterscotch", 100);

        // Test addCookie method
        // Add cookie objects to CookiesArrayList
        cookies.addCookie(c1);
        cookies.addCookie(c2);
        cookies.addCookie(c3);
        cookies.addCookie(c4);
        cookies.addCookie(c5);
        cookies.addCookie(c6);
        cookies.addCookie(c7);
        cookies.addCookie(c8);

        Cookie c11 = new Cookie("chocolate chip", 100);
        Cookie c12 = new Cookie("oatmeal", 100);
        Cookie c13 = new Cookie("butter", 100);
        Cookie c14 = new Cookie("strawberry", 100);
        Cookie c15 = new Cookie("gingersnap", 100);
        Cookie c16 = new Cookie("sugar", 100);
        Cookie c17 = new Cookie("peanut butter", 100);
        Cookie c18 = new Cookie("chocolate", 100);
        Cookie c19 = new Cookie("butterscotch", 100);

        // Create a second CookieArrayList and add cookie objects to CookieArrayList
        CookieArrayList cookies2 = new CookieArrayList(4);
        cookies2.addCookie(c1);
        cookies2.addCookie(c2);
        cookies2.addCookie(c3);
        cookies2.addCookie(c4);
        cookies2.addCookie(c5);
        cookies2.addCookie(c6);
        cookies2.addCookie(c7);
        cookies2.addCookie(c8);


        // Test getCookieAtIndex
        logger.info("Cookie at index 4: " + cookies.getCookieAtIndex(4));


        // Test getIndexOf method
        logger.info("Index of cookie c3: " + cookies.getIndexOfCookie(c3));

        // Test print method
        logger.info("Number of items in cookies: " + cookies.getCurrentSize());

        // Test contains method and returns boolean
        logger.info("Is cookie c4 in cookies: " + cookies.containsCookie(c4));
        logger.info("Is cookie c9 in cookies: " + cookies.containsCookie(c9));

        // Test compareArrayList method
        logger.info("\nCookieArrayList cookies: " + cookies.toString());
        logger.info("CookieArrayList cookies2: " + cookies2.toString());
        logger.info("Does cookies equal cookies2: ");
        logger.info(cookies.compareCookie(cookies2));



        // Print CookieArrayList cookies
        logger.info("\nArray of cookies:");
        logger.info(cookies.toString());

        // Test setCookieAtIndex method and print
        logger.info("\nUpdated array of cookies:");
        cookies.setCookieAtIndex(7, c9);
        logger.info(cookies.toString());

        // Test compareArrayList method
        logger.info("\nCookieArrayList cookies: " + cookies.toString());
        logger.info("CookieArrayList cookies2: " + cookies2.toString());
        logger.info("Does cookies equal cookies2: ");
        logger.info(cookies.compareCookie(cookies2));
        */


        // Test generic ArrayList class
        GenericArrayList<String> numbers = new GenericArrayList<String>();
        numbers.add("hi");
        System.out.println(numbers.toString());
        System.out.println(numbers.get(0));




    }
}
