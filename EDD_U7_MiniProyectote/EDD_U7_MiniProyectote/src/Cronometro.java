/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PpChuy
 */
public class Cronometro {
    long before, after;
    int arr[];
    Metodos m;
    
    
    public long burbuja(int []arr){
        before=0;
        after=0;
        before=System.nanoTime();
        m.burbuja(arr);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long quickSort(int[] arr, int izq, int der){
        before=0;
        after=0;
        before=System.nanoTime();
        m.quickSort(arr, izq, der);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long shellSort(int arr[]){
        before=0;
        after=0;
        before=System.nanoTime();
        m.shellsort(arr);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long radix(int arr[], int maxDigits){
        before=0;
        after=0;
        before=System.nanoTime();
        m.radix(arr, maxDigits);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long mezclaDirecta(int [] arreglo){
        before=0;
        after=0;
        before=System.nanoTime();
        m.mezclaDirecta(arreglo);
        after=System.nanoTime();
        return (after-before);
    }
    
        
    public long mezclaNatural(int [] arr){
        before=0;
        after=0;
        before=System.nanoTime();
        m.mezclaNatural(arr);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long secuencial(int arr[] , int x){
        before=0;
        after=0;
        before=System.nanoTime();
        m.secuencial(arr, x);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long binaria(int arr[], int x){
        before=0;
        after=0;
        before=System.nanoTime();
        m.binaria(arr, x);
        after=System.nanoTime();
        return (after-before);
    }
    

    
}
