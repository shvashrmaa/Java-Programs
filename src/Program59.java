import java.io.*;
import java.net.*;

class Server1 {
    public static void main(String[] args) {
        // Check if the user provided a port number as a command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java Server <port-number>");
            return;
        }

        // Parse the port number from the command-line argument
        int port = Integer.parseInt(args[0]);

        try {
            // Create a server socket to listen for connections on the specified port
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is waiting for a client connection on port " + port + "...");

            // Accept the client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Set up input and output streams for communication with the client
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read the greeting message from the client
            String clientMessage = input.readLine();
            System.out.println("Received from client: " + clientMessage);

            // Send a response back to the client
            output.println("Hello, client! Greeting received.");

            // Close the input/output streams and the client socket
            input.close();
            output.close();
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class Client1 {
    public static void main(String[] args) {
        // Check if the user provided a port number and server address
        if (args.length != 2) {
            System.out.println("Usage: java Client <server-address> <port-number>");
            return;
        }

        String serverAddress = args[0];
        int port = Integer.parseInt(args[1]);

        try {
            // Connect to the server
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to server.");

            // Set up input and output streams for communication with the server
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Send a greeting message to the server
            output.println("Hello, server! This is the client.");

            // Read the server's response
            String serverMessage = input.readLine();
            System.out.println("Received from server: " + serverMessage);

            // Close the input/output streams and the socket
            input.close();
            output.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

