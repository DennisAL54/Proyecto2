public class Nodo {
    public Nodo padre;
    public Nodo left;
    public Nodo right;
    public int key;
    public String word;
    public ListaOcurr lista;

    public Nodo(int index, String w,ListaOcurr l){
        key = index;
        left = null;
        right = null;
        word = w;
        padre = null;
        lista = l;

    }
}