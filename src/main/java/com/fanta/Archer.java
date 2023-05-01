package com.fanta;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName()+ " стреляет в врага");
    }
}
