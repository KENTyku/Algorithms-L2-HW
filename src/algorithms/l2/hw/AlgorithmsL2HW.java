/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package algorithms.l2.hw;

/**
 *
 * @author kentyku
 */
public class AlgorithmsL2HW {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ex1(8);
       System.out.println();
       ex1(1000);
    }
    /**
     * Метод перевода десятичного числа в двоичное
     * @param dec 
     */
    static void ex1(int dec){
        if (dec<2) {
            System.out.print(dec);
            return;
        }
        int digit=dec%2;
        ex1(dec/2);
        System.out.print(digit);
    }    
        
        
        
    
    
}
