class Test2{
Test2(double d)
{
this(10);
System.out.println("double-argumet constructor");
}
Test2(int i)
{
this();
System.out.println("int-argumet constructor");
}
Test2()
{
System.out.println("no-argumet constructor");
}
public static void main(String[]args)
{
Test2 t1=new Test2(11.3);

}
}