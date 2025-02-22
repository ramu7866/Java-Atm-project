package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOpea implements AtmInterface{

    Atm atm=new Atm();
    Map<Double,String> minist=new HashMap<>();
    public void viewBalance() {
       System.out.println("AvaiilableBalance:"+atm.getbalance());
    }

    
    public void withdrawamount(double withdrawamount) {
         if(withdrawamount%500==0){
                 if(withdrawamount<atm.getbalance()){
                    System.out.println("collect the cash"+withdrawamount);
                    atm.setbalance(atm.getbalance()-withdrawamount);
                    minist.put(withdrawamount,"amount withdrawn");
                    viewBalance();
                 }
                 else{
                    System.out.println("insuficient balance");
                 }
         }  
         else {
            System.out.println("enter the amount in terms of 500");
         } 
    }

    @Override
    public void depositeamount(double depositeamount) {
        System.out.println("deposited amount: "+depositeamount);
        atm.setbalance(atm.getbalance()+depositeamount);
        minist.put(depositeamount, "deposited suceesfully");
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
     Set<Double> set=minist.keySet();
     for(Double d:set){
        System.out.println(d+"="+minist.get(d));
     }
    }
    
}
