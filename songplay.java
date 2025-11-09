package Java_Private;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class songplay {

    // Xóa màn hình (console hỗ trợ ANSI)
    public static void clearScreen() {
        System.out.print("\033[2J\033[H");
        System.out.flush();
    }

    // Hàm phát nhạc WAV
    public static void playMusic(String filePath) {
        try {
            File file = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("🎵 Đang phát: " + file.getName());

            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.close();
            audioStream.close();
        } catch (Exception e) {
            System.out.println("Không phát được nhạc: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String[] songs = {
                "D:\\buongdoitaynhaura.wav",
                "D:\\thangdien.wav",
                "D:\\laviai.wav",
                "D:\\pickleball.wav",
                "D:\\2323.wav",
                "D:\\t9.wav",
                "D:\\anhmuonnhinthayem.wav"
        };

        String[] titles = {
                "1. Buông đôi tay nhau ra - Sơn Tùng MTP",
                "2. Thằng điên - JustaTee",
                "3. LAVIAI - Wxrdie x HIEUTHUHAI",
                "4. Pickleball - Đỗ Phú Quí",
                "5. 2323 - MCK",
                "6. T9 - Thiên Ngự Nguyên",
                "7. Anh muốn nhìn thấy em - Dangrangto & The Wind"
        };

        System.out.println("🎶 Danh sách bài hát:");
        for (String title : titles) {
            System.out.println(title);
        }
        System.out.println("\n👉 Bắt đầu quay trong 3 giây...");
        Thread.sleep(3000);

        int pos = 0;
        long start = System.currentTimeMillis();
        int duration = 5000; // chạy vòng quay trong 5 giây

        // Hiệu ứng quay vòng
        while (System.currentTimeMillis() - start < duration) {
            pos++;
            if (pos > 7) pos = 1;

            clearScreen();
            for (int i = 1; i <= 7; i++) {
                if (i == pos) {
                    System.out.print("[" + i + "] ");
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            Thread.sleep(200);
        }

        // Random kết quả cuối
        int result = (int) (Math.random() * 7) + 1;

        clearScreen();
        System.out.println("🎯 Kết quả: " + result);
        System.out.println("Phát bài hát: " + titles[result - 1]);

        // Phát nhạc
        playMusic(songs[result - 1]);
    }
}

