class OR{
void msg(){
System.out.println("parent cls");
}
}
class demo extends OR{
void msg(int x){
System.out.println("child cls");
}
public static void main(String[]bhs){
demo d=new demo();
d.msg(4);

}
}