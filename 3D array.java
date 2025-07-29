import java.util.Scanner;
public class arr{
        public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                System.out.println("enter the no.of schools");
                int n1=scan.nextInt();
                System.out.println("enter the no.of classes");
                int n2=scan.nextInt();
                System.out.println("enter the no.of students");
                int n3=scan.nextInt();
                int[][][] a=new int[n1][n2][n3];
                //stored
                //schools
                for(int i=0;i<n1;i++){
                //classes
                for(int j=0;j<n2;j++){
                        //students
                        for(int k=0;k<n3;k++){
                        System.out.println("enter the age of"+(i+1)+" schools " +(j+1)+ "classes"+(k+1)+"students");
                        a[i][j][k]=scan.nextInt();
                        }
                }
                }
                //print
                for(int i=0;i<n1;i++){
                //classes
                for(int j=0;j<n2;j++){
                        //students
                        for(int k=0;k<n3;k++){
                        System.out.println(a[i][j][k]+" ");
                        }
                }
"arr.java" 36L, 886B                                  