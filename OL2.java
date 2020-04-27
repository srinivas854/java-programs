class OL2{//main method
public static void main(int[]args){
System.out.println("int array");
}
public static void main(int args){
System.out.println("int arg");
}
public static void main(String[]args){
main(12);
main(new int[]{4,5,6});
}
}