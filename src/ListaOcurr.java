import java.io.File;

public class ListaOcurr {
    private NodoOcurr head;
    public ListaOcurr(){
        head = null;
    }
    public boolean vacio(){
        return head == null;
    }
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

    public void ordenTamano(int[] tamano){

    }

}


