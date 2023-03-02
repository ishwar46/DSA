package Threading;


class downloadImage{
    void download() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Downloading image " + i+ ".jpg");
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        for (int i = 0; i < 10; i++) {
            System.out.println("Downloading image " + i + ".jpg");
        }

        downloadImage image = new downloadImage();
        image.download();
        System.out.println("Main thread ended");


    }
}
