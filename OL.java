class OL{
public void m1(){//INSTANCE METHOD
System.out.println("no-arg");
}
public void m1(int x){
System.out.println("int arg");
}
public void m1(String s){
System.out.println("String arg");
}
public static void main(String[]bgs){
OL L=new OL();
L.m1();
L.m1(15);
L.m1(" bbb");
}
}
