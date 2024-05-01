package EquipeSoccer;

public class MatchFinale {
    private Equipe equipe1;
    private Equipe equipe2;
    private Equipe vainqueur;

    public MatchFinale(Equipe equipe1, Equipe equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public Equipe jouer() {
        Equipe vainqueur = null;
        while (vainqueur == null) {
            int butsEquipe1 = (int) (Math.random() * 5);
            int butsEquipe2 = (int) (Math.random() * 5);
            if (butsEquipe1 > butsEquipe2) {
                vainqueur = equipe1;
            } else if (butsEquipe1 < butsEquipe2) {
                vainqueur = equipe2;
            }
            // Si le match est nul, la boucle continue jusqu'à ce qu'il y ait un vainqueur
        }
        return vainqueur;
    }

}