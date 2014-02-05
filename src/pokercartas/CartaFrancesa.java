package pokercartas;

public class CartaFrancesa {

    private int palo;
    private int numero;
    
    /**
     *Constante palo TREBOLES
     */
    public static final int TREBOLES = 0;
    /**
     *Constante palo DIAMANTES
     */
    public static final int DIAMANTES = 1;
    /**
     *Constante palo CORAZONES
     */
    public static final int CORAZONES = 2;
    /**
     *Constante palo PICAS
     */
    public static final int PICAS = 3;
    /**
     *Constante palo COMODIN
     */
    public static final int COMODIN = 4;
    /**
     * Constructor
     * @param palo
     * @param numero 
     */
    public CartaFrancesa(int palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
    /**
     * Devuelve el palo de la carta
     * @return palo
     */
    public int getPalo() {
        return palo;
    }
    /**
     * Devuelve el numero de la carta
     * @return numero
     */
    public int getNumero() {
        return numero;
    }
    /**
     * 
     * Devuelve en formato String "numero de palo"
     * @return String retorno
     */
    public String toString() {
        String retorno = "";
        if(numero>0 && numero<10) {
            retorno += numero+1;
        } else {
            switch(numero) {
                case 0:
                    retorno += "As";
                    break;
                case 10:
                    retorno += "J";
                    break;
                case 11:
                    retorno += "Q";
                    break;
                case 12:
                    retorno += "K";
                    break;
            }
        }
        retorno += " de ";
        switch(palo) {
            case TREBOLES:
                retorno+="Treboles";
                break;
            case DIAMANTES:
                retorno+="Diamantes";
                break;
            case PICAS:
                retorno+="Picas";
                break;
            case CORAZONES:
                retorno+="Corazones";
                break;
            case COMODIN:
                retorno+="Comodin";
                break;
        }
        return retorno;
    }
    /**
     * Devuelve el código de la carta con el formato "PrimeraLetraDelPaloNumero"
     * @return String codigo
     */
    public String toCodigo() {
        String retorno = "";
        switch(palo) {
            case TREBOLES:
                retorno+="T";
                break;
            case DIAMANTES:
                retorno+="D";
                break;
            case PICAS:
                retorno+="P";
                break;
            case CORAZONES:
                retorno+="C";
                break;
            case COMODIN:
                retorno+="J";
                break;
        }
        retorno+=numero;
        return retorno;
    }        
    
}
