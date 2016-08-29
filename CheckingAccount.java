public class CheckingAccount extends Account{
  
  public CheckingAccount(Customer customer, double balance , String accountNumber){
  super( customer,balance,  accountNumber);
  
  sizeOfArray=0;
  transaction=new Transaction[capOfArray];
  this.balance=0;
  
  
  }
  public double deposit(double amount){
   //transaction types correspond to
    //1 is deposit
    //2 is withdraw
    //3 is addInterest
    
    if(capacity==sizeOfArray ){
      reallocate();
    }
    
    if(amount>0){ 
     balance= balance + amount;
      transaction[sizeOfArray] = new Transaction(customer.getCustomerNumber() , 1 , amount , "April" , "Deposit");
      sizeOfArray++;
  }
    return balance;
  }
  
  
  
  
  public double withdraw(double amount){
    
    
        if(capacity==sizeOfArray ){
          reallocate();
        
       }
      
      
      
    if(balance>0 && amount>0 && balance>=amount){
      amount=amount+ customer.getCheckCharge();
      balance=balance-amount;
      transaction[sizeOfArray] = new Transaction(customer.getCustomerNumber(), 2, amount, "2016", "WITHDRAW");
      sizeOfArray++;
 } 
    else if((balance>0 || balance<0) && amount>0 && amount>balance){
      amount=amount+customer.getCheckCharge();
      balance=balance-amount -(customer.getOverdraftPenalty());
      sizeOfArray++;
      transaction[sizeOfArray] = new Transaction(customer.getCustomerNumber(), 2, amount, "2016", "WITHDRAW");
      
    } 
    //balance is positive or balance is negative but amount is greater than balance 
    
  return balance;
  }
  
  
  public double addInterest(){
    
        if(capacity==sizeOfArray ){
      reallocate();
        }
    
    if(balance>0){
     
       double balan2= (balance*customer.getCheckInterest());   //ask joyceeee
      sizeOfArray++;
      transaction[sizeOfArray] = new Transaction(customer.getCustomerNumber() , 3 , balan2 ,"2016", "Interest Credit");
      
      balance = balance + balan2;
    
    }
       return balance;
  

        
        
  }

}
  
  
  
  
  
  
  
  
  

  