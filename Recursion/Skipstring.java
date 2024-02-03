public class Skipstring {
    public static void main(String[] args){
        String a="ababaccapplecac";
        System.out.println(skipstr("ababaccapplecac"));
    }
    static String skipstr(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        if(unprocessed.startsWith("apple")){
            return skipstr(unprocessed.substring(5));
        }
        else{
            return unprocessed.charAt(0)+skipstr(unprocessed.substring(1));
        }
    }
}
