public class Ranker1 {
int roolno;
String name;
static String college="SRi";
Ranker(int r,String n){
	roolno =r;
	name =n;
	
}
void disply(){
	System.out.println(name+"  "+roolno+"  "+college);
}
public static void main(String[]args){
	Ranker1 r1=new Ranker(111,"rrr");
	Ranker1 r2=new Ranker(112,"ggg");
	r1.disply();
	r2.disply();
}
}
