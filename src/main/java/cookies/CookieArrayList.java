package cookies;

import java.util.Arrays;

public class CookieArrayList{

    //    pseudocode

    //    variables needed:
//    Array of something;
//    The current amount of somethings;
    private Cookie[] cookies;
    private int currentSize;


    //    Constructor that creates an initial array of some size;
    public CookieArrayList(int size) {
        cookies = new Cookie[size];
    }

    //    Get method that returns the something of a given index;
    public Cookie getCookieAtIndex(int index) {
        for (int i = 0; i < currentSize; i++) {
            if (i == index) {
                return cookies[i];
            }
        }

        return null;
    }

    // Return index of cookie
    public int getIndexOfCookie(Cookie cookie) {
        for (int i = 0; i < currentSize; i++) {
            if (cookies[i] == cookie) {
                return i;
            }
        }

        // Returns -1 if cookie isn't in array
        return -1;
    }

    //    Add method
//    First, check that the arraylist will not break if we try to add at the next index:
//    IE, check if the current amount of somethings+1 is not greater that the array size
//    if it is greater:
//          Copy the elements of the current array to a new array.
//          set the pointer of the arrayList's internal array to the new array.
//    that adds things at an index that is currently unused
//    (this will be the current size)
    public void addCookie(Cookie cookie) {

        // Checks to see if current amount is not greater, if so resize
        if (currentSize + 1 > cookies.length) {
            Cookie[] newCookies = new Cookie[currentSize * 2];

            // Copy elements of current array to new array
            for (int i = 0; i < currentSize; i++) {
                newCookies[i] = cookies[i];
            }

            // Points to new array
            cookies = newCookies;

        }

        // add new cookie
        cookies[currentSize] = cookie;

        // increment count to reflect the amount of cookie in cookies array
        currentSize++;
    }

    // Remove the last cookie
    // ***Need to revisit implementation***
    // Sets the last element in the index to null instead of removing
    // Need to shift elements
    public void removeCookie() {
        for(int i = currentSize - 1; i < currentSize; i++) {
            cookies[i] = null;
        }

        // Decrement currentSize
        currentSize--;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String toString() {
        String string = "";

        for (int i = 0; i < currentSize; i++) {
            string += cookies[i] + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }

        return string;
    }

    public void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(cookies[i]);
        }
    }

    //**Need to print array in a array format without using Arrays**
    // Recreate Arrays.toString(cookies)



    // Day 3: Assignment

    //    a method that can return a boolean determining if your array list contains a certain item

    public boolean containsCookie(Cookie cookie) {
        for (int i = 0; i < currentSize; i++) {
            if (cookie == cookies[i]) {
                return true;
            }
        }

        return false;
    }


    //    (if you had an arraylist of objects, as opposed to primitives, you may need to implement and use .equals)
    //    a method that can determine if your arraylist is identical to another one
    //    (again, .equals)


    // Does objects in CookieArrayList1 equal objects in CookieArrayList2?
    // Does cal1.length need to equal cal2.length?
    public boolean compareCookie(CookieArrayList cookies2) {


        // Check to see if lengths are equal
        if (cookies2.currentSize == this.currentSize) {

            // Iterate through cookies2
            for (int i = 0; i < cookies2.currentSize; i++) {

                // if the cookie object in cookies2 at current index does not equal
                // cookie object in cookies at current index return false
                if (cookies2.getCookieAtIndex(i) != cookies[i]) {
                    return false;
                }
            }

            return true;
        }


        return false;
    }


    //    a method that sets a given index to a particular value
    public void setCookieAtIndex(int index, Cookie cookie) {
        cookies[index] = cookie;
    }
}


