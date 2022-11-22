public class Zadazcha7_2 {
    public static void main(String[] args) {
        int a = 2147483640;
        int b = 2147483640;
        System.out.println(summa(a, b));
    }

    static boolean summa(boolean... args) {   //false/true
        boolean a = true;
        for (boolean i : args) {
            a = a && i;
        }
        return a;
    }

    static byte summa(byte... args) { //-128 до 127
        byte a = 0;
        for (byte i : args) {
            if ((i>(127-a))||(i<(-128-a))){
                System.out.println("ПОТЕРЯ ТОЧНОСТИ!!!!! На данном этапе сумма:"+(a+i));
            }
            else a += i;
        }
        return a;
    }

    static short summa(short... args) { //-32768 до 32767
        short a = 0;
        for (short i : args) {
            if ((i>(32767-a))||(i<(-32768-a))){
                System.out.println("ПОТЕРЯ ТОЧНОСТИ!!!!! На данном этапе сумма:"+(a+i));
            }
            else a += i;
        }
        return a;
    }

    static int summa(int... args) { //-2147483648 до 2147483647
        int a = 0;
        for (int i : args) {
            if ((i>(2147483647-a))||(i<(-2147483648-a))){
                System.out.println("ПОТЕРЯ ТОЧНОСТИ!!!!! На данном этапе сумма:"+((long)a+i));
            }
            else a += i;
        }
        return a;
    }

    static double summa(double... args) { // ±4.9*10-324 до ±1.7976931348623157*10308
        double a = 0;
        for (double i : args) {
            a += i;
        }
        return a;
    }

    static long summa(long... args) { //–9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
        long a = 0;
        for (long i : args) {
            a += i;
        }
        return a;
    }

    static float summa(float... args) { //-3.4*1038 до 3.4*1038
        float a = 0;
        for (float i : args) {
            a += i;
        }
        return a;
    }

    static String summa(String... args) { //сложение строк
        String a = "";
        for (String i : args) {
            a += " " + i;
        }
        return a;
    }

    static String summa(char... args) { //сложение символов в строку
        String a = "";
        for (char i : args) {
            a += i;
        }
        return a;
    }
  /*  static boolean summa(boolean ...args){
        boolean a;
        for (boolean i:args) {
       //     a=a&&i;
        }
        return a;
    }*/
}
