import EquipeSoccer.*;

import java.util.Date;
/**
 *<h1> TP1 h24-103-2803</h1>
 *
 *
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Main {
    public static void main(String[] args) {

    CreateTeams();



    }



    public static void CreateTeams()
    {
/**
 *
 * <h2> Creation des equipes </h2>
 */
        Equipe equipe1 = new Equipe(30000000, "Real Madrid");
        Equipe equipe2 = new Equipe(32000000, "Manchester United");
        Equipe equipe3 = new Equipe(34000000, "FC Barcelona");
        Equipe equipe4 = new Equipe(35000000, "Paris Saint-Germain");
        Equipe equipe5 = new Equipe(37000000, "Liverpool FC");
        Equipe equipe6 = new Equipe(40000000, "Juventus FC");
        Equipe equipe7 = new Equipe(42000000, "Bayern Munich");
        Equipe equipe8 = new Equipe(45000000, "Manchester City");

        // Création des attaquants pour toutes les équipes
        Attaquant attaquant1 = new Attaquant("Dorcenna", "Wesky", "1991-12-30", 300000);
        Attaquant attaquant2 = new Attaquant("Messi", "Lionel", "1987-06-24", 300000);
        Attaquant attaquant3 = new Attaquant("Ronaldo", "Cristiano", "1985-02-05", 300000);
        Attaquant attaquant4 = new Attaquant("Neymar", "Jr", "1992-02-05", 300000);

        // Création des gardiens pour toutes les équipes
        Gardien gardien1 = new Gardien("Buffon", "Gianluigi", "1978-01-28", 250000);
        Gardien gardien2 = new Gardien("Neuer", "Manuel", "1986-03-27", 250000);

        Gardien gardien3 = new Gardien("Courtois", "Thibaut", "1992-05-11", 250000);
        Gardien gardien4 = new Gardien("Alisson", "Becker", "1992-10-02", 250000);

        Gardien gardien5 = new Gardien("Ederson", "Santana", "1993-08-17", 250000);
        Gardien gardien6 = new Gardien("Oblak", "Jan", "1993-01-07", 250000);

        Gardien gardien7 = new Gardien("Ter Stegen", "Marc-Andre", "1992-04-30", 250000);
        Gardien gardien8 = new Gardien("Lloris", "Hugo", "1986-12-26", 250000);

        // Création des défenseurs pour toutes les équipes
        Defense defenseur1 = new Defense("Ramos", "Sergio", "1986-03-30", 200000);
        Defense defenseur2 = new Defense("Varane", "Raphael", "1993-04-25", 200000);
        Defense defenseur3 = new Defense("Pique", "Gerard", "1987-02-02", 200000);
        Defense defenseur4 = new Defense("Silva", "Thiago", "1984-09-22", 200000);
        Defense defenseur5 = new Defense("Marcelo", "Vieira", "1988-05-12", 200000);

        Defense defenseur6 = new Defense("Alba", "Jordi", "1989-03-21", 200000);
        Defense defenseur7 = new Defense("Arnold", "Trent Alexander", "1998-10-07", 200000);
        Defense defenseur8 = new Defense("Robertson", "Andrew", "1994-03-11", 200000);
        Defense defenseur9 = new Defense("Maguire", "Harry", "1993-03-05", 200000);
        Defense defenseur10 = new Defense("Laporte", "Aymeric", "1994-05-27", 200000);


// Ajout de quatre attaquants à chaque équipe
        equipe1.AjouterJoueur(attaquant1);
        equipe1.AjouterJoueur(attaquant2);
        equipe1.AjouterJoueur(attaquant3);
        equipe1.AjouterJoueur(attaquant4);

        equipe2.AjouterJoueur(attaquant1);
        equipe2.AjouterJoueur(attaquant2);
        equipe2.AjouterJoueur(attaquant3);
        equipe2.AjouterJoueur(attaquant4);

        equipe3.AjouterJoueur(attaquant1);
        equipe3.AjouterJoueur(attaquant2);
        equipe3.AjouterJoueur(attaquant3);
        equipe3.AjouterJoueur(attaquant4);

        equipe4.AjouterJoueur(attaquant1);
        equipe4.AjouterJoueur(attaquant2);
        equipe4.AjouterJoueur(attaquant3);
        equipe4.AjouterJoueur(attaquant4);

        equipe5.AjouterJoueur(attaquant1);
        equipe5.AjouterJoueur(attaquant2);
        equipe5.AjouterJoueur(attaquant3);
        equipe5.AjouterJoueur(attaquant4);

        equipe6.AjouterJoueur(attaquant1);
        equipe6.AjouterJoueur(attaquant2);
        equipe6.AjouterJoueur(attaquant3);
        equipe6.AjouterJoueur(attaquant4);

        equipe7.AjouterJoueur(attaquant1);
        equipe7.AjouterJoueur(attaquant2);
        equipe7.AjouterJoueur(attaquant3);
        equipe7.AjouterJoueur(attaquant4);

        equipe8.AjouterJoueur(attaquant1);
        equipe8.AjouterJoueur(attaquant2);
        equipe8.AjouterJoueur(attaquant3);
        equipe8.AjouterJoueur(attaquant4);





// Ajout de deux gardiens à chaque équipe
        equipe1.AjouterJoueur(gardien1);
        equipe1.AjouterJoueur(gardien2);

        equipe2.AjouterJoueur(gardien3);
        equipe2.AjouterJoueur(gardien4);

        equipe3.AjouterJoueur(gardien5);
        equipe3.AjouterJoueur(gardien6);

        equipe4.AjouterJoueur(gardien7);
        equipe4.AjouterJoueur(gardien8);

        equipe5.AjouterJoueur(gardien1);
        equipe5.AjouterJoueur(gardien2);

        equipe6.AjouterJoueur(gardien3);
        equipe6.AjouterJoueur(gardien4);

        equipe7.AjouterJoueur(gardien5);
        equipe7.AjouterJoueur(gardien6);

        equipe8.AjouterJoueur(gardien7);
        equipe8.AjouterJoueur(gardien8);





// Ajout de cinq défenseurs à chaque équipe
        equipe1.AjouterJoueur(defenseur1);
        equipe1.AjouterJoueur(defenseur2);
        equipe1.AjouterJoueur(defenseur3);
        equipe1.AjouterJoueur(defenseur4);
        equipe1.AjouterJoueur(defenseur5);

        equipe2.AjouterJoueur(defenseur6);
        equipe2.AjouterJoueur(defenseur7);
        equipe2.AjouterJoueur(defenseur8);
        equipe2.AjouterJoueur(defenseur9);
        equipe2.AjouterJoueur(defenseur10);

        equipe3.AjouterJoueur(defenseur1);
        equipe3.AjouterJoueur(defenseur2);
        equipe3.AjouterJoueur(defenseur3);
        equipe3.AjouterJoueur(defenseur4);
        equipe3.AjouterJoueur(defenseur5);

        equipe4.AjouterJoueur(defenseur6);
        equipe4.AjouterJoueur(defenseur7);
        equipe4.AjouterJoueur(defenseur8);
        equipe4.AjouterJoueur(defenseur9);
        equipe4.AjouterJoueur(defenseur10);

        equipe5.AjouterJoueur(defenseur1);
        equipe5.AjouterJoueur(defenseur2);
        equipe5.AjouterJoueur(defenseur3);
        equipe5.AjouterJoueur(defenseur4);
        equipe5.AjouterJoueur(defenseur5);

        equipe6.AjouterJoueur(defenseur6);
        equipe6.AjouterJoueur(defenseur7);
        equipe6.AjouterJoueur(defenseur8);
        equipe6.AjouterJoueur(defenseur9);
        equipe6.AjouterJoueur(defenseur10);

        equipe7.AjouterJoueur(defenseur1);
        equipe7.AjouterJoueur(defenseur2);
        equipe7.AjouterJoueur(defenseur3);
        equipe7.AjouterJoueur(defenseur4);
        equipe7.AjouterJoueur(defenseur5);

        equipe8.AjouterJoueur(defenseur6);
        equipe8.AjouterJoueur(defenseur7);
        equipe8.AjouterJoueur(defenseur8);
        equipe8.AjouterJoueur(defenseur9);
        equipe8.AjouterJoueur(defenseur10);


    }






/**
 *  //DONE Doit Avoir
 *
 *     // Classe de base pour un joueur avec les attributs : nom, prénom, date de naissance, salaire : DONE
 *     // Classes dérivées de la classe de base pour les rôles spécifiques (gardien, défense, attaque, Entraîneur) incluant des attributs supplémentaires tels que le nonmbre de match  et les points respectifs de chaque rôle (Nb but, Nb Arret etc). DONE
 *      //DONE création d'équipes avec un budget maximal pour l'embauche des joueurs. DONE
 *     // Fonctions pour ajouter, déplacer, afficher, insérer et supprimer des joueurs tout en respectant le budget de l'équipe. DONE
 *     // Avoir un maximum de Goaler DONE
 *     // Joueur le match
 *
 *
 */






    //TODO
    // Méthodes pour afficher, insérer et supprimer une équipe dans un tournois
    // Affichage des résultats des tournois./
    // Decoupage du main en fonction


    /**
     * Deboggage (break point + bug)
     */

}
