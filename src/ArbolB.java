public class ArbolB {
    Nodo root;

    public ArbolB() {
        root = null;
    }

    public void add(int i, String w) {
        Nodo n = new Nodo(i, w);
        if (root == null) {
            root = n;
        } else {
            Nodo aux = root;
            while (aux != null) {
                n.padre = aux;
                if (i < aux.key) {
                    aux = aux.left;
                    if (aux == null) {
                        n.padre.left = n;
                        return;
                    }
                } else {
                    aux = aux.right;
                    if(aux == null){
                        n.padre.right = n;
                        return;
                    }
                }
            }
        }
    }
    public Nodo Buscar(int d){
        Nodo aux = root;
        while(aux.key!=d){
            if(d<aux.key){
                aux = aux.left;
            }
            else{
                aux = aux.right;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
}
    /*String str = "dog";
    char[] cArray = str.toCharArray();
    char character = cArray[0];
    char character2 = cArray[1];
    int ascii = (int)character;
    int ascii2 = (int)character2;*/