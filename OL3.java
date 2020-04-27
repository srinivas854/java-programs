class OL3{
//constructor method
OL3(){
System.out.println("zero arg");
}
OL3(int x){
System.out.println("int arg");
}
OL3(double x){
System.out.println("double arg");
}
public static void main(String[]bbb){
OL3 l=new OL3(22);
OL3 l1=new OL3(22.333);
OL3 l2=new OL3();
}
}
