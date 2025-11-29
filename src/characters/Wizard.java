package characters;

import exceptions.InvalidHealthException;
import interfaces.CanCastSpell;

public class Wizard extends Character implements CanCastSpell {

    public Wizard(String name, int health) throws InvalidHealthException {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with a staff.");
    }

    @Override
    public void castSpell() {
        System.out.println(name + " casts a fireball!");
    }
}
