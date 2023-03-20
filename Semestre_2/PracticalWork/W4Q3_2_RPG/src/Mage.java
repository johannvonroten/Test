/**
 * @author {"Johann von Roten"}
 * @Date 20.03.2023
 */
public class Mage extends Human {
    int intelligence;
    String spell;
    public Mage(String spell, int intelligence, int strength, int agility, int health, int mana, int level,
                int experience, String language, String name, String weapon, String race, String classe) {
        super(strength,  agility,  health,  mana,  level,  experience,  language,  name,  weapon,  race,  classe);
        this.intelligence = intelligence;
        this.spell = spell;
    }
}
