package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Iyok";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health= " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health= " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Iyok",120,"Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
