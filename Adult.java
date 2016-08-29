public class Adult extends Customer{ 
  
 private static final double SAVINGS_INTEREST=0.03;
 private static final double CHECK_INTEREST=0.01;
 private static final double CHECK_CHARGE=0.03;
 private static final double OVERDRAFT_PENALTY= 25.00;

 public Adult(String name, String adress, int age, String telephoneNumber, String customerNumber){
   super(name,adress, age, telephoneNumber, customerNumber);
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