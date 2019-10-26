import java.io.File;

public class NodoOcurr {
    NodoOcurr next;
    File Arch;
    int posicion;
    public NodoOcurr(File A, int P, NodoOcurr n){
        posicion = P;
        Arch = A;
        next = n;
    }
    public NodoOcurr(File A, int P){
        this(A,P,null);
    }
}
