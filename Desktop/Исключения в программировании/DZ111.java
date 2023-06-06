public class DZ111 {
    public static void main(String[] args) {
        int[] massiv = {4,5,4,2,3,4,5};
        
        System.out.println(f1((massiv)));
        System.out.println(f2(massiv, 1));
        System.out.println(f3(massiv, 11));
    }
        public static int f1(int[]massiv ){

           if (massiv.length < 7) {
                throw new RuntimeException ("Длина массива меньше 7");
            }
            return massiv.length;
        }
        public static int f2(int[] massiv, int i){
            for (int j = 0; j < massiv.length; j++) { 
                if ( j >= i && i>=0) { 
                    return massiv[j];
                }
            
            }
            //return j; 
            throw new RuntimeException ("Такого элемента не существует");   
        }
        public static int f3(int[] massiv, int k){
            for (int j = 0; j < massiv.length; j++) {  
                if (massiv [j] == k) {
                    return massiv[j];
                }
            }    
            
            throw new RuntimeException ("Такого значения нет");
        }
        
}    
  
   