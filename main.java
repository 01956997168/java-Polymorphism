/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist.Polymorphism;

/**
 *
 * @author Shiplu L
 */
public class main {
    public static void main(String[] args) { 
        animal reference;
        reference=new cat();
        reference.sound();
        
        reference=new dog();
        reference.sound();
        
    }
}
