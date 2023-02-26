public class StereoDemo {
    public static void main(String[] args) {
        Stereo stereo = new Stereo();

        stereo.setVolume(100);

        stereo.setVolumeLeft(49);

        stereo.setVolumeRight(51);
        System.out.println(stereo.toString());

        stereo.setMute(0);
        System.out.println(stereo.toString());

        stereo.setUnmute(stereo.oldVolume);
        System.out.println(stereo.toString());

    }
}
