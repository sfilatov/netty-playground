public class Main {
    public static void main(String[] args) throws InterruptedException {
        Server server = new Server(4444);
        // server.run(new DiscardServerHandler());
        // server.run(new EchoServerHandler());
        server.run(new TimerServerHandler());
    }
}
