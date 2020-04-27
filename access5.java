class access5{
static int y=98;
void m1(){
System.out.println("Instance method");
}
public static void main(String[]args){
access5 b=new access5();
System.out.println(access5.y);
b.m1();
}
}