public class SavingsAccount extends Account{
  double amount;
    
  public SavingsAccount(Customer customer, double balance , String accountNumber){
  super( customer, balance , accountNumber);
  
  sizeOfArray=0;
  transaction=new Transaction[capOfArray];
  
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
      balance=balance + amount;
      sizeOfArray++;
      transaction[sizeOfArray] = new Transaction(customer.getCustomerNumber() , 1 , amount ,"2016", "Deposit");
      
  }
    return balance;
  }
  
  
  
  
  public double withdraw(double amount){
    
    
        if(capacity==sizeOfArray ){
      reallocate();
      
      
      
    if(balance>0 && amount>0 && balance>=amount){
      balance=balance-amount;
      sizeOfArray++;
      transaction[sizeOfArray] = new Transaction(customer.getCustomerNumber() , 2 , amount ,"2016", "Withdraw");
      addInterest();
 } 
//    else if((balance>0 || balance<0) && amount>0 && amount>balance){
//    balance=balance-amount -(getOverdraftPenalty());
//    sizeOfArray++;
//      transction[sizeOfArray] = new Transaction(customer.getCustomerNumber() , 2 , amount ,date, "Withdraw")
//      addInterest();
//    } 
//    //balance is positive or balance is negative but amount is greater than balance 
    
  
  }
        return balance;
  }
  
   public double addInterest(){
        if(capacity==sizeOfArray ){
      reallocate();
        }
    
    if(balance>0){
     
       double balan2= (balance*customer.getSavingsInterest());   //ask joyceeee
      sizeOfArray++;
      transaction[sizeOfArray] = new Transaction(customer.getCustomerNumber() , 3 , amount ,"2016", "Interest Credit");
      addInterest();
      balance = balance + balan2;
    
    }
       return balance;
  
  }

}