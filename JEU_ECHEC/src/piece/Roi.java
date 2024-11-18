package piece;

import main.Jeu;


public class Roi extends Piece 
{
    public Roi(int couleur, int colonne, int ligne)
    {
        super(couleur, colonne, ligne);
        if (couleur == Jeu.BLANC)
        {
            image = trouveImage("/ressources/w_King");
        }
        else image = trouveImage("/ressources/b_King");
    }
    
    
}
