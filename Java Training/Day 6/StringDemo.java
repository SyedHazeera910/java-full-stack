

public class StringDemo {
    public static void main(String[] args) {
        String str=new String("RAJU");
        System.out.println(str);
        //length()
        System.out.println(str.length());
        //isBlank()
        String s1=" ";
        System.out.println(s1.isBlank());
        //isEmpty()
        String s2="";
        System.out.println(s2.isEmpty());
        //equals()
        String ss1="abc";
        String ss2="abcd";
        System.out.println(ss1.equals(ss2));
        //equalsIsIgnorecase()
        String str1="abc";
        String str2="Abc";
        System.out.println(str1.equalsIgnoreCase(str2));
        //compareTo()
        String st1="Abc";
        String st2="abc";
        System.out.println(st1.compareTo(st2));
        //startWith()
        String a="Hello World";
        System.out.println(a.startsWith("ello"));
        //startWith(prefix,fromIndex)
        System.out.println(a.startsWith("W",6));
        //endsWith()
        String b="Programming";
        System.out.println(b.endsWith("ing"));
        //contentequals()
        String c="Hello";
        System.out.println(c.contentEquals("Hello"));
        //contains()
        String d="My first java program";
        System.out.println(d.contains("java"));
        }
}
