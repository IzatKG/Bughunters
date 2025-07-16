import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
public class WireMockTest {

    private static WireMockServer wireMockServer;

    @BeforeAll
    public static void setup() {
        wireMockServer = new WireMockServer(
                options()
                        .port(8080)
                        .usingFilesUnderDirectory("src/test/resources/wiremock")
        ); // Запускаем WireMock на порту 8080
        wireMockServer.start();

        wireMockServer.stubFor(get(urlEqualTo("/api/users"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody("[{\"id\":1,\"name\":\"Alice\"}]")
                        .withStatus(200)));
    }

    @AfterAll
    public static void teardown() {
        wireMockServer.stop();
    }

    @Test
    public void testGetUsers() throws IOException {
        URL url = new URL("http://localhost:8080/api/users");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        assertEquals(200, responseCode);

        Scanner scanner = new Scanner(connection.getInputStream());
        StringBuilder response = new StringBuilder();
        while (scanner.hasNext()) {
            response.append(scanner.nextLine());
        }
        scanner.close();

        String expectedResponse = "[{\"id\":1,\"name\":\"Alice\"}]";
        assertEquals(expectedResponse, response.toString());
    }
}
