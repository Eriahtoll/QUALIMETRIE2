package bankAccountApp;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;

import bankAccountApp.BankAccount;
import org.junit.Test;

public class BankAccountTest {
	String name = "John";
	char gender = 'm';
	int age = 22;
	int weight = 190;
	float height = 172;
	String hairColor = "brown";
	String eyeColor = "green";
	String email = "jufm@gmail.com";

	int assignAccountNumber = 0;
	int accountNumberExists = 1;
	int initMoneyAmount = 5000;
	int withdrawLimit = 700;
	String dateCreated = "05/21/2019";
	BankAccount bankAccount = null;
	String text = "C:\\Users\\jay4k\\Desktop\\stuff\\Bankaccountinfo\\BankAccountinfotext.text";
	// String text = "/Users/markkelly/BankAccountinfotext.text";
	Bank bank = null;
	Person accountHolder = null;
	String serializedPerson = null;

	@Before
	public void setup() {
		// Create Person
		try {
			accountHolder = new Person(name, gender, age, weight, height, hairColor, eyeColor, email);
			serializedPerson = name + Person.DELIM + gender + Person.DELIM + age + Person.DELIM + height + Person.DELIM
					+ weight + Person.DELIM + hairColor + Person.DELIM + eyeColor + Person.DELIM + email;
		} catch (Exception e) {
			System.out.print("Unexpected failure during test setup creating accountHolder");
			e.printStackTrace();
		}
		bank = new Bank();
		bankAccount = new BankAccount(initMoneyAmount, withdrawLimit, dateCreated, accountHolder);
	}

	//Test Exercice 8
	@Test //Good test
	public void HappyPath() {
		// Given
		int depositamount = 300;
		bank.addAccount(bankAccount, assignAccountNumber);

		// Then
		assertEquals(5000, bankAccount.getBalance(), 0f);
		bankAccount.depositMoney(depositamount);
		assertEquals(5300, bankAccount.getBalance(), 0f);
	}
/**
	@Test //Bad test
	public void NotHappyPath() {
		// Given
		int depositamount = 200;
		bank.addAccount(bankAccount, assignAccountNumber);

		// Then
		assertEquals(5000, bankAccount.getBalance(), 0f);
		bankAccount.depositMoney(depositamount);
		assertEquals(5300, bankAccount.getBalance(), 0f);
	}
*/
	@Test
	public void AlwaysMore() {
		// Init
		int withdrawamount = 5001;
		bank.addAccount(bankAccount, assignAccountNumber);
		assertEquals(5000, bankAccount.getBalance(), 0f);
		// Exceed balance and check for failure (return = false)
		assertEquals(false, bankAccount.withdrawMoney(withdrawamount));

	}


	//End Exercice 8

	@Test
	public void test_getInitMoneyAmount() throws Exception {
		// Given
		BankAccount acc1 = new BankAccount(initMoneyAmount, withdrawLimit, dateCreated, accountHolder);
		// Then
		assertEquals(5000, acc1.getInitMoneyAmount(), 0f);
	}

}
