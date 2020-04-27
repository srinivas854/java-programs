class add{
int b=15,c=25;
void add(){
System.out.println(b+c);
}
}
class sub extends add{
void sub(){
System.out.println(b-c);
}
}
class mul extends sub{
void mul(){
System.out.println(b*c);
}
}
class div extends mul{
void div(){
System.out.println(b/c);
}
}
class Inheritance{
public static void main(String[]args){
div d=new div();
d.add();
d.sub();
d.mul();
d.div();
}
}