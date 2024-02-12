public class Permutation_string {
    public static void main(String[] args) {
        String string=new String("kaustubha");
        subseq(string);
    }
    static void subseq(String string) {
        helper(string, "");
    }
    static void helper(String unproc, String proc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch=unproc.charAt(0);
        helper(unproc.substring(1),proc+ch);
        helper(unproc.substring(1),proc);
    }
}
