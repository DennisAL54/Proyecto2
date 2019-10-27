import java.io.File;

/***
 * Nodo perteneciente a la lista de ocurrencias
 */
public class NodoOcurr {
    /***
     * Datos Estandar necesarios para manejar un nodo simplemente enlazado
     */
    NodoOcurr next;
    File Arch;
    int posicion;

    /***
     * Constructor para el NodoOcurr, el nodo contiene: un archivo, una posicion y un nodo next
     * @param A
     * @param P
     * @param n
     */
    public NodoOcurr(File A, int P, NodoOcurr n){
        posicion = P;
        Arch = A;
        next = n;
    }

    /***
     * Constructor para un nodo sin next
     * @param A
     * @param P
     */
    public NodoOcurr(File A, int P){
        this(A,P,null);
    }
}
