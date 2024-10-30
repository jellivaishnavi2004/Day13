//The == operator compares references not values


class Teststringcomparision2{
public static void main(String args[]){
String s1="Dhoni";
String s2="Dhoni";
String s3=new String("Dhoni");

System.out.println(s1==s2);

System.out.println(s1==s3);

}
}