/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author IFSC
 */
public class Automovell extends Terrestre{
   private String cor;
   private String numPlaca;
   private int numPortas;
   
   public void imprimirDados(){
       System.out.println("------impressao de dados------");
       System.out.println("Placa: "+numPlaca);
       System.out.println("Numero de portas: "+numPortas);
       System.out.println("N de rodas: "+numRodas);
       System.out.println("Cor: "+cor);
              
   }
   public Automovell(){
       
   }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
  
   

    void setCapacidade(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
