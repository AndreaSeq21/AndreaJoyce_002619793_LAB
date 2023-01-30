/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class Labwork {

    public int caculateEvenOdd(int x) {
        int sum = 0;
        if (x % 2 == 0) {
            sum = 2; // Double the value
        } else {
            sum = 3; //triple the value
        }
        return sum;
    }

    public static void main(String args[]) {
        int arrayValues[] = {1,2,3,4,5,6,7,8,9,10};
        Labwork obj = new Labwork();
        System.out.println("Displaying initial Array: ");
        for (int i = 0; i < arrayValues.length; i++) {
            System.out.print(" " + arrayValues[i]);
        }
        System.out.println();
        System.out.println(" Array Values after update: ");
        for (int i = 0; i < arrayValues.length; i++) {
            int values = obj.caculateEvenOdd(i);
            System.out.print(" " + (values * arrayValues[i]));
        }

    }

}
