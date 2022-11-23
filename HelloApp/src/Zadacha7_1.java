import java.util.Scanner;

public class Zadacha7_1 {
    public static void main(String[] args) {
        System.out.println(sliyanie("fwer","fwfrewwr","4rf23f","34qfqewf"));

    }
/*
    static String[] vvod(){
        Scanner in=new Scanner(System.in);
        System.out.print("Введите строку:");
        
    }
*/
    static String sliyanie(String ...stroka){
        String ooo="";
        for (String x:stroka) {
            ooo+=" "+x;
        }
        return ooo;
    }
}
