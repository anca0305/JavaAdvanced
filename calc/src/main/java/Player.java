public class Player {

    String name;
    private static Player p;
    private Player() {

    }

    public static Player getInstance() {
        if(p == null) {
             p = new Player();
        }
        return p;
    }

    public void play() {
        System.out.println("playyy!!");
    }
}
