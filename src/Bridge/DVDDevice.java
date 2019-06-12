package Bridge;

public class DVDDevice extends EntertainmentDevice{

    public DVDDevice(int deviceState, int maxSetting) {
        this.deviceState = deviceState;
        this.maxSetting = maxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Rewind disc");
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Fast forward disc");
    }
}
