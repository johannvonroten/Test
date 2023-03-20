/**
 * @author {"Johann von Roten"}
 * @Date 20.03.2023
 */
public class Human extends Creatures {
    int charisma, wisdom, dexterity, constitution;

    public Human (int strength, int agility, int health, int mana, int level, int experience, String language, String name, String weapon, String race, String classe) {
        super(strength, agility, health, mana, level, experience, language, name, weapon, race, classe);
        this.charisma = charisma;
        this.wisdom = wisdom;
        this.dexterity = dexterity;
        this.constitution = constitution;
    }
}
