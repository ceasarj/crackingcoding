package chapter1.arrayandstrings;

/**
 * Created by ceejay562 on 9/14/2016.
 */
public class Problem6 {

    public static void main(String[] arg){
        String a = "a";
        System.out.println(compressString(a));
        System.out.println(compressString("aa"));
        System.out.println(compressString("aabbccddee"));
        System.out.println(compressString("aaaabbbccddeee"));
    }

    public static String compressString(String val){
        StringBuilder sb = new StringBuilder();
        if(val.length() <= 2) return val;
        char store = val.charAt(0);
        int counter = 1;
        for(int i=1; i<val.length(); i++){
            if(i == (val.length() - 1)){
                sb.append(store);
                sb.append(counter);
            }else if(store == val.charAt(i)){
                counter++;
            } else {
                sb.append(store);
                sb.append(counter);
                counter = 1;
                store = val.charAt(i);
            }
        }
        if(sb.toString().length() >= val.length())
            return val;
        else
            return sb.toString();
    }

    public static boolean isCompressedLesser(String s){
        char store = s.charAt(0);

        for(int i=0; i<s.length() -2; i++){

        }
        return false;
    }

}
