public class Snail {
    public static void main(String[] args){
        System.out.println("Hello Bro!");
        totalDistance(0.2,0.4, 100);
    }

    static void totalDistance(double heightStair, double lengthStair, double total){

        System.out.println((total / heightStair) *(lengthStair + heightStair ));
    }

}
