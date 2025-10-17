public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount per1 = new BankAccount("Wang","Talu","Male","Actor","SIIT","000-000-0000",10);
		per1.printInfo();

		//BankAccount per2 = new BankAccount("Vitdiwat","Niyompun","Male","Actor","SIIT","000-000-0000",10);
		per1.person.name = "Vitdiwat";
		per1.person.surname = "Niyompun";
		per1.person.sex = "Male";
		per1.printInfo();
		per1.deposit(15 );
		per1.printBalance();
		per1.withdrawal(5);
		per1.printBalance();
		
		System.out.println(per1.convertBalanceToTHB()+"mil");
	
	}
		



}