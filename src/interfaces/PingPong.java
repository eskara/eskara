package interfaces;

public class PingPong implements Sport,CampusFriendly{
    @Override
    public void practice() {
        System.out.println("Ping Pong practice - during class break");
    }

    @Override
    public void compete(String type) {
        System.out.println("Ping Pong competition - "+type);
    }

    @Override
    public void installIndoors() {

    }
}
