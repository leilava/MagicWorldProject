package characters;

import exceptions.InvalidHealthException;
import interfaces.CanCastSpell;

public class Elf extends Character implements CanCastSpell {

    public Elf(String name, int health) throws InvalidHealthException {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with a bow.");
    }

    @Override
    public void castSpell() {
        System.out.println(name + " casts a healing spell!");
    }
}
