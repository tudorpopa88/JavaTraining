/*
 * class Gamma
 */
package package2;

import package1.Alpha;

/**
 *
 * @author tudor
 */
public class Gamma {
    
    public void testA() {
        Alpha obiectDeTipA = new Alpha();
        System.out.println("=== clasa Gamma din alt pachet decat Alpha ===");
        System.out.println("Variabila publica din clasa Alpha este: " + obiectDeTipA.publicA);
        System.out.println("Variabila package din clasa Alpha nu este vizibila");
        System.out.println("Variabila protected din clasa Alpha nu este vizibila");
        System.out.println("Variabila private din Alpha nu este vizibila");
    }
}
