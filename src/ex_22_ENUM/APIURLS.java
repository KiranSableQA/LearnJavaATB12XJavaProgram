package ex_22_ENUM;

public class APIURLS {
    public static APIURLS katalon;
//    katalon("https://katalon.com"),
//    google("https://google.com");

    private String url;

    APIURLS(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
