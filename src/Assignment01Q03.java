public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
    
        int numOdd = 0;
        for (int i = 0, curr = 1, next = 1; i < x; i++) {
            System.out.print(curr);
            if(curr % 2 == 1){
                numOdd++;
            }
            if (i < x - 1) 
                System.out.print(" ");
            next += curr;
            curr = next - curr;            
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
