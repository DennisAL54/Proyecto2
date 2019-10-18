import java.io.File;

public class ListaOcurr {
    private NodoOcurr head;
    private NodoOcurr tail;
    public ListaOcurr(){
        head = tail = null;
    }
    public boolean vacio(){
        return head == null;
    }
    public void addF(File A, int P){
        if(!vacio()){
            tail = new NodoOcurr(A,P,null,tail);
            tail.prev.next = tail;
        }
        else{
            head = tail = new NodoOcurr(A,P);
        }
    }

}
