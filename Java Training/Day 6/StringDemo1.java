

public class StringDemo1 {
    public static void main(String[] args) {
        String a="My world My life";
        //indexOf()
        System.out.println(a.indexOf("W"));
        //indexOf(start,FromIndex)
        System.out.println(a.indexOf("M",5));
        //LastIndex()
        System.out.println(a.lastIndexOf("y"));
        //substring(startindex,endindex-1)
        String str="My world";
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,5));
        //charAt(index)
        String st="My programming world";
        System.out.println(st.charAt(5));
        //substring()
        String b="My life my rules";
        System.out.println(b.subSequence(0,4));
    }
}
