package ra;

public abstract class VideoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("đây là video đang chạy...........");
    }
}
