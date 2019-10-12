public class Nodo {
    public Nodo padre;
    public Nodo left;
    public Nodo right;
    public int key;
    public String word;

    public Nodo(int index){
        key = index;
        left = null;
        right = null;
        padre = null;
        word = null;
    }
}
