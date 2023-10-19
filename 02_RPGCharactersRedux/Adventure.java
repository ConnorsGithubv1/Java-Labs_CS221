// import java.util.Random;

public class Adventure {
    public static void main(String[] args) {

        /* creates array for for loop */
        Character[] partyMembers = new Character[4];

        /* creates new characters and set params*/
        partyMembers[0] = new Knight(17,17,new SwordBehavior());
        partyMembers[1] = new Barbarian(21,13,new AxeBehavior());
        partyMembers[2] = new Ranger(13,15,new BowAndArrow());
        partyMembers[3] = new Wizard(9,10,new MagicStaffBehavior());
        

        /* 1 / 2 gameloop */
         for (Character party: partyMembers){
            System.out.println(party);
            party.fight();
            System.out.println();
         }

         /* scenario 1 */
         System.out.println("the dragon attacks \n");
         partyMembers[0].setWeapon(new NoneBehavior());
         partyMembers[1].takeDamage(100);
         partyMembers[2].takeDamage(50);

         /* 2 / 2 gameloop */
         for(Character party: partyMembers){
            System.out.println(party);
            party.fight();
            System.out.println();
         }
    }
}
