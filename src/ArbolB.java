import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArbolB {
    Nodo root;

    public ArbolB() {
        root = null;
    }
    public int conversionSum(char[] c){
        int n;
        int i;
        int S;
        S = (int)c[0];
        i=1;
        n = c.length;
        while(i!=(n-1)){
            char character = c[i];
            int ascii = (int)character;
            S = S + ascii;
        }
        return S;
    }

    public void scan(File f)throws FileNotFoundException {
        Scanner scan = new Scanner(f);
        while(scan.hasNextLine()){
            String str = scan.toString();
            char[] cArray = str.toCharArray();
            add(conversionSum(cArray), str);
            scan.next();
        }

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
}   //Esto es un ejemplo de la conversion ascii usada para la busqueda binaria. No se implementa de esta forma
    /*String str = "dog";
    char[] cArray = str.toCharArray();
    char character = cArray[0];
    char character2 = cArray[1];
    int ascii = (int)character;
    int ascii2 = (int)character2;*/