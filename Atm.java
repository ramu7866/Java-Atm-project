    package atm;
    public class Atm{
        private double balance;
        private double depositeamount;
        private double withdrawamount;
        public Atm(){
            super();
        }
        public double getbalance(){
            return balance;
        }
        public void setbalance(double balance){
            this.balance=balance;
        }
        public double getdepositeamount(){
            return depositeamount;
        }
        public void setdepositeamount(double depositeamount){
            this.depositeamount=depositeamount;
        }
        public double getwithdrawamount(){
            return withdrawamount;
        }
        public void setwithdrawamount(double withdrawamount){
            this.withdrawamount=withdrawamount;
        }
        public String toString(){
            return "Atm [balance=" + balance + ", depositeamount=" + depositeamount + ", withdrawamount"+ withdrawamount+"]";
        }


    }