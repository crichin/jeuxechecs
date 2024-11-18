package main;

import java.awt.Color;
import java.awt.Graphics2D;

public class Plateau 
{
    final int MAX_COL = 8;
    final int MAX_LGN = 8;
    
    public static  final int TAILLE_CARRE = 75;
    public static  final int DEMI_TAILLE_CARE = TAILLE_CARRE/100;



    public void dessine(Graphics2D g2)
    {
        int changeCouleur = 0;

        for(int ligne = 0; ligne < MAX_LGN; ligne ++)
        {
            for(int colonne = 0; colonne < MAX_COL; colonne++)
            {
                if( changeCouleur == 0 )
                {
                    g2.setColor(new Color(210,165,125));
                    changeCouleur = 1; 
                }
                else
                {
                    g2.setColor(new Color(175,115,125));
                    changeCouleur = 0;
                }
     
                g2.fillRect(colonne*TAILLE_CARRE, ligne*TAILLE_CARRE, TAILLE_CARRE, TAILLE_CARRE);
            }
            
            //Apres une ligne... change l'ordre de la coloration de chaque caro...
            changeCouleur =  changeCouleur == 0 ? 1 : 0;
        }
    }
}
