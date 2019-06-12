package Bridge;

public class TVDevice extends EntertainmentDevice{

    public TVDevice(int deviceState, int maxSetting) {
        this.deviceState = deviceState;
        this.maxSetting = maxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Channel down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel up");
        deviceState++;
    }
}
