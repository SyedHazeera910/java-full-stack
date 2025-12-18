public class StringDemo2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        StringBuilder sb1= new StringBuilder("World");
        //sb1+="hello";
        sb1.append("hello");
        System.out.println(sb1);
        //convert String Bublider->String
        String s1=new String(sb1);
        System.out.println(sb1.toString());
        //insert()
        StringBuilder sb2=new StringBuilder("welcome");
        sb2.insert(0,"hello");
        System.out.println(sb2);
        //reverse()
        StringBuilder sb3=new StringBuilder("Hello");
        System.out.println(sb3.reverse());
        //deletecharAt()
        System.out.println(sb3.deleteCharAt(0));
        //replace()
        System.out.println(sb3.replace(0,3,s1));
        //hashcode()
        System.out.println(sb3.hashCode());
    }
}
