/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gramatica;

import java.util.List;

/**
 *
 * @author Wesley
 */
public class Gramar {
    
    String alfabeto;
    String simbolos;
    String simboloini;
    List<Transição> transiçoes;
    Transição estadoatual;
    String palavrateste;
    int pos;

//    public Gramar(){
//        this.transiçoes = new ArrayList<Transição>;
//    }       
    public String getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String alfabeto) {
        this.alfabeto = alfabeto;
    }

    public String getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(String simbolos) {
        this.simbolos = simbolos;
    }

    public String getSimboloini() {
        return simboloini;
    }

    public void setSimboloini(String simboloini) {
        this.simboloini = simboloini;
    }

    public List<Transição> getTransiçoes() {
        return transiçoes;
    }

    public void setTransiçoes(List<Transição> transiçoes) {
        this.transiçoes = transiçoes;
    }

    public void criaTrans (Transição e){
        this.transiçoes.add(e);
    }

    public Transição getEstadoatual() {
        return estadoatual;
    }

    public void setEstadoatual(Transição estadoatual) {
        this.estadoatual = estadoatual;
    }

    

    public String getPalavrateste() {
        return palavrateste;
    }

    public void setPalavrateste(String palavrateste) {
        this.palavrateste = palavrateste;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    

    public Boolean estaNoAlfabeto(String palavra) {
        if (palavra.isEmpty()) {
            System.out.println("Palavra vazia");
        return false;
        }
        String str[] = palavra.split("");
        for (String s : str) {
            if (!this.alfabeto.contains(s.trim())) {
                System.out.println("palavra invalida");
                return false;
            }
        }
        System.out.println("Palavra valida.");
        return true;
    }
    
   public void simulador(String palavra){
          this.setEstadoatual(this.getTransiçoes().get(0));
          this.setPos(0);
          List<Transição> aux;
          aux = this.getTransiçoes();
          Transição aux2;
          this.setPalavrateste(this.transiçoes.get(0).getProduçao());
          this.setPos(pos++);
          System.out.println("palavra teste"+ this.getPalavrateste());
          int i = 0;
         while(pos <= palavra.length()){
             System.out.println("pos:" +this.getPos());
             //System.out.println("palavra na pos: "+palavra.charAt(pos));
             
             for (; i < this.transiçoes.size(); i++) {
                 System.out.println("size "+this.transiçoes.size());
                 System.out.println("i:" +i);
                 aux.get(i).print(aux.get(i));
                 aux2 = aux.get(i);
                 System.out.println("estado atual");
                 this.getEstadoatual().print(this.getEstadoatual());
                 if (palavra.charAt(pos) == aux.get(i).getProduçao().charAt(0)){
                     
                     System.out.println("palavra teste1 "+ this.getPalavrateste());
                     //this.setEstadoatual(aux.get(i));
                     System.out.println("if1 palavra: "+palavra.charAt(pos));
                     System.out.println("if1 produçao pos 0: "+  aux.get(i).getProduçao().charAt(0));
                     
                     if(palavrateste.contains(aux2.getSimbolo())){
                         System.out.println("if2: "+palavrateste.contains(this.getEstadoatual().getSimbolo()));
                         this.setPalavrateste(this.getPalavrateste().replace(aux.get(i).getSimbolo(), aux.get(i).getProduçao()));
                         System.out.println("palavra teste2 "+ this.getPalavrateste());
                     }
                     else {
                         this.palavrateste.concat(aux.get(i).getProduçao());
                     }
                 }
                 System.out.println("i: "+i);
                 i++;
                 break;
             }
             this.setPos(this.getPos()+1);
             System.out.println("palavrateste3: "+this.getPalavrateste());
             
         }
          
//          if(this.getEstadoatual().getProduçao().contains(palavra.substring(pos, pos))){
//              System.out.println("if 1: "+this.getEstadoatual().getProduçao().contains(palavra.substring(pos, pos)));
//              if(this.getPalavrateste().contains(this.getEstadoatual().getSimbolo())){
//                  System.out.println("if2: "+this.getPalavrateste().contains(this.getEstadoatual().getSimbolo()));
//                  this.setPalavrateste(this.getPalavrateste().replace(this.getEstadoatual().getSimbolo(), this.getEstadoatual().getProduçao()));
//                 
//              }
//            }      
          System.out.println("palavra teste2 "+ this.getPalavrateste());  
   
          
//          for(Transição e : aux){
//            if(!e.getProduçao().contains(palavra.substring(pos, pos))){
//            
//          } else {
//                this.setEstadoatual(e.getSimbolo());
//                this.palavrateste = e.getProduçao();
//              }
//              System.out.println("palavrateste "+this.getPalavrateste());
//              System.out.println(this.getEstadoatual());
                
            
          
          //}
          
      
      }
    
}
