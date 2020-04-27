class student3{
int roolno;
String name;
String branch;
student3(int r,String n){
roolno=r;
name=n;
System.out.println("1st constr");
System.out.println("name:"+name+" "+roolno);
}
student3(String b){
branch=b;
System.out.println("2d constr");
System.out.println("branch:"+branch);
}
student3(int r,String n,String b){
roolno=r;
name=n;
branch=b;
System.out.println("3rd constr");
System.out.println(name+" "+roolno+" "+branch);
}
public static void main(String[]args){
student3 s1=new student3(111,"sri","ece");
student3 s2=new student3(112,"sriii");
student3 s3=new student3("ece");
}
}