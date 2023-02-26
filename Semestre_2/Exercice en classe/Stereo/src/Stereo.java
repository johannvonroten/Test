public class Stereo {
    int  volume, VolumeLeft, VolumeRight, mute, unmute, oldVolume;

    public void setVolume(int newVolume) {
        volume = newVolume;
        oldVolume = volume;

    }

    public void setVolumeLeft(int newVolumeLeft) {
        VolumeLeft = newVolumeLeft;
    }

    public void setVolumeRight(int newVolumeRight) {
        VolumeRight = newVolumeRight;
    }

    public void setMute(int newMute) {
        setVolume(0);
        mute = newMute;
    }

    public void setUnmute(int newUnmute) {
        unmute = newUnmute;
    }

    public int getVolume() {
        return volume;
    }

    public int getVolumeLeft() {
        return VolumeLeft;
    }

    public int getVolumeRight() {
        return VolumeRight;
    }

    public int getMute() {
        return mute;
    }

    public int getUnmute() {
        return unmute;
    }

    public String toString() {
        return "Volume: " + volume + " VolumeLeft: " + VolumeLeft + " VolumeRight: " + VolumeRight;
    }

}
