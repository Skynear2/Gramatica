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
public class Main {
     
    
    public static void main(String[] args) {
        // TODO code application logic here
    String palavra = "abb";
    Boolean x;
    Gramar aux = new Gramar();
    Leitura teste = new Leitura();
    aux = teste.leitura();
    System.out.println("deu certo");
    
     //   System.out.println("alfabet1o "+aux.getAlfabeto());
    //aux.validarPalavra(palavra);
    aux.estaNoAlfabeto(palavra);
    aux.simulador(palavra);
}
}
