//Bank.java

/*
 * Bank.java
 *
 * Created on July 21, 2004, 1:23 AM
 */

public class Bank {
    private Account[] accounts;
    private int size;
    private int capacity=100;
    private static final int SAVINGS = 0;
    private static final int CHECKING = 1;    
    private static final int SENIOR = 0;
    private static final int ADULT = 1;    
    private static final int STUDENT = 2;
    private static final int INIT_CAPACITY = 100;
    
    private int second=0;
    public int third =0;
    public int fourth =0;
    
    /** Creates a new instance of Bank */
    public Bank(){
    
    accounts = new Account [INIT_CAPACITY];
    size=0;
    capacity = INIT_CAPACITY;
    } 


    
    /********************************************************************
     * Creates a new account. 
     * pre: customer information must be not null and types must be valid
     * post: New account added to bank
     * @param customerName String Account owner's name
     * @param customerAddress String Owner's address
     * @param customerAge int Owner's age (in years)
     * @param customerPhoneNumber String Owner's phone number
     * @param customerType int Owner's type of customer within bank
     * @param typeAccount int Account type (savings or checking)
     * @return String New account number
     */
    public String addAccount(String customerName, String customerAddress, 
                             int customerAge, String customerPhoneNumber, 
                             int customerType, int typeAccount){    
     //String accountNumber;
     Customer customers;
      double balance=0.0;
      
     third++;
     size=third;
     fourth++;
     second=fourth;
     
      
      
      //accountNumber = accounts[size].getAccountNumber();
      
            
      if(customerType==SENIOR){
       customers=new Senior( customerName,customerAddress,customerAge,customerPhoneNumber, Integer.toString(fourth));
       second++;
        if(typeAccount==CHECKING){
          accounts[size]= new CheckingAccount(customers,0.0, Integer.toString(size));
          size=size+1;
      
      
      }else if(typeAccount==SAVINGS){
      accounts[size]=new SavingsAccount(customers,0.0,Integer.toString(size));
      size=size+1;
      }
    
      }else if(customerType==ADULT){
      customers=new Adult(customerName,  customerAddress,customerAge,customerPhoneNumber, Integer.toString(fourth));
      second++;
      if(typeAccount==CHECKING){
      accounts[size]=new CheckingAccount(customers,0.0,Integer.toString(size));
      size++;
      }else if(typeAccount==SAVINGS){
      accounts[size]=new SavingsAccount(customers,0.0,Integer.toString(size));
      size++;
      }
      
      }else{
      customers=new Student(customerName,customerAddress,customerAge,customerPhoneNumber, Integer.toString(fourth));
      second++;
      if(typeAccount==CHECKING){
      accounts[size]=new CheckingAccount(customers,0.0,Integer.toString(size));
      }else if(typeAccount==SAVINGS){
      accounts[size]=new SavingsAccount(customers,0.0,Integer.toString(size));
      }
      }
      
      if(size==capacity){
      reallocate();
      
      }
    // return Integer.toString(accounts[lastAccountNumber].accountNumber);
     return accounts[third].getAccountNumber();
      
      
    }
    
    
    
    /***********************************************************************
     * Make a deposit into account.
     * pre: amount must be a positive integer
     * post: Account's balance increases
     * @param accountNumber String Account's number
     * @param amount double Amount to deposit
     * @return double New balance
     */
    public String makeDeposit(String accountNumber, double amount){
              int index = find(accountNumber);
        accounts[index].deposit(amount);
        return Double.toString(accounts[index].getBalance());       
    
    };
    
    /***********************************************************************
     * Make a withdrawal from account.
     * pre: amount must be a positive integer
     * post: Account's balance decreases
     * @param accountNumber String Account's number
     * @param amount double Amount to withdraw
     * @return double New balance
     */    
    public String makeWithdrawal(String accountNumber, double amount){
        int index = find(accountNumber);
        accounts[index].withdraw(amount);
        return Double.toString(accounts[index].getBalance());       
    }

    /***********************************************************************
     * Returns account information as a string so it can be displayed
     * @param accountNumber String Account's number
     * @return String Account information as a String object
     */    
    public String getAccount(String accountNumber){
        int index = find(accountNumber);
        return accounts[index].toString();        
    }
    
    /***********************************************************************
     * Given an account number tells if the account exists or not
     * @param accountNumber String Account's number
     * @return int TRUE if accountNumber exists in accounts[]. Otherwise, -1.
     */    
    private int find(String accountNumber){
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i].getAccountNumber().equals(accountNumber)){
                return i;
            }
        }
        return (-1);
    }


 /***********************************************************************


    /** You need to create private method : Allocate to allocate a new array to hold the accountss. */
    private void reallocate(){
      
  
  
        Account [] copyAccount = new Account[capacity];
      
    capacity=capacity*2;
     
           // System.out.println(capOfArray);
    
    
            for(int j=0; j<accounts.length; j++){
         copyAccount[j]=accounts[j];  
      
         
//         if (j>0) {
//                System.out.print(", ");
//            }
//            //System.out.print(accounts[j]); 
           
         
         
         
      }
            
            //reassigned new array to current array
   accounts=copyAccount;  
    
    
    
    
    }
}

