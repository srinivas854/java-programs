class access3{
static int y=97;
static void m1(){
System.out.println("static");
}
class access4{
void m2(){
access3 b=new access3();
System.out.println(access3.y);
b.m1();
}
}
public static void main(String[]args){
 access4 b1=new access4();
b1.m2();
}
}
