/***
 * Clase Nodo, estos nodos pertenecen a ArbolB
 */
public class Nodo {
    /***
     * Datos Estandar para la construccion de un nodo, la data en su interior sera: Indice, Palabra y una lista de ocurrencias
     */
    public Nodo padre;
    public Nodo left;
    public Nodo right;
    public int key;
    public String word;
    public ListaOcurr lista;

    /***
     * Metodo constructor para el nodo
     * @param index
     * @param w
     * @param l
     */
    public Nodo(int index, String w,ListaOcurr l){
        key = index;
        left = null;
        right = null;
        word = w;
        padre = null;
        lista = l;

    }
}