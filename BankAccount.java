public class BankAccount {
 Person person;
 String accountNumber;
 double balance;
BankAccount(String name,String surname,String sex,String occupation,String organization,String accountNumber,int balance){
	this.person = new Person(name,surname,sex,occupation,organization);
	this.accountNumber=accountNumber;
	this.balance=balance;
}
void deposit(double x) {
	balance = balance + x;
	
	
}
void withdrawal(double x) {
	balance = balance - x; 
	
}
void printInfo() {
	System.out.println("Name = "+person.name);
	System.out.println("Surname = "+person.surname);
	System.out.println("Sex = "+person.sex);
	System.out.println("Occupation = "+person.occupation);
	System.out.println("Organization = "+person.organization);
	System.out.println("Account = "+accountNumber);
	System.out.println("Balance = "+balance);
	
}
void printBalance() {
	System.out.println("Balance = "+balance+" mil");
}
double convertBalanceToTHB() {
	return balance * 35;
}




}