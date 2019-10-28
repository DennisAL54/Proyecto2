import java.io.File;

/***
 * Clase para manejar la lista de ocurrencias (Lista simplemente enlazada)
 */
public class ListaOcurr {
    private NodoOcurr head;

    /***
     * Inicializa la la lista vacia
     */
    public ListaOcurr(){
        head = null;
    }
    public boolean vacio(){
        return head == null;
    }

    /***
     * Metodo hecho para agregar elementos a la lista de ocurrencias
     * @param lista
     * @param A
     * @param P
     * @return
     */
    public ListaOcurr add(ListaOcurr lista,File A, int P){
        NodoOcurr nuevo = new NodoOcurr(A,P);
        if(lista.head == null){
            lista.head = nuevo;
        }
        else{
            NodoOcurr tail = lista.head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = nuevo;
        }
        return lista;
    }
    //public ListaOcurr listaQ()

    /***
     * Metodo ordenFecha, acomoda las fechas en orden de menor a mayor usando bubbleSort
     * @param fechas Lista con las fehcas de creacion de los archivos
     * @return
     */
    private void ordenFecha(String[] fechas){
        String temp;
        int n = fechas.length;
        for (int j = 0; j < n - 1; j++){
            for (int i = j + 1; i < n; i++){
                if (fechas[j].compareTo(fechas[i]) > 0){
                    temp = fechas[j];
                    fechas[j] = fechas[i];
                    fechas[i] = temp;
                }
            }
        }
    }

    /***
     * Metodo ordenTamano, ordena los archivos de acuerdo al tamano de los archivos
     * @param tamano Lista que contiene los tamaños de cada archivo
     * @return
     */

    public void ordenTamano(int[] tamano){

    }

}


