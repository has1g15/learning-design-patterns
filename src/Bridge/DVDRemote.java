package Bridge;

public class DVDRemote extends RemoteButton {

    public DVDRemote(DVDDevice dvdDevice) {
        super(dvdDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("Stop disc");
    }
}
