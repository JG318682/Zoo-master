package money;

public class Wallet {

    private int wallet = 100;
    private int totalWallet;
    private int cost;

    public Wallet(int wallet){
        this.wallet = wallet;
        totalWallet = wallet + totalWallet;
    }
    public int setWallet(){

    }

    public int getWallet() {
        return wallet;
    }
}
