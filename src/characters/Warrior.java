package characters;

import exceptions.InvalidHealthException;

public class Warrior extends Character {

    public Warrior(String name, int health) throws InvalidHealthException {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with a sword.");
    }
}
