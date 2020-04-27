class Ranker2 {
int roolno;
String name;
static String college="SRi";
Ranker2(int r,String n){
	roolno =r;
	name =n;
	
}
static void change(){
college="VVV";
}
void disply(){
	System.out.println(roolno+"  "+name+"  "+college);
}
public static void main(String[]args){
Ranker2.change();
	Ranker2 r1=new Ranker2(111,"rrr");
	Ranker2 r2=new Ranker2(112,"ggg");
	r1.disply();
	r2.disply();
}
}