import java.util.Scanner;

public class loop {
    public static void main(String[] argS) {
        Scanner sc =new Scanner(System.in);
        System.out.print("ENter the number");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
               System.out.print("#");
            }
            System.out.println();
        }
            
for(int k=number;k>0;k--){
    for(int l=1;l<k;l++){
System.out.print("#");
    }
    System.out.println();
}
    }

}



       