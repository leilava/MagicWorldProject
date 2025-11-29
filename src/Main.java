import characters.Character;
import characters.Wizard;
import characters.Warrior;
import characters.Elf;
import exceptions.InvalidHealthException;
import interfaces.CanCastSpell;

public class Main {
    public static void main(String[] args) {

        try {
            Character wizard = new Wizard("Gandalf", 100);
            Character warrior = new Warrior("Conan", 150);
            Character elf = new Elf("Legolas", 80);

            Character[] characters = {wizard, warrior, elf};

            for (Character c : characters) {
                c.attack();

                if (c instanceof CanCastSpell) {
                    ((CanCastSpell) c).castSpell();
                }

                System.out.println("----------------");
            }

            // Пример исключения
            Character ghost = new Warrior("Undead", -10);

        } catch (InvalidHealthException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
