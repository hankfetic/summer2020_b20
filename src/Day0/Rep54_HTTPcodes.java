package Day0;
import java.util.Scanner;
public class Rep54_HTTPcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int code = scan.nextInt();
        String status = "";
        switch (code){
            case 200:
                status = "OK";
                break;
            case 201:
                status = "Created";
                break;
            case 202:
                status = "Accepted";
                break;
            case 301:
                status = "Moved Permanently";
                break;
            case 303:
                status = "See Other";
                break;
            case 304:
                status = "Not Modified";
                break;
            case 307:
                status = "Temporary Redirect";
                break;
            case 400:
                status = "Bad Request";
                break;
            case 401:
                status = "Unauthorized";
                break;
            case 403:
                status = "Forbidden";
                break;
            case 404:
                status = "Not Found";
                break;
            case 410:
                status = "Gone";
                break;
            case 500:
                status = "Internal Server Error";
                break;
            case 503:
                status = "Service Unavailable";
                break;
            default:
                status = "Invalid status code!";
                break;
        }
        System.out.println(status);
    }
}
