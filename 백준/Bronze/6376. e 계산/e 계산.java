public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("n e").append('\n').append("- -----------").append('\n');
        sb.append("0 1").append('\n').append("1 2").append('\n').append("2 2.5");
        System.out.println(sb);

        double fac = 2;
        double a = 2;
        double result = 2.5;

        for (int i = 0; i < 7; i++) {
            fac++;
            a *= fac;
            result += (double) 1 / a;
            System.out.printf("%.0f %.9f\n", fac, result);
        }
    }
}