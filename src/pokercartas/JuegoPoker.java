
package pokercartas;

/**
 *
 * @author Nerea
 */
public class JuegoPoker {
    static public final int NADA=0;
    static public final int PAREJA=2;
    static public final int TRIO=3;
    static public final int POKER=4;
    static public final int REPOKER=5;
    
    //Métodos
    /**
     * 
     * @param carta1
     * @param carta2
     * @param carta3
     * @param carta4
     * @param carta5
     * @return NADA,PAREJA,TRIO,POKER,REPOKER
     */
    public static int getCombinacion(CartaFrancesa carta1,CartaFrancesa carta2,CartaFrancesa carta3,CartaFrancesa carta4,CartaFrancesa carta5){
        BarajaFrancesa baraja = new BarajaFrancesa();
        CartaFrancesa cartas[] = new CartaFrancesa[5];
        cartas[0]=carta1;
        cartas[1]=carta2;
        cartas[2]=carta3;
        cartas[3]=carta4;
        cartas[4]=carta5;
        for(int i=0;i<0 && i<6;i++){
            for(int n=0;cartas[i].getNumero()== cartas[n].getNumero();n++){
                
                switch(n){
                    case 0:
                        return NADA;
                    case 1:
                        return PAREJA;
                    case 2:
                        return TRIO;
                    case 3:
                        return POKER;
                    case 4:
                        return REPOKER;
                    default:
                        return 0;
                }
            }
        }
        return 0;
    }
}
