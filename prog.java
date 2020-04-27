class employee{
float salary=40000;
}
class prog extends employee{
float comm=10000;
public static void main(String[]args)
{
prog p=new prog();
System.out.println("sum:"+(p.salary+p.comm));
}
}