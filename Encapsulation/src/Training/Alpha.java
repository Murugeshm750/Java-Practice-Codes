package Training;

public class Alpha {
	   public static void main(String[] args)  
       {   
           int size = 5  ;  
           for (int i = 0; i<=size; i++) 
           {  
               for (int j = 0; j <= 4 * size; j++) 
               {  
                     double part1 = Math.sqrt(Math.pow(i - size, 2) + Math.pow(j - size, 2));  
                     double part2 = Math.sqrt(Math.pow(i - size, 2) + Math.pow(j - 3 * size, 2));  
  
                     if (part1 < size + 0.5 || part2 < size + 0.5) 
                     {  
                          System.out.print('*');  
                     }
                     else 
                     {  
                          System.out.print(' ');  
                     }  
               }  
                     System.out.print(System.lineSeparator());  
       } 
               for (int m = 1; m <= 2 * size; m++)  
               {  
                   for (int n = 0; n < m; n++) {  
                       System.out.print(' ');  
               }  
               for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
                       System.out.print("*");  
                   }  
               System.out.print(System.lineSeparator());  
           }  
       }
}
