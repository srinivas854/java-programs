class OL{
//OVERLOADING IS APPLICABLE CHILD CLASS 
void disply(){
System.out.println("parent class");
}
}
class OL4 extends OL{
void disply(int x){
System.out.println("child class");
}
public static void main(String[]bgs){
OL4 L=new OL4();
L.disply();
L.disply(4);
}
}