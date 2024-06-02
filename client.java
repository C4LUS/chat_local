import java.io. *;
import java.net. *;

public class client {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(hostname, port)) {
            
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            InputStream input = socket.getInputStream();
            BufferedReader buff = new BufferedReader(new InputStreamReader((input)));

            BufferedReader consoleReader = new BufferedReader(new  InputStreamReader(System.in));
            String userInput;

            do {
                userInput = consoleReader.readLine();
                writer.println(userInput);
                String responde = buff.readLine();
                System.out.println(responde);
            } while (!userInput.equals("bye"));
            socket.close();
        } catch (UnknownHostException ex) {
            System.out.println("Server not found:" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}