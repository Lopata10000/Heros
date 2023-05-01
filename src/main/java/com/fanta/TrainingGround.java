package com.fanta;

public class TrainingGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Робин");
        Hero mage = new Mage("Гендальф");
        Hero warrior = new Warrior("Викинг");

        attacEnemy(archer, mage, warrior);

    }
    public static void attacEnemy (Hero... heroes)
    {
        for (Hero hero : heroes) {
            hero.attackEnemy();
        }
    }
    
}