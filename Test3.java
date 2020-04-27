abstract class parent
{
parent()
{
System.out.println(this.hashCode());

}
}
class child extends parent
{
child()
{
System.out.println(this.hashCode());
}
}
class Test3
{
public static void main(String[]args)
{
child c=new child();
System.out.println(c.hashCode());
}
}