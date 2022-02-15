package cookies;

public class FakeCookieException extends Exception {

    public FakeCookieException(String errorMessage, Throwable err) {
        super(errorMessage);
    }

}
