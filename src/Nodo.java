public class Nodo {
    public Nodo padre;
    public Nodo left;
    public Nodo right;
    public int key;
    public int word;

    public Nodo(int index, int w){
        key = index;
        left = null;
        right = null;
        word = w;
        padre = null;
    }
}
