package chap6;

class Coin {
    int side; 

    public void flip() {
        side = (int) (Math.random() * 2); 
    }
}

public class Test6 {
    public static void main(String[] args) {
        Coin myCoin = new Coin();
        Coin youCoin = new Coin();

        int myStreak = 0;   
        int youStreak = 0;  

        System.out.println("myCoin\tyouCoin");

        while (true) {
            myCoin.flip();
            youCoin.flip();

            System.out.println((myCoin.side == 0 ? " 앞면" : " 뒷면") + "\t" + (youCoin.side == 0 ? " 앞면" : " 뒷면"));

            if (myCoin.side == 0) {
                myStreak++;
            } else {
                myStreak = 0; 
            }
            if (youCoin.side == 0) {
                youStreak++;
            } else {
                youStreak = 0; 
            }
            if (myStreak == 3) {
                System.out.println("myCoin 승리");
                break;
            } else if (youStreak == 3) {
                System.out.println("youCoin 승리");
                break;
            }
        }
    }
}