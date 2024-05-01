package EquipeSoccer;

public class MatchDemiFinale {
    private Equipe equipe1;
    private Equipe equipe2;
    private Equipe vainqueur;

    public MatchDemiFinale(Equipe equipe1, Equipe equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public void jouer() {
        int butsEquipe1 = (int) (Math.random() * 5);
        int butsEquipe2 = (int) (Math.random() * 5);
        if (butsEquipe1 > butsEquipe2) {
            vainqueur = equipe1;
        } else if (butsEquipe1 < butsEquipe2) {
            vainqueur = equipe2;
        } else {
            vainqueur = null; // Match nul, à rejouer
        }
    }

    public Equipe getVainqueur() {
        return vainqueur;
    }

    public void afficherResultats() {
        System.out.println("Résultats de la demi-finale :");
        System.out.println(equipe1.getNomEquipe() + " vs " + equipe2.getNomEquipe());
        if (vainqueur != null) {
            System.out.println("Vainqueur : " + vainqueur.getNomEquipe());
        } else {
            System.out.println("Match nul, à rejouer");
        }
        System.out.println();
    }
}