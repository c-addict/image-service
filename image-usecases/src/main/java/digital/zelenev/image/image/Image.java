package digital.zelenev.image.image;

public class Image {

    private byte[] image;

    public Image(byte[] image) {
        this.image = image;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
