class access2{
static int y=98;//static variable
static void m2(){
System.out.println("static method");
}
void m1(){
System.out.println(y);
}
//both r in same class
public static void main(String[]args){
access2 b=new access2();
b.m2();
b.m1();
}
}
