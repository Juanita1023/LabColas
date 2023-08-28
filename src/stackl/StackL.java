/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackl;

/**
 *
 * @author Juanita
 */
public class StackL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> miPila = new Stack<String>();
        miPila.push("maria");
        miPila.push("Juan");
        miPila.push("Pedro");
        for (String elem : miPila) {
            System.out.println(elem);
        }

        //miPila.showStack();
        System.out.println("retiro " + miPila.pop());
        for (String elem : miPila) {
            System.out.println(elem);
        }
        System.out.println("retiro " + miPila.pop());
        for (String elem : miPila) {
            System.out.println(elem);
        }
 
    }

}