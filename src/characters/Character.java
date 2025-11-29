package characters;

import exceptions.InvalidHealthException;

public abstract class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) throws InvalidHealthException {
        if (health < 0) {
            throw new InvalidHealthException("Health cannot be negative!");
        }
        this.name = name;
        this.health = health;
    }

    public abstract void attack();
}
