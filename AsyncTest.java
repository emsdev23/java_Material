// class Sample {
//     public static void main(String[] args) {
//         int num;
//         char result;
//         num=30;
//         if(num%2!=0){
//             result='N';
//             System.out.println("Number is odd");
//         }
//         else{
//             result='Y';
//             System.out.println("Number is even");
//         }

//         System.out.println("Try programiz.pro");
//         System.out.println(num);
//         System.out.println(result);
//     }
// }





import java.net.URI;
import java.net.http.*;
import java.util.concurrent.*;

public class AsyncTest {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(() -> {
            System.out.println("Timer finished (30s)");
        }, 30, TimeUnit.SECONDS);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(body -> {
                    System.out.println("API response received");
                });

        System.out.println("Program continues...");

    }
}