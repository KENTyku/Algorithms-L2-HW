/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package algorithms.l2.hw;

/**
 *
 * @author Yuri Tveritin
 */
public class AlgorithmsL2HW {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("resultBin=");
       ex1(8);
       System.out.println();
       System.out.println("resultNoRecurs="+ex2aNoRecurs(2,5));       
       System.out.print("resultRecurs="+ex2cRecurs(2,5));
    }
    /**
     * Задание 1.еализовать функцию перевода чисел из десятичной системы в двоичную,
     * используя рекурсию.
     * 
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
    /**
     * Задание 2а.Реализовать функцию возведения числа a в степень b:
     * a. Без рекурсии. 
     * @param a
     * @param b 
     */
    static int ex2aNoRecurs(int a,int b){
       int n=1;//учитывает нечетную степень
        int s=a;//учитывает четную степень
        int k=b;// степень
        while(k!=0){
            if(k%2==0){
                s=s*s;
                k=k/2;
            }
            else{
                k--;
                n=n*s;
            }
        }
        return n; 
    }
    
    /**
     * Задание 2c.Реализовать функцию возведения числа a в степень b:    
     * c. *Рекурсивно, используя свойство чётности степени.    
     * @param a
     * @param b 
     */
    static int ex2cRecurs(int a,int b){        
        int result;        
        if(b==1)return a;        
        if(b%2==0){
            result=ex2cRecurs(a,b/2)*ex2cRecurs(a,b/2);
        }
        else{
        result=a*ex2cRecurs(a,b-1);
        }
        return result;
    }
    
    /**
     * Задание 3. **Исполнитель «Калькулятор» преобразует целое число, 
     * записанное на экране. У исполнителя две команды, каждой присвоен номер:
     * 1. Прибавь 1.
     * 2. Умножь на 2.
     * Первая команда увеличивает число на экране на 1, вторая увеличивает 
     * его в 2 раза. Сколько существует программ, которые число 3 преобразуют 
     * в число 20:
     * 
     * а. С использованием массива.
     * b. *С использованием рекурсии.
     */
    
    static int ex3a(){
        
        
        
        int c=0;
        return c;
    }
}
