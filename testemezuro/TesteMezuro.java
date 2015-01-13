/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testemezuro;

import java.util.*;
/**
 *
 * @author matheus
 */
public class TesteMezuro {

    /**
     * @param args the command line arguments
     */
    
    static Scanner scan = new Scanner(System.in); 
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        int id;
        String nome;
        Pessoa pessoa;
          
        id = Integer.parseInt(scan.nextLine());
        nome = scan.nextLine();
        
        pessoa = new Pessoa(id,nome);
        
       System.out.println("Pessoa salva: " + pessoa.getNome());
        
        
    }
    
}
