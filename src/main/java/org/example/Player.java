package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkAndSetHealth(healthPercentage);  // 'checkAndSetHealt' yerine 'checkAndSetHealth' olarak düzeltilmiştir.
        this.weapon = weapon;
    }

    private void checkAndSetHealth(int healthPercentage) {
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        }
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }

    public int healthRemaining() {  // Bu metodun ismi 'healthRemaining' olarak düzeltilmiştir.
        return this.healthPercentage;
    }

    public void loseHealth(int damage) {  // 'loseHealt' yerine 'loseHealth' olarak düzeltilmiştir.
        int healthRemain = healthPercentage - damage;
        if (healthRemain <= 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        healthPercentage = healthRemain;
        checkAndSetHealth(healthPercentage);  // 'checkAndSetHealt' yerine 'checkAndSetHealth' olarak düzeltilmiştir.
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void restoreHealth(int healthPotion) {  // 'restoreHealt' yerine 'restoreHealth' olarak düzeltilmiştir.
        this.healthPercentage += healthPotion;
        checkAndSetHealth(this.healthPercentage);  // 'checkAndSetHealt' yerine 'checkAndSetHealth' olarak düzeltilmiştir.
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
