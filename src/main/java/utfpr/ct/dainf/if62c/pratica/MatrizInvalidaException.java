/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author DANIEL
 */
public class MatrizInvalidaException extends Exception {

    private final int linhas;
    private final int colunas;

    public MatrizInvalidaException(int m, int n) {
        super(String.format("Matriz de %dx%d não pode ser criada", m, n));
        this.linhas = m;
        this.colunas = n;
    }

    public int getNumLinhas() {
        return linhas;
    }

    public int getNumColunas() {
        return colunas;
    }

}
