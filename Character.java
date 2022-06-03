public class Character {
    public String characterName = "Radagaz";
    public int level = 0;
    public int healthPoints = 300;
    public int manaPoints = 500;

    Character(String name){
        characterName = name;
    }


    public void damageTarget(Character enemyCharacter,int damagePoints){
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("\n Enemy character HP Left = " + enemyCharacter.healthPoints);

        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("\n" + enemyCharacter.characterName + "\n Lost and Defeated \n");
        }
    }

    public void manaTarget(Character enemyCharacter,int manaPoints){
        enemyCharacter.manaPoints -= manaPoints;
        System.out.println("\n Character MP Left = " + enemyCharacter.manaPoints);
    }


    public void levelTarget(Character enemyCharacter, int level){
        
        enemyCharater.level += 10;
        System.out.println(characterName + "\n Gained 10 level! ");
        System.out.println(characterName + "\n Level is " + enemyCharacter.level);
        enemyCharacter.level = level;
        System.out.println(enemyCharacter.characterName + "\n Level is = " + enemyCharacter.level);
    }

    public void healTarget(Character enemyCharacter, int healPoints) {

        enemyCharacter.healthPoints += healPoints;
        System.out.println(enemyCharacter.characterName + "\n HP Left = " + enemyCharacter.healthPoints);
    }

    public void manahealTarget(Character characterName, int manaPoints) {

        characterName.manaPoints += 50;
        System.out.println(characterName.characterName + " \n Mana Left = " + characterName.manaPoints);
    }
}
