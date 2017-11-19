
public class Main {

    public static void main(String[] args) {
        System.out.println("**PEDA1 – Projektityö**");

        double ax = 0;
        double ay = 0;
        double bx = 4;
        double by = 0;
        double cx = 1;
        double cy = 2;
        double fx = 0;
        double fy = 0;
        double pieninPituus = 0;
        double pituus = 0;

        for (double x = 0; x < 4; x = x + 0.01) {
            for (double y = 0; y < 2; y = y + 0.01) {

                double pituusA = Math.sqrt(Math.pow((x - ax), 2) + Math.pow((y - ay), 2));
                double pituusB = Math.sqrt(Math.pow((x - bx), 2) + Math.pow((y - by), 2));
                double pituusC = Math.sqrt(Math.pow((x - cx), 2) + Math.pow((y - cy), 2));

                pituus = pituusA + pituusB + pituusC;

                if ((x == 0 && y == 0) || pituus < pieninPituus) {
                    pieninPituus = pituus;
                    fx = x;
                    fy = y;
                }
            }
        }
        System.out.println("Pienin pituus: " + pieninPituus);
        System.out.println("Pituus: " + pituus);
        System.out.println("Fx: " + fx);
        System.out.println("Fy: " + fy);
    }
}
