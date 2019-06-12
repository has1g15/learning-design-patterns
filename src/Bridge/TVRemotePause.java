package Bridge;

public class TVRemotePause extends RemoteButton{

    public TVRemotePause(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused");
    }
}
