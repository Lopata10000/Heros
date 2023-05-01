package com.fanta;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " кастует в врага" );
    }
}
