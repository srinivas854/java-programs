class Access{
int x=12;
void m1(){
System.out.println("instance method");
}
void m2(){
System.out.println(a.x);
m1();
}
public static void main(String[]args){
Access a1=new Access1();

a1.m2();
}
}