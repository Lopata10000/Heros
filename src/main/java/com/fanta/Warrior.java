package com.fanta;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(){
        System.out.println(getName() + " дубашит в врага");
    }
}
