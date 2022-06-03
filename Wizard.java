public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void superNova(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " first attack to " + enemyCharacter.characterName
                + " is Super Nova (Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void gravityMaelstrom(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Gravity Maelstrom ( (Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void astralSmite(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " tries to dissimate " + enemyCharacter.characterName
                + " with Astral Smite(Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void purifyingLance(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " purifies " + enemyCharacter.characterName
                + " with Purifying Lance (Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void cureWounds(Character characterName) {
        System.out.println("\n" + super.characterName + " tries to heal with Cure Wounds (Health + 50 and Mana + 50)");
        int healPoints = 50;
        int manahealPoints = 50;
        healTarget(characterName, healPoints);
        manahealTarget(characterName, manahealPoints);
    }

    public void sharkCyclone(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " summons to " + enemyCharacter.characterName
                + " a Shark Cyclone (Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);
    }

    public void trueDark(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + " attacks his remaing power to " + enemyCharacter.characterName
                + " with True Dark(Damage - 50 , Mana Cost - 80)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }

}
