class Student2{
private String name;
private int age;
private String getName()
{
return this.name;
}
private int getAge()
{
return this.age;
}
private void setName(String name)
{
if(name.length()>0)
this.name=name;
else
System.out.println("Name cannot be empty");
}
private void setAge(int age)
{
this.age=age;
}
public void display()
{
System.out.println(getName()+","+getAge());
}
public void inputStudent2Details(String n,int a)
{
setName(n);
setAge(a);
}
}
class Test{
public static void main(String args[]){
Student2 obs1=new Student2();
obs1.inputStudent2Details("pawan",19);
Student2 obs2=new Student2();
obs2.inputStudent2Details("",18);
obs2.display();
}
}

