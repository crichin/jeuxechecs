package piece;

import main.Jeu;


public class Tour extends Piece 
{
    public Tour(int couleur, int colonne, int ligne)
    {
        super(couleur, colonne, ligne);
        if (couleur == Jeu.BLANC)
        {
            image = trouveImage("/ressources/w_Rook");
        }
        else image = trouveImage("/ressources/b_Rook");
    }
    
    
}
