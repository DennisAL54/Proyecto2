import java.io.File;

public class NodoOcurr {
    NodoOcurr next;
    NodoOcurr prev;
    File Arch;
    int posicion;
    public NodoOcurr(File A, int P, NodoOcurr n, NodoOcurr p){
        posicion = P;
        Arch = A;
        next = n;
        prev = p;
    }
    public NodoOcurr(File A, int P){
        this(A,P,null,null);
    }
}
