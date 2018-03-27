import java.util.*;
public class rec{
    
    public void insertion(int a[]){
        int n= a.length;
        int hole;
        int value    ;   
        int temp ;       
       for (int i=0;i<=n-1; i++)
       {
           hole = i;
           value = a[i];
           
           while (hole>0 && (a[hole-1] > value)){
               
               a[hole]=a[hole-1];
               hole=hole-1;
            }
           a[hole]=value;
          
       }
    
        System.out.println(Arrays.toString(a));
    }
    
    
    public void selection(int a[]){
        int min,value,tmp,n;
        n = a.length;
        
        for (int i=0;i<n;i++){
            
            min=i;
            for (int j=i+1;j<n;j++){
                
                if(a[j]<a[min]){
                    
                    min = j;
                }
               
            }
        
            tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
            
        }
        
        System.out.println(Arrays.toString(a));
    }
    
    
    public void bubble(int a[]){
        int n, tmp;
        
        n = a.length;
        for (int k=0; k<= n-2; k++){
            
            for (int i=0;   i<=n-2; i++){
                
                if (a[i]>a[i+1]){
                    
                    tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                    
                }
                    
            }
            
        }
        System.out.println(Arrays.toString(a));
    }

public static void main(String args[]){
        
        int[] a = {4,6,43,5,4,6,8,2};
        
        //prat p = new prat();
       
        rec r = new rec();
        
        r.bubble(a);
        r.selection(a);
        r.insertion(a);
    }
    
    
}
