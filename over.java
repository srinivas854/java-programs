class P{
public void property(){
System.out.println("csh+gold");
}
public void marry(){
System.out.println("subbu");
}
}
class C extends P{
public void marry(){
System.out.println("sureka");
}
}
class over{
public static void main(String[]bb){
P p=new P();
p.marry();
C c=new C();
c.marry();
P p1=new C();
p1.marry();
}
}