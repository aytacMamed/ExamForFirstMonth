import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int eded=sc.nextInt();
        System.out.println("Ededin reqemleri sayi: "+sumDigit(eded));
    }

    public  static  int sumDigit(int eded){
        int count=0;
        while (eded!=0){

          eded=eded/10;
            count++;
        }
        return count;
    }
}
