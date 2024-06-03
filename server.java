import java.io. *;
import java.net. *;

public class server {
    public static void main(String[] args) {
        try (ServerSocket serv = new ServerSocket(12345)) {
            System.out.println("Serveru on port 12345");
            Socket socket = serv.accept();
            System.out.println("Client connect");

            InputStream input = socket.getInputStream();
            BufferedReader buff = new BufferedReader(new InputStreamReader((input)));

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            String text;
            do {
                text = buff.readLine();
                System.out.println("Clien: " + text);
                writer.println("Server: " + text);
            } while(!text.equals("bye"));
            socket.close();
        } catch (IOException ex) {
            System.out.println("Serever exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
