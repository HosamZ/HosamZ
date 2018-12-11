package week6JAVA.ex1;

public class HotAirBalloonApplication {
    public static void main(String[] args) {
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("small Balloon--");
        smallBalloon.liftUp();
        smallBalloon.land();
        System.out.println("big balloon--");
        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        bigBalloon.liftUp();
        bigBalloon.land();
        HotAirBalloon small = new SmallHotAirBalloon();
        HotAirBalloon big = new BigHotAirBalloon();
        System.out.println("Small--");
        small.liftUp();
        small.land();
        System.out.println("Big--");
        big.liftUp();
        big.land();
    }
}
