package utfpr.ct.dainf.if62c.pratica;

/**
 * Representa uma matriz de valores {@code double}.
 *
 * @author Daniel Anderson de Freitas
 */
public class Matriz {

    // a matriz representada por esta classe
    private final double[][] mat;

    /**
     * Construtor que aloca a matriz.
     *
     * @param m O número de linhas da matriz.
     * @param n O número de colunas da matriz.
     * @throws utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException
     */
    public Matriz(int m, int n) throws MatrizInvalidaException {
        if (m <= 0 || n <= 0) {
            throw new MatrizInvalidaException(m, n);
        }
        mat = new double[m][n];
    }

    /**
     * Retorna a matriz representada por esta classe.
     *
     * @return A matriz representada por esta classe
     */
    public double[][] getMatriz() {
        return mat;
    }

    /**
     * Retorna a matriz transposta.
     *
     * @return A matriz transposta.
     * @throws utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException
     */
    public Matriz getTransposta() throws MatrizInvalidaException {
        Matriz t = new Matriz(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
    }

    /**
     * Retorna a soma desta matriz com a matriz recebida como argumento.
     *
     * @param m A matriz a ser somada
     * @return A soma das matrizes
     * @throws utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException
     */
    public Matriz soma(Matriz m) throws MatrizInvalidaException {
        if (mat.length != m.mat.length || mat[0].length != m.mat[0].length) {
            throw new SomaMatrizesIncompativeisException(this, m);
        }
        Matriz ms = new Matriz(mat.length, mat[0].length);
        for (int i = 0; i < this.mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                ms.mat[i][j] = mat[i][j] + m.mat[i][j];
            }
        }
        return ms;
    }

    /**
     * Retorna o produto desta matriz com a matriz recebida como argumento.
     *
     * @param m A matriz a ser multiplicada
     * @return O produto das matrizes
     * @throws utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException
     */
    public Matriz prod(Matriz m) throws MatrizInvalidaException {
        if (mat[0].length != m.mat.length) {
            throw new ProdMatrizesIncompativeisException(this, m);
        }
        Matriz mp = new Matriz(mat.length, m.mat[0].length);
        for (int i = 0; i < this.mat.length; i++) {
            for (int j = 0; j < m.mat[0].length; j++) {
                for (int k = 0; k < m.mat.length; k++) {
                    mp.mat[i][j] += mat[i][k] * m.mat[k][j];
                }
            }
        }
        return mp;
    }

    /**
     * Retorna uma representação textual da matriz. Este método não deve ser
     * usado com matrizes muito grandes pois não gerencia adequadamente o
     * tamanho do string e poderia provocar um uso excessivo de recursos.
     *
     * @return Uma representação textual da matriz.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha : mat) {
            s.append("[ ");
            for (double x : linha) {
                s.append(x).append(" ");
            }
            s.append("]");
        }
        return s.toString();
    }

}
