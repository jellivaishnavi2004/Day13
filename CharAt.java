import java.util.*;
class CharAtExample
{
ArrayList<Character>al;
CharAtExample()
{
al=new ArrayList<Character>();
al.add('A');
al.add('E');
al.add('I');
al.add('O');
al.add('U');
al.add('a');
al.add('e');
al.add('i');
al.add('o');
al.add('u');
}
private boolean isVowel(char c)
{
for(int i=0;i<al.size();i++)
{
if(c==al.get(i))
{
return true;
}
}
return false;
}
public int countVowels(String s)
{
int countVowel=0;
int size=s.length();
for(int j=0;j<size;j++)
{
char c=s.charAt(j);
if(isVowel(c))
{
countVowel=countVowel+1;
}
}
return countVowel;
}
public static void main(String args[]){
CharAtExample obj=new CharAtExample();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int noOfVowel=obj.countVowels(str);
System.out.println("String:"+str);
System.out.println("Total no.of vowels in the String are:"+noOfVowel+"\n");
}
}