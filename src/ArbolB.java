import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * Clase ArbolB (Encargada del manejo del arbol binario de busqueda)
 */
public class ArbolB {
    /***
     * Nodo raiz
     */
    Nodo root;

    /***
     * Inicializa el arbol en null
     */
    public ArbolB() {
        root = null;
    }

    /***
     * Metodo Para convertir listas de caracteres (palabra dividida en caracteres) en su valor total en ASCII
     * @param c
     * @return
     */
    public int conversionSum(char[] c){
        /***
         * Variables enteras requeridas
         */
        int n;
        int i;
        int S;
        S = (int)c[0];
        i=1;
        n = c.length;
        /***
         * Bucle while que recorre la lista de caracteres
         */
        while(i!=(n-1)){
            char character = c[i];
            int ascii = (int)character;
            S = S + ascii;
            i = i+1;
        }
        return S;
    }

    /***
     * Metodo scan, hecho para tomar un elemento de la lista de archivos, procesar su contenido y agregarlo al arbol binario
     * @param f
     * @throws FileNotFoundException
     */
    public void scan(File f)throws FileNotFoundException {
        /***
         * Se crea un nuevo scanner, el cual es necesario para ver dentro del archivo
         */
        Scanner scan = new Scanner(f);
        /***
         * Bucle while que detiene el scanner en caso de no tener mas palabras
         */
        while(scan.hasNextLine()){
            ListaOcurr listaO = new ListaOcurr();
            String str = scan.next();
            char[] cArray = str.toCharArray();
            int ascii;
            /***
             * Se llama el metodo conversionsum y se agrega el resultado final al arbol
             */
            ascii = conversionSum(cArray);
            add(ascii, str, listaO);
        }
        return;

    }

    /***
     * Metodo Add, encargado de agregar un nodo nuevo al arbol binario (Es llamado por el metodo scan)
     * @param i
     * @param w
     * @param l
     */
    public void add(int i, String w, ListaOcurr l) {
        Nodo n = new Nodo(i, w, l);
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

    /***
     * Metodo buscar, el cual encuentra un nodo en especifico dentro del arbol
     * @param word
     * @return
     */
    public Nodo Buscar(String word){
        /***
         * Importante notar como el metodo debe convertir la palabra buscada en ASCII para poder usarse
         */
        String w;
        w = word;
        char[] charac = w.toCharArray();
        int d;
        d = conversionSum(charac);
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