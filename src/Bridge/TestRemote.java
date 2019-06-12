package Bridge;

public class TestRemote {

    public static void main(String[] args) {
        RemoteButton tv1 = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton tv2 = new TVRemotePause(new TVDevice(1, 200));

        RemoteButton dvd = new DVDRemote(new DVDDevice(1, 14));

        System.out.println("Test TV with Mute");
        tv1.buttonFivePressed();
        tv1.buttonSixPressed();
        tv1.buttonNinePressed();

        System.out.println("Test TV with Pause");
        tv2.buttonFivePressed();
        tv2.buttonSixPressed();
        tv2.buttonNinePressed();
        tv2.deviceFeedback();

        System.out.println("Test DVD");
        dvd.buttonFivePressed();
        dvd.buttonSixPressed();
        dvd.buttonNinePressed();
    }
}
