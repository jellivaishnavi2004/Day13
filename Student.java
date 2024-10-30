class Student{
public int id;
public String name;
}
class Test{
public static void main(String args[]){
Student ob=new Student();
System.out.println(ob.id+" "+ob.name);
ob.id=543;
ob.name="vaishu";
System.out.println(ob.id+" "+ob.name);
}
}