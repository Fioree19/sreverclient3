public class MainServer{
  Server srv = new Server(2000);
  srv.inAscolto();
  srv.scrivi("Ciao Client");
}