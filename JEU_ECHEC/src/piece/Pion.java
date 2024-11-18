package piece;

import main.Jeu;


public class Pion extends Piece 
{
    public Pion(int couleur, int colonne, int ligne)
    {
        super(couleur, colonne, ligne);
        if (couleur == Jeu.BLANC)
        {
            image = trouveImage("/ressources/w_Pawn");
        }
        else image = trouveImage("/ressources/b_Pawn");
    }
    
    
}
