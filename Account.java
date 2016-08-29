public abstract class Account{
  
  Customer customer;
  protected double balance;
  private String accountNumber;
  private int accountNumberInt=0;
  public  static int capOfArray=21; //current capacity of the transaction array
  public  int sizeOfArray; //size of the transaction array
  public  int capacity; //variable to assign capacity of array 
  Transaction [] transaction = new Transaction[capOfArray]; 
  int [] copyTransaction;
  
  
  
    public Account(Customer customer, double balance , String accountNumber){
      this.customer=customer;
      //this.balance=0;
   
  }
   public double getBalance(){
    return balance;
  }
  
  public Customer getCustomer(){
    return customer;
  }
  
  public String getAccountNumber(){
  return accountNumber;
  }
  
  public String toString(){
    String typeOfCustomer;
    String result;
    
    if(customer instanceof Senior){
      typeOfCustomer="Senior";
    }
    
    else if(customer instanceof Adult){
      typeOfCustomer="Adult";
    }
    else if(customer instanceof Student){
      typeOfCustomer="Student";
    }
    
    result = "Account Number : " + accountNumber + "\n" + "Customer Name : "+customer.getName() +
      "\n"+"Your Current Balance : " + balance +"$$";
    
    
    
    
    return result;
  }
  
  public void setCustomer(Customer customer){
    this.customer=customer;
    
  }
  
  public void reallocate(){
   
     Transaction [] copyTransaction;
      
    capOfArray=capOfArray*2;
     copyTransaction = new Transaction [capOfArray];
           // System.out.println(capOfArray);
    
    
            for(int j=0; j<transaction.length; j++){
         copyTransaction[j]=transaction[j];  
      
         
//         if (j>0) {
//                System.out.print(", ");
//            }
//            //System.out.print(transaction[j]); 
           
         
         
         
      }
            
            //reassigned new array to current array
   transaction=copyTransaction;  
    
    
    
    
    
  }
  public abstract double deposit(double amount);
  public abstract double withdraw(double amount);
  public abstract double addInterest();
  
  
  
  }