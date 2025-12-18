public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        int end=sb.length()-1;
        while(end>=0){
            while(end>=0&&sb.charAt(end)!=' '){
                end--;
            }
            int start=end;
            while(start>=0&&sb.charAt(start)!=' '){
                start--;
            }
            sb.append(sb.substring(start+1,end+1)).append(" ");
            end=start-1;
        }
        System.out.println(sb.toString().trim());
    }
}
