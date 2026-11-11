public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int max_q = Integer.parseInt(args[0]) * 2 - 1;
        for(double q = 1, sgn = 1;q <= max_q;q += 2, sgn = - sgn){
            approxPi += sgn / q;
        }
        approxPi *= 4.0;
        System.out.println(approxPi + " " + actualPi);
    }
}
