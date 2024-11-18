package piece;

import main.Jeu;


public class Reine extends Piece 
{
    public Reine(int couleur, int colonne, int ligne)
    {
        super(couleur, colonne, ligne);
        if (couleur == Jeu.BLANC)
        {
            image = trouveImage("/ressources/w_Queen");
        }
        else image = trouveImage("/ressources/b_Queen");
    }
    
    
}
