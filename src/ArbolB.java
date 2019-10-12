public class ArbolB {
    Nodo root;
    public ArbolB(){
        root = null;
    }
    public void add(int i, String w){
        Nodo n = new Nodo(i);
        n.word = w;
        if(root == null){
            root = n;
        }
        else{
            Nodo aux = root;
            while(aux!=null){
                n.padre = aux;
                if(n.key >= aux.key){
                    aux = aux.right;
                }
                else{
                    aux = aux.left;
                }
                if(n.key<=n.padre.key){
                    n.padre.left = n;
                }
                else{
                    n.padre.right = n;
                }
            }
        }
    }
}
