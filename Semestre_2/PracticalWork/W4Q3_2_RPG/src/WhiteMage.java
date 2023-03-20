/**
 * @author {"Johann von Roten"}
 * @Date 20.03.2023
 */
public class WhiteMage extends Mage{
    int healPower;
    String healSpell;

    public WhiteMage (int healPower, String healSpell, String spell, int intelligence, int strength, int agility, int health, int mana, int level,
                       int experience, String language, String name, String weapon, String race, String classe ){
        super(spell,  intelligence, strength,  agility,  health,  mana,  level,  experience,  language,  name,  weapon,  race,  classe) ;
        this.healPower = healPower;
        this.healSpell = healSpell;

    }

}
