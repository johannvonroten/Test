/**
 * @author {"Johann von Roten"}
 * @Date 20.03.2023
 */
public class BlackMage extends Mage{
    int darkPower;
    String destructionSpell;

    public BlackMage(int darkPower, String destructionSpell, String spell, int intelligence, int strength, int agility, int health, int mana, int level,
                     int experience, String language, String name, String weapon, String race, String classe ) {
        super(spell, intelligence, strength, agility, health, mana, level, experience, language, name, weapon, race, classe);
        this.darkPower = darkPower;
        this.destructionSpell = destructionSpell;
    }
}
