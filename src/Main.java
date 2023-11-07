public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        
        System.out.println("Playing audio:");
        player.play();
        player.pause();
        player.play();
        player.stop();
        
        System.out.println("Recording audio:");
        player.record();
        player.pause();
        player.record();
        player.stop();
    }
}