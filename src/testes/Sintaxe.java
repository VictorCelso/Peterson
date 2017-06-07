/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author v.tassinari
 */
public class Sintaxe {

    String value;
    Sintaxe leftNode;
    Sintaxe rightNode;

    public static Sintaxe createRoot(String value) {
        Sintaxe root = new Sintaxe();
        root.value = value;
        return root;
    }
    
}
