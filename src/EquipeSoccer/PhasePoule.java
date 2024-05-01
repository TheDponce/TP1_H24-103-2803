package EquipeSoccer;

public class PhasePoule {
    private String nom;
    private Equipe[] equipes;

    public PhasePoule(String nom, Equipe... equipes) {
        this.nom = nom;
        this.equipes = equipes;
    }

    public void jouerMatchs() {
        for (int i = 0; i < equipes.length; i++) {
            for (int j = i + 1; j < equipes.length; j++) {
                jouerMatch(equipes[i], equipes[j]);
            }
        }
    }

    private void jouerMatch(Equipe equipe1, Equipe equipe2) {
        int butsEquipe1 = (int) (Math.random() * 5);
        int butsEquipe2 = (int) (Math.random() * 5);
        equipe1.ajouterButsPour(butsEquipe1);
        equipe1.ajouterButsContre(butsEquipe2);
        equipe2.ajouterButsPour(butsEquipe2);
        equipe2.ajouterButsContre(butsEquipe1);
        if (butsEquipe1 > butsEquipe2) {
            equipe1.ajouterPoints(3);
        } else if (butsEquipe1 < butsEquipe2) {
            equipe2.ajouterPoints(3);
        } else {
            equipe1.ajouterPoints(1);
            equipe2.ajouterPoints(1);
        }
    }

    public Equipe getVainqueur() {
        Equipe vainqueur = null;
        int maxPoints = 0;
        for (Equipe equipe : equipes) {
            if (equipe.getPoints() > maxPoints) {
                vainqueur = equipe;
                maxPoints = equipe.getPoints();
            }
        }
        return vainqueur;
    }

    public Equipe getDeuxieme() {
        Equipe deuxieme = null;
        int deuxiemePlusPoints = 0;
        for (Equipe equipe : equipes) {
            if (equipe.getPoints() > deuxiemePlusPoints && equipe != getVainqueur()) {
                deuxieme = equipe;
                deuxiemePlusPoints = equipe.getPoints();
            }
        }
        return deuxieme;
    }

    public void afficherResultats() {
        System.out.println("Résultats de la " + nom + " :");
        for (Equipe equipe : equipes) {
            System.out.println(equipe.getNomEquipe() + ": " + equipe.getPoints() + " points, nombre de buts marqués: " + equipe.getButsPour() + "  - " + " nombre de buts encaissés: "+ equipe.getButsContre());
        }
        System.out.println("Première place: " + getVainqueur().getNomEquipe());
        System.out.println("Deuxième place: " + getDeuxieme().getNomEquipe());
        System.out.println();
    }
}
