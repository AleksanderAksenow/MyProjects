public class ffff {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.doSth();        //OK
        subClass.doSth2();       //OK

/*
        SuperClass subClass1 = new SubClass();
        subClass1.doSth();        //OK
        subClass1.doSth2();       //Ошибка компиляции

        SuperClass subClass2 = new SubClass();
        SubClass castedSubClass = (SubClass) subClass2;

        subClass2.doSth();        //OK
        subClass2.doSth2();       //OK - не ок
        castedSubClass.doSth();    //ok
        castedSubClass.doSth2();  //ok
*/

}}
 class SuperClass {
    public void doSth() {
        //sth logic
    }
}

 class SubClass extends SuperClass {
    public void doSth2() {
        //sth logic
    }
}

