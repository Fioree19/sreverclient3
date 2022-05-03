import java.io.*;
import java.net.*;
import java.util.logging.*;
public class Server{
  private ServerSocket serverSocket;
  private Socket socket;

  private BufferedReader in;
  private BufferedWriter out;

  public Server(int porta){
    try{
      serversocket = new ServerSocket(porta);
      System.out.println("OK sono in ascolto");
    }catch (IOException ex){
      Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
      
      
    }
  }
public void start(){
  try{
    socket1 = serversocket.accept();
    out = new PrintWriter(socket.getInputStream());
    in = new Bufferedreader(new InputStream(socket.getInputStream())));
    System.out.println("in attesa");
  }catch (IOException ex){
    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
    
  }
} 
  public void write(Sting text){
    out.write(text, "/n");
    out.flush();
  }
  public String read(){
    try{
      return in.readline();
      }catch (IOException ex){
Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
      }
    return "";
    }
  public void close(){
    try{
      socket.close();
    }catch(IOException ex){     Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  }

