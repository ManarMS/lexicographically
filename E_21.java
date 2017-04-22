package homework4;

import java.util.Scanner;
public class E_21
{
    


        public static void main(String []args){
            
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the first S1");
       String S1 = in.next();
 
       
       System.out.println("Enter the first S2");
       String S2 = in.next();
       
       System.out.println("Enter the first S3");
       String S3 = in.next();


 if(S1.compareTo(S2)<0&&S1.compareTo(S3)<0){
      System.out.println(S1);
     if(S2.compareTo(S3)<0){
        System.out.println(S2);
        System.out.println(S3);
        
        
 
    }else{
    System.out.println(S3);
    System.out.println(S2);
}
}
    else if (S2.compareTo(S1)<0&&S2.compareTo(S3)<0){
        System.out.println(S2);
        if(S1.compareTo(S3)<0){
              System.out.println(S1);
    System.out.println(S3); 
        }else{
            System.out.println(S3);
            System.out.println(S1);
        }
    }
    else if(S3.compareTo(S1)<0&&S3.compareTo(S2)<0){
        System.out.println(S3);
        if(S1.compareTo(S2)<0){
                System.out.println(S1);
    System.out.println(S2);
        }else{
            System.out.println(S2);
        System.out.println(S1);
        }
    }

    

    
}


}

