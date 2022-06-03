public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void bigFreeze(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " counter attack " + enemyCharacter.characterName
                + " with Big Freeze (Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void holdofRib(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " tried to hold " + enemyCharacter.characterName
                + " with Hold of Rib (Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void thousandboneLance(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName
                + " with swarming Thousand Bone Lance (Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);
    }

    public void realitySlash(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " slashed " + enemyCharacter.characterName
                + " with Reality Slash (Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);
    }

    public void brilliantRadiance(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " tries to blind " + enemyCharacter.characterName
                + " with Brilliant Radiance(Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);
    }
}
