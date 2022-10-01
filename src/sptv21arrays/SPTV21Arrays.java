package sptv21arrays;

import java.util.Random;

/**
 *
 * @author User
 */
public class SPTV21Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----Demo Arrays----");
        int[] arr1 = new int[10];
        Random random = new Random();
        for(int i = 0; i<arr1.length; i++){  
            arr1[i] = random.nextInt(10);
        }
        int sum = 0;
        int min = 10;
        int max = 0;
        
        System.out.print("[");
        for(int i = 0; i<arr1.length; i++){
            System.out.printf("%2d," ,arr1[i]);
            sum += arr1[i];
            if(min > arr1[i]) min = arr1[i];
            if(max < arr1[i]) max = arr1[i];
        }
        
        
        System.out.print("]");
        System.out.println();
        System.out.println("sum = "+sum);
        System.out.println("max = "+max);
        System.out.println("min = "+min);

        System.out.println ("===Demo Arrays====");
        int arr2[][] = new int [10][10];
        for (int i=0;i<arr2.length;i++) {
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j] = random.nextInt(100);
            }
        }
            for (int i= 0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.printf("%4d", arr2[i][j]);
                if(min > arr2[i][j]) min = arr2[i][j];
                if(max < arr2[i][j]) max = arr2[i][j];
                sum += arr2[i][j];
            }
            System.out.println();
            
            System.out.println("summa = "+sum);
            System.out.println("maxim = "+max);
            System.out.println("minim = "+min);    
            
        }
        }
    }




