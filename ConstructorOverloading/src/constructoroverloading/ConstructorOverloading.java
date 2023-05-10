/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverloading;

/**
 *
 * @author Shaeakh
 */
public class ConstructorOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher T1 = new Teacher("Shaeakh","Male",22);
        T1.dis();
        Teacher T2 = new Teacher("Amit","Male");
        T2.dis();
        Teacher T3 = new Teacher();
        T3.dis();
    }
    
}
