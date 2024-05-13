import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CheckGithub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the GitHub user you want to check:");
        String username = scanner.nextLine();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(String.format("http://api.github.com/users/%s", username)))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404) {
                throw new ErrorCheckGithubException("User not found in GitHub.");
            }

            String json = response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e) {
            System.out.println("Opss... Error while checking the GitHub API.");
            e.printStackTrace();
        } catch (ErrorCheckGithubException e) {
            System.out.println(e.getMessage());
        }
    }
}
