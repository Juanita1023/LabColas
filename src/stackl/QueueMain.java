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
public class QueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Queue<String> miQueue = new Queue<String>();
     miQueue.Encolar("juanita");
     miQueue.Encolar("leidy");
     miQueue.Encolar("Mateo");
     for (String elem : miQueue) {
            System.out.println(elem); 
        }
    //miQueue.showQueue();
    System.out.println("retiro " + miQueue.desEncolar());
        for (String elem : miQueue) {
            System.out.println(elem);
        }
        System.out.println("retiro " + miQueue.desEncolar());
        for (String elem : miQueue) {
            System.out.println(elem);
        }

    }
}


