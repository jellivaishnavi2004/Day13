class Teststringcomparision{
public static void main(String args[]){
String s1="Dhoni";
String s2="Dhoni";
String s3=new String ("DHoni");
String s4="Jaddu";
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.equals(s4));
}
}