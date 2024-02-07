import java.io.*;
import java.net.*;
class EchoServer {

public static void main(String[] args) {
try {
ServerSocket server = new ServerSocket(9999);
while (true) {
Socket client = server.accept();
BufferedReader r = new BufferedReader(new InputStreamReader(client.getInputStream()));
PrintWriter w = new PrintWriter(client.getOutputStream(), true);
w.println("Welcome to the Java EchoServer. Type 'bye' to close.");
String line;
do {
line = r.readLine();
if (line != null)
w.println("Got: " + line);
System.out.println(line);
}
while (!line.trim().equals("bye"));
client.close();
}
}
catch (Exception err) {
System.err.println(err);
}
}

}
