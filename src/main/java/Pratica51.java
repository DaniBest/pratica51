
import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;
import utfpr.ct.dainf.if62c.pratica.ProdMatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.SomaMatrizesIncompativeisException;

/**
 * IF62C Fundamentos de Programação 2
 *
 * @author Daniel Anderson de Freitas
 */
public class Pratica51 {

    public static void main(String[] args) {

        Matriz orig;
        try {
            orig = new Matriz(3, 2);
            double[][] m = orig.getMatriz();
            m[0][0] = 0.0;
            m[0][1] = 0.1;
            m[1][0] = 1.0;
            m[1][1] = 1.1;
            m[2][0] = 2.0;
            m[2][1] = 2.1;
        } catch (MatrizInvalidaException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

        Matriz A;
        try {
            A = new Matriz(-3, 0);
            double a[][] = A.getMatriz();
            a[0][0] = 0.0;
            a[0][1] = 0.1;
            a[1][0] = 1.0;
            a[1][1] = 1.1;
            a[2][0] = 2.0;
            a[2][1] = 2.1;
        } catch (MatrizInvalidaException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

        Matriz B;
        Matriz C;
        Matriz BC;
        try {
            B = new Matriz(2, 4);
            C = new Matriz(2, 3);
            double[][] b = B.getMatriz();
            double[][] c = C.getMatriz();
            b[0][0] = 0.0;
            b[0][1] = 0.1;
            b[0][2] = 0.2;
            b[0][3] = 0.3;
            b[1][0] = 1.0;
            b[1][1] = 1.1;
            b[1][2] = 1.2;
            b[1][3] = 1.3;
            c[0][0] = 0.0;
            c[0][1] = 0.1;
            c[0][2] = 0.2;
            c[1][0] = 1.0;
            c[1][1] = 1.1;
            c[1][2] = 1.2;
            BC = B.soma(C);
        } catch (MatrizInvalidaException | SomaMatrizesIncompativeisException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

        Matriz D;
        Matriz E;
        Matriz DE;
        try {
            D = new Matriz(2, 2);
            E = new Matriz(1, 2);
            double[][] d = D.getMatriz();
            double[][] e = E.getMatriz();
            d[0][0] = 0.0;
            d[0][1] = 0.1;
            d[1][0] = 1.0;
            d[1][1] = 1.1;
            e[0][0] = 0.0;
            e[0][1] = 0.1;
            DE = D.prod(E);
        } catch (MatrizInvalidaException | ProdMatrizesIncompativeisException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
