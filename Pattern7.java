/*
 pattern:- * * * * * * * * *
           * *     *     * *
           *  *    *   *   *
           *    *  * *     *
           * * * * * * * * *
           *     * * *     *
           *    *  *   *   *
           *  *    *     * *
           * * * * * * * * *
 */

public class Pattern7 {
    public static void main(String args[]){
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(i==0 || j==0 || i== 5 || j==5 || j==10 ||i==10 || i==j || i+j==10){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    
}
