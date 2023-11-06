public class Adventure {

    public static void main(String[] args) {
        Knight knight = new Knight();
        Barbarian barbarian = new Barbarian();
        Ranger ranger = new Ranger();
        Rogue rogue = new Rogue();
        Cleric cleric = new Cleric();
        Wizard wizard = new Wizard();

        System.out.println(knight);
        knight.wearArmor();
        knight.useWeapon();
        knight.hasManeuvers();
        System.out.println("\n");

        System.out.println(barbarian);
        barbarian.wearArmor();
        barbarian.useWeapon();
        barbarian.tendsToRage();
        System.out.println("\n");

        System.out.println(ranger);
        ranger.wearArmor();
        ranger.useWeapon();
        ranger.sneaksAround();
        ranger.willToSurvive();
        System.out.println("\n");

        System.out.println(rogue);
        rogue.wearArmor();
        rogue.useWeapon();
        rogue.sneaksAround();
        rogue.picksLock();
        System.out.println("\n");

        System.out.println(cleric);
        cleric.wearArmor();
        cleric.useWeapon();
        cleric.castsSpell();
        cleric.healsOthers();
        System.out.println("\n");

        System.out.println(wizard);
        wizard.wearArmor();
        wizard.useWeapon();
        wizard.castsSpell();
        wizard.solvesProblems();
        System.out.println("\n");
    }
}