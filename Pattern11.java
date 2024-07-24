/*
 Pattern:- * * * *
             * * *
               * *
                 *
 */

public class Pattern11 {
    public static void main(String args[]){
        for(int i=0;i<4;i++){
            for(int j=0;j<i;j++){
                System.out.print(" "+" ");
            }
            for(int j=0;j<4-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}

//Another optimal way is to use if else it will eliminate one for loop if(i<j){ print " "}else{print "*"};
