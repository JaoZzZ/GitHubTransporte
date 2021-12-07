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
public class Principal {
    public static void main(String[] args) {
        Automovell carro = new Automovell();
        Automovell moto = new Automovell();
        
        carro.setNumPlaca("ABC-1234");
        carro.setNumPortas(4);
        carro.setCor("Branco");
        carro.setNumRodas(4);
        carro.setCapacidade(5);
        
        moto.setCapacidade(2);
        moto.setNumPortas(0);
        moto.setCor("Vermelha");
        moto.setNumPlaca("ABCD");
        moto.setNumRodas(2);
        
        carro.imprimirDados();
        moto.imprimirDados();
        
        
    }
}
