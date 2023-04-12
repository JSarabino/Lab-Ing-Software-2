package proxy;

import java.util.HashSet;
import java.util.Set;

public class InternetProxy implements Internet {
    private Internet internet;
    private Set<String> blockedSites;

    public InternetProxy() {
        internet = new RealInternet();
        blockedSites = new HashSet<>();
        blockedSites.add("facebook.com");
        blockedSites.add("twitter.com");
    }

    public void connectTo(String serverHost) throws Exception {
        if (blockedSites.contains(serverHost)) {
            throw new Exception("Access Denied to " + serverHost);
        }

        internet.connectTo(serverHost);
    }
}
