package Bridge;

public abstract class RemoteButton {

    EntertainmentDevice entertainmentDevice;

    public RemoteButton(EntertainmentDevice entertainmentDevice) {
        this.entertainmentDevice = entertainmentDevice;
    }

    public void buttonFivePressed() {
        entertainmentDevice.buttonFivePressed();
    }

    public void buttonSixPressed() {
        entertainmentDevice.buttonSixPressed();
    }

    public void deviceFeedback() {
        entertainmentDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();
}
