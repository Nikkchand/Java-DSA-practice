public class getset {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setcolor("Red");
        System.out.println(p1.getcolor());
        p1.setTip(8);
        System.out.println(p1.getTip());
    }
}
class Pen {
    private String color;
    private int tip;

String getcolor(){
        return this.color;
    }
int getTip(){
    return this.tip;
} 

void setcolor(String newcolor){  //Aise v set kar skte hy ya niche tip k jaise jisme dusra variable bnane ki jrurt hi nhi hy
    this.color=newcolor;
}

void setTip(int tip){ //same variable tip bna skte hy kyuki "this" keyword current object ko refer krta hy
    this.tip = tip;
}
}

