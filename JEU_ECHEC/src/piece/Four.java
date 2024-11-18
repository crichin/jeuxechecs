package piece;

import main.Jeu;


public class Four extends Piece 
{
    public Four(int couleur, int colonne, int ligne)
    {
        super(couleur, colonne, ligne);
        if (couleur == Jeu.BLANC)
        {
            image = trouveImage("/ressources/w_Bishop");
        }
        else image = trouveImage("/ressources/b_Bishop");
    }
    
    
}
