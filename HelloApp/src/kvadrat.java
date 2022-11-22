import java.util.Scanner;

public class kvadrat {
    public static void main(String[] args) {
        int a=vvod("Введите сторону А:");
        int b=vvod("Введите сторону B:");
        int[][][][] massss=new int[4][5][3][6];

        char[][] mas=massiv2D(a,b);
        vivod(mas);

    }
    static void vivod(char[][] mas){
        for (int i=0;i<mas[1].length;i++){
            for (int j=0;j< mas.length;j++){
                System.out.print(mas[j][i]);
            }
            System.out.println();
        }
    }
    static int vvod(String a){
        Scanner in=new Scanner(System.in);
        System.out.print(a);
        int s= in.nextInt();
        return s;
    }
    static char[][] massiv2D(int a, int b){
        char[][] mas=new char[a+2][b+2];
        mas[0][0]='+';
        mas[a+1][0]='+';
        mas[0][b+1]='+';
        mas[a+1][b+1]='+';
        for (int i=1;i<=a;i++){
            mas[i][0]='-';
        }
        for (int i=1;i<=a;i++){
            mas[i][b+1]='-';
        }
        for (int i=1;i<=b;i++){
            mas[0][i]='|';
            mas[a+1][i]='|';
        }
        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
                mas[i][j]=' ';
            }

        }
        return mas;
    }
}
