/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gramatica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Leitura {

    public Gramar leitura(){
            Gramar x = new Gramar();
            x.transiçoes = new ArrayList<Transição>();
        try {
            File arquivo = new File("src/testes/ex6.1.txt");
            Scanner leitor = leitor = new Scanner(arquivo);
            
            String i = leitor.nextLine();
            x.setAlfabeto(i);
            i = leitor.nextLine();
            x.setSimbolos(i);
            i = leitor.nextLine();
            x.setSimboloini(i);
           
            while(leitor.hasNext()) {
                i = leitor.nextLine();
                String[] palavras = i.split(" ");
                Transição TR = new Transição();
                TR.setSimbolo(palavras[0]);
                TR.setProduçao(palavras[1]);
                if(palavras[1].length() == 1){
                    TR.setTerminal(true);}
                else{ 
                    TR.setTerminal(false);
                }
                x.transiçoes.add(TR);
                
            }

            
            System.out.println("alfabeto: "+ x.getAlfabeto());
            System.out.println("Simbolos: "+ x.getSimbolos());
            System.out.println("simbolo inicial: "+ x.getSimboloini());
            System.out.println("Transições:");
            for (int k = 0; k < x.transiçoes.size(); k++) {  
            Transição aux;
            aux = x.transiçoes.get(k);
            aux.print(aux);  
            }
            
//            Simulacao s = new Simulacao(x.getEstinicial());
//            Scanner entrada = new Scanner (System.in);
//            System.out.print("Digite a sequencia: ");
//            String seq = entrada.nextLine();
            
          leitor.close();
        } catch (FileNotFoundException ex)  {
            ex.printStackTrace();
                System.out.println("Erro ao abrir arquivo!");
        }
    return x;
    }
}
