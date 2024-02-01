public class Pattern1 {
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
            System.out.print("*");
            helper(rows,columns+1);
        } else{
            System.out.println("");
            helper(rows-1,0);
        }
    }
}
