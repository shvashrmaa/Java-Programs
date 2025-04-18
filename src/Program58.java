import java.io.*;
import java.net.*;

class Server {
    public static void main(String[] args) {
        try {
            // Create a server socket that listens on port 12345
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is waiting for client connection...");

            // Accept the client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Set up input and output streams for communication with the client
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read the greeting from the client
            String clientMessage = input.readLine();
            System.out.println("Received from client: " + clientMessage);

            // Send a response back to the client
            output.println("Hello, client! Greeting received.");

            // Close the streams and socket
            input.close();
            output.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Client {
    public static void main(String[] args) {
        try {
            // Connect to the server running on localhost and port 12345
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to server.");

            // Set up input and output streams for communication with the server
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Send a greeting message to the server
            output.println("Hello, server! This is the client.");

            // Read the server's response
            String serverMessage = input.readLine();
            System.out.println("Received from server: " + serverMessage);

            // Close the streams and socket
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


