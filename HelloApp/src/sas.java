import java.util.Arrays;

public class sas {
    public static void main(String[] args) {
         String badCash = ("badWord badWord badWord");
         String[] badCashToArray = badCash.split(" ");
        System.out.println(badCashToArray);
        badCashToArray[0]="few";
        System.out.println(badCashToArray);
        System.out.println(Arrays.toString(badCashToArray) +" "+ badCashToArray.length);
         badCash = "badWord badWord badWord dsfAWFEW";
         badCashToArray = badCash.split(" ");
        System.out.println(badCashToArray);
        System.out.println(Arrays.toString(badCashToArray)+" "+ badCashToArray.length);

        badCash = "badWord badWord badWord 11111111";
         badCashToArray = badCash.split(" ");
        System.out.println(badCashToArray);
         System.out.println(Arrays.toString(badCashToArray)+" "+ badCashToArray.length);



/*
         String[] massiv={"213", "4213", "214", "241"};
         massiv={"213","213","21","421"};
*/
        int[] i=new int[4];
        System.out.println(i.length);
        i=mass(i,7);
        System.out.println(Arrays.toString(i));
        i=mass(i,10);
        System.out.println(Arrays.toString(i));

    }
    static int[]  mass(int[] mass, int n){
        int[] maas=new int[n];
        for (int j=0;j<n;j++){maas[j]=j;}
        System.out.println(Arrays.toString(maas));
        return maas;
    }
}
