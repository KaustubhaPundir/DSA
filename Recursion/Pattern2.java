public class Pattern2 {
    public static void main(String[] args) {
        int target = 4;
        pattern(target);
    }
    static void pattern(int rows){
        helper(rows,0);
    }
    static void helper(int rows,int columns){
        if(rows==0){
            return;
        }
        if(columns<rows){
            helper(rows,columns+1);
            System.out.print("*");
        } else{
            helper(rows-1,0);
            System.out.println("");
        }
    }
}
