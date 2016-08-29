public class Senior extends Customer{

 private static final double SAVINGS_INTEREST=0.08;
 private static final double CHECK_INTEREST=0.04;
 private static final double CHECK_CHARGE=0.01;
 private static final double OVERDRAFT_PENALTY=10.00;
 
 public Senior(String name, String adress, int age, String telephoneNumber, String customerNumber){
   super(name,adress, age, telephoneNumber, customerNumber);
//   this.name=customerName;
//   this.adress=customerAdress;
//   this.age=customerAge;
//   this.telephoneNumber=customerTelephoneNumber;
//   this.customerNumber=customerNumber;
 }
 
  public double getSavingsInterest(){
   return SAVINGS_INTEREST;
 
 }
  public double getCheckInterest(){
   return CHECK_INTEREST;
  }
  public double getCheckCharge(){
    return CHECK_CHARGE;
  }
  public double getOverdraftPenalty(){
    return OVERDRAFT_PENALTY;
  }
  
  

}