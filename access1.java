class access1{
int x=12;
void m1(){
System.out.println("instance method");
}
class access{
void m2(){
access1 a=new access1();
System.out.println(a.x);
a.m1();
}
public static void main(String[]args){
access1 a1=new access();
a1.m2();
}
}