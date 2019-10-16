public class Nodo {
    public Nodo padre;
    public Nodo left;
    public Nodo right;
    public int key;
    public String word;

    public Nodo(int index, String w){
        key = index;
        left = null;
        right = null;
        word = w;
        padre = null;
    }
}