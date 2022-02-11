package cookies;

public class Driver {
    public static void main(String[] args) {

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
        System.out.println("Cookie at index 4: " + cookies.getCookieAtIndex(4));


        // Test getIndexOf method
        System.out.println("Index of cookie c3: " + cookies.getIndexOfCookie(c3));

        // Test print method
        System.out.println("Number of items in cookies: " + cookies.getCurrentSize());

        // Test contains method and returns boolean
        System.out.println("Is cookie c4 in cookies: " + cookies.containsCookie(c4));
        System.out.println("Is cookie c9 in cookies: " + cookies.containsCookie(c9));

        // Test compareArrayList method
        System.out.println("\nCookieArrayList cookies: " + cookies.toString());
        System.out.println("CookieArrayList cookies2: " + cookies2.toString());
        System.out.println("Does cookies equal cookies2: ");
        System.out.println(cookies.compareCookie(cookies2));



        // Print CookieArrayList cookies
        System.out.println("\nArray of cookies:");
        System.out.println(cookies.toString());

        // Test setCookieAtIndex method and print
        System.out.println("\nUpdated array of cookies:");
        cookies.setCookieAtIndex(7, c9);
        System.out.println(cookies.toString());

        // Test compareArrayList method
        System.out.println("\nCookieArrayList cookies: " + cookies.toString());
        System.out.println("CookieArrayList cookies2: " + cookies2.toString());
        System.out.println("Does cookies equal cookies2: ");
        System.out.println(cookies.compareCookie(cookies2));
    }
}
