/**
 * @author {"Johann von Roten"}
 * @Date 20.03.2023
 */
public class NonHuman extends Creatures{
    int weight, height;
    String skinColor, hairColor, eyeColor;

    public NonHuman (int strength, int agility, int health, int mana, int level,
                     int experience, String language, String name, String weapon, String race, String classe,
                     int weight, int height, String skinColor, String hairColor, String eyeColor) {
        super(strength, agility, health, mana, level, experience, language, name, weapon, race, classe);
        this.weight = weight;
        this.height = height;
        this.skinColor = skinColor;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }
}
