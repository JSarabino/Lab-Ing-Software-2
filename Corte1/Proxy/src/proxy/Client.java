package proxy;

public class Client {

    public static void main(String[] args) throws Exception {
        Internet internet = new InternetProxy();

        internet.connectTo("google.com");
        internet.connectTo("facebook.com"); // Access denied
        internet.connectTo("twitter.com"); // Access denied
    }
    
}
