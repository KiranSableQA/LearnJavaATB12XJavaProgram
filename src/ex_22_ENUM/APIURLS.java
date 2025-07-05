package ex_22_ENUM;

public enum APIURLS {
    katalon("https://katalon.com"),
    google("https://google.com");

    private final String url;

    APIURLS(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
