import EquipeSoccer.*;

import java.util.Date;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Main {
    public static void main(String[] args) {

        Gardien gardien = new Gardien("Ponce","Donovan","1991-10-15",250000);
        Equipe equipe = new Equipe();
        Attaquant attaquant1 = new Attaquant("Dorcenna","Wesky","1991-12-30",300000);

        equipe.AjouterJoueur(gardien);
        equipe.AjouterJoueur(attaquant1);
        System.out.println(equipe);



    }

}
