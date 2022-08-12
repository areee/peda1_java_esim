/*
Ohjelma selvittää yksinkertaisella (mutta erittäin tehottomalla) tavalla kahden desimaalin tarkkuudella pisteen,
jonka etäisyyksien summa mielivaltaisen kolmion kulmista on mahdollisimman pieni.

Toisin sanottuna koodi ratkaisee esimerkinomaisesti yhden eksaktin tapauksen.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("**PEDA1 – Projektityö**");

        //mielivaltaisesti valitut kolmion kulmien kordinaatit
        double ax = 0;
        double ay = 0;
        double bx = 4;
        double by = 0;
        double cx = 1;
        double cy = 2;
        //selvitettävä piste
        double fx = 0;
        double fy = 0;
        //vertailua varten tarvittavat muuttujat
        double pieninPituus = 0;
        double pituus = 0;

        //selvitetään piste kahdella sisäkkäisellä luupilla (vrt. kaksiulotteinen taso)
        //ulompi luuppi käy läpi kaikki "mielekkäät" x-kordinaatit ja sisempi y-kordinaatit
        for (double x = 0; x < 4; x = x + 0.01) {
            for (double y = 0; y < 2; y = y + 0.01) {

                //tutkittavan pisteen etäisyys mielivaltaisesti valituista kolmion kulmista
                double pituusA = Math.sqrt(Math.pow((x - ax), 2) + Math.pow((y - ay), 2));
                double pituusB = Math.sqrt(Math.pow((x - bx), 2) + Math.pow((y - by), 2));
                double pituusC = Math.sqrt(Math.pow((x - cx), 2) + Math.pow((y - cy), 2));

                //etäisyyksien summa
                pituus = pituusA + pituusB + pituusC;

                //jos löytyy aiempaa parempi ratkaisu, otetaan sen arvot talteen
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
