import java.util.Scanner;

public class StepsCounter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        int steps=numberofsteps(num);
        System.out.println("steps = " + steps);
    }
    //Recursive program to find the number of steps to turn a number to zero 
    //if number is even simply divide by 2 repass it, considered as one step
    //if number is zero , subtract 1 from the number and repass it, considered as one step
    //Leetcode problem
    static int helper(int num, int steps){
        if(num==0){
            return steps;
        }
        if (num%2==0){
            steps++;
            return helper(num/2,steps);
        }
        if (num%2!=0){
            steps++;
            return helper(num-1,steps);
        }
        return steps;
    }
    //we use helper function because we cant tell the user to enter 0 as the argument for steps that will not be a good practice
    static int numberofsteps(int num){
        return helper(num,0);
    }
}
