public class Schet {
    public String  name;
    public int count;

    public Schet(String name,int count){
        this.name=name;
        this.count=count;
    }
    public Schet(String name){
        this.name=name;
        this.count=0;
    }
    public void plus(){
        this.count++;
    }
    public void minus(){
        this.count--;
    }
    public void value(int value){
        this.count+=value;
    }
}
