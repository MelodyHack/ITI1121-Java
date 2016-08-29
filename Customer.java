public abstract class Customer{
  
  String name;
  String adress;
  int age;
  String telephoneNumber;
  String customerNumber;
  
  public Customer(String name, String adress, int age, String telephoneNumber, String customerNumber){
    
    this.name=name;
    this.adress=adress;
    this.age=age;
    this.telephoneNumber=telephoneNumber;
    this.customerNumber=customerNumber;
  
  }
  
  public String getName(){
   return name;
 }
  public void setName(){
   this.name=name; 
 }
  public String getAddress(){
   return adress;
 }
  public void setAddress(){
   this.adress=adress;
 }
  public int getAge(){
   return age;
 }
  public void setAge(){
   this.age=age;
 }
  public String getTelephoneNumber(){
   return telephoneNumber; 
 }
  public void setTelephoneNumber(){
   this.telephoneNumber=telephoneNumber;
 }
  public String getCustomerNumber(){
   return customerNumber;
 }
  public void setCustomerNumber(){
   this.customerNumber=customerNumber;
 }

  public abstract double getSavingsInterest();
  public abstract double getCheckInterest();
  public abstract double getCheckCharge();
  public abstract double getOverdraftPenalty();
}
  