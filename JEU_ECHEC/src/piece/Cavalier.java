package piece;

import main.Jeu;


public class Cavalier extends Piece 
{
    public Cavalier(int couleur, int colonne, int ligne)
    {
        super(couleur, colonne, ligne);
        if (couleur == Jeu.BLANC)
        {
            image = trouveImage("/ressources/w_Knight");
        }
        else image = trouveImage("/ressources/b_Knight");
    }
    
    
}
