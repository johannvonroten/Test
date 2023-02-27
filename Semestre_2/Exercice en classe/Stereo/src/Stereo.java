public class Stereo {
    int  volume, VolumeLeft, VolumeRight, mute, unmute, oldVolume;

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    public void setVolumeLeft(int newVolumeLeft) {
        VolumeLeft = newVolumeLeft;
    }

    public void setVolumeRight(int newVolumeRight) {
        VolumeRight = newVolumeRight;
    }

    public void setMute() {
        oldVolume = volume;
        volume=0;
    }

    public void setUnmute() {
        volume = oldVolume;
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
