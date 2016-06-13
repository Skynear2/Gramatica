/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gramatica;

/**
 *
 * @author Wesley
 */
public class Transição {
    String simbolo;
    String produçao;
    boolean terminal;

    public boolean isTerminal() {
        return terminal;
    }

    public void setTerminal(boolean terminal) {
        this.terminal = terminal;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getProduçao() {
        return produçao;
    }

    public void setProduçao(String produçao) {
        this.produçao = produçao;
    }
    public void print(Transição e){
        System.out.print(e.simbolo);
        System.out.print("->");
        System.out.print(e.produçao);
        System.out.println();
    }

}
