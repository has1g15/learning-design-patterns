package Bridge;

public class TVRemoteMute extends RemoteButton{

    public TVRemoteMute(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was muted");
    }
}
