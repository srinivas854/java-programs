class OL1{
static void m1(){
System.out.println("no arg");
}
static void m1(int x){
System.out.println("int arg");
}
static void m1(float x){
System.out.println("flot arg");
}
public static void main(String[]args){
//static method there is no need to create object
m1(25.3f);
m1();
m1(25);
}
}