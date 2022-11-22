public class Zadazch8_1 {
    public static void main(String[] args) {
        int max=100;
        Schet countChet=new Schet("Четные",0);
        Schet countNoChet=new Schet("Нечетные",0);
        for (int i =1;i<=max;i++){
            if (i%2==0) {
                countChet.plus();
            }
            else {
                countNoChet.plus();
            }
        }

        System.out.println(countChet.name+": "+countChet.count);
        System.out.println(countNoChet.name+": "+countNoChet.count);
    }
}
