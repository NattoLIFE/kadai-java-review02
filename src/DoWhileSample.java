
public class DoWhileSample {

    public static void main(String[] args) {
        int num = 1; // 初期値設定

        // 繰り返しの条件（numが1024より小さい間）
        do {
            num = num * 2;
            System.out.println(num);
        } while (num < 1024);
        }
    }
