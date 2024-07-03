import java.net.*;
import java.util.List;

public class CookiesManager {
    
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
            URL url = new URL("https://httpbin.org/cookie/set/?name=Ram+Shrestha");

            CookieHandler cookieManager = new CookieManager();

            CookieHandler.setDefault(cookieManager);
            
            HttpCookie cookie1 = new HttpCookie("name", "Ram+Shrestha");

            ((CookieManager) cookieManager).getCookieStore().add(url.toURI(), cookie1);
        
            List<HttpCookie> cookies = ((CookieManager) cookieManager).getCookieStore().get(url.toURI());

            for (HttpCookie cookie : cookies)
            {
                System.out.println("Name:" + cookie.getName() + " "+ "value:" + cookie.getValue());
            }
    }
}
