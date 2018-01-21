/*
 * Test visibility
 */
package testvisibility;

import package1.Beta;
import package2.Gamma;

/**
 *
 * @author tudor
 */
public class TestVisibility {
    
    public static void main(String[] args) {
        Beta b = new Beta();
        b.testA();
        Gamma g = new Gamma();
        g.testA();
    }
}
