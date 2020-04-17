public class UniformRandomNumbers {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        double max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
        double average = (a + b + c + d + e) / 5;
        System.out.println("The average is: " + average + ". The minimum is: " + min + ". The maximum is: " + max + ".");
    }
}
