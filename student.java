class Student{
int roolno;
String name;
static String college="PPP";
Student(int r,String n){
roolno =r;
name=n;
}
static void change(){
college="GOVT";
}
void disply(){
System.out.println(roolno+" "+name+" "+college);
}
public static void main(String[]args){
Student.change();
Student s1=new Student(111,"rrr");
Student s2=new Student(112,"rrrp");
s1.disply();
s2.disply();
}
}