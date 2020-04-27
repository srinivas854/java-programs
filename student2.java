class student2{
int roolno;
String name;
static String college="SRINIVAS";
static String branch="ECE";
student2(int r,String n){
roolno=r;
name=n;
}
static void fig(){
college="SSSSS";
}
void disply(){
System.out.println("name"+name+" "+roolno+"  "+college+"  "+branch);
}
public static void main(String[]args){
student2.fig();
student2 s1=new student2(111,"psv");
student2 s2=new student2(112,"ysr");
s1.disply();
s2.disply();
}
}