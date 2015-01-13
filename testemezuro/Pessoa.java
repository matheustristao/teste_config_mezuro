/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testemezuro;

/**
 *
 * @author matheus
 */
public class Pessoa {
    
    private int id;
    private String nome;
    
    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
   public String getNome(){
       return this.nome;
   }
    
    
}
