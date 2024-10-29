class Bank {
    private long[] balance;
    public Bank(long[] balance) {
        this.balance = balance;

    }
    
   public boolean transfer(int account1, int account2, long money) {
        int index1 = account1 -1;
        int index2 = account2 -1;
        if (index1 < 0 || index1 >= balance.length || index2 < 0 || index2 >= balance.length) {
            return false;
        }


        if (balance[index1] < money) {
            return false;
        }
        
        balance[index1] = balance[index1] - money;
        balance[index2] = balance[index2] + money;


        return true;
    }
    
    public boolean deposit(int account, long money) {
        int index = account -1;
        if (index < 0 || index >= balance.length) {
            return false;
        }
    
         balance[index] = balance[index] + money;

        return true;
    }
    
    public boolean withdraw(int account, long money) {
        int index = account -1;
        if (index < 0 || index >= balance.length) {
            return false;
        }
        if (balance[index] < money) {
            return false;
        }

         balance[index] = balance[index] - money;

        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */