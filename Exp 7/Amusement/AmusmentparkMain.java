import java.util.*;
public class AmusmentparkMain {
    public static void main(String[] args){
        System.out.println("enter the park you want go \n 1)imagica \n 2)EsselWorld");
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();

        if(z==1){
            Imagica I=new Imagica();
            System.out.println("enter the number of people coming");
            int n=sc.nextInt();
            int []p=new int[n];
            int []age=new int[n];
            for(int i=0;i<n;i++){
            System.out.println("enter the age of"+(i+1));
                age[i]=sc.nextInt();
            }
            double totalcost=I.getcost(p,age);
            System.out.println("TotalCost="+totalcost);
        }
        else if(z==2){
            Esselworld I=new Esselworld();
            System.out.println("enter the number of people coming");
            int n=sc.nextInt();
            int []p=new int[n];
            int []age=new int[n];
            for(int i=0;i<n;i++){
            System.out.println("enter the age of"+(i+1));
                age[i]=sc.nextInt();
            }
            double totalcost=I.getcost(p,age);
            System.out.println("TotalCost="+totalcost);
        }
    }
    
}
