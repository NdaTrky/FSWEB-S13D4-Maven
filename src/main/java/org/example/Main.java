package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());

        // Player nesnelerinin oluşturulması sırasında parametrelerin doğru şekilde geçirilmesi gerekiyor
        Player player = new Player("nida", 100, Weapon.AXE);  // 'name: "emrah"' yerine 'name, healthPercentage, weapon' doğru şekilde geçildi.
        System.out.println("healthremaining: " + player.healthRemaining());

        Player player2 = new Player("semih", 90, Weapon.SWORD);  // Aynı şekilde burada da parametreler doğru şekilde geçildi.
        System.out.println("healthremaining: " + player2.healthRemaining());

        player.loseHealth((int) (player2.getWeapon().getDamage() * player2.getWeapon().getAttackSpeed()));
        System.out.println("healthremaining after damage: " + player.healthRemaining());

        player.restoreHealth(78);  // 'healthPotion: 78' yerine doğrudan '78' yazılmalı
        System.out.println("healthremaining after restore: " + player.healthRemaining());
    }
}
