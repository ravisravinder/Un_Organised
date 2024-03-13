Write Desing pattern for Builder pattern

& write a singleton  design pattern threadsafe




builder design patterns



public class Transaction{

private static final Transaction transaction;

private Transaction(){}

public synchronized static getInstance(){
	
	if(transaction! = null){
		return transaction;
	}
	else (transaction==null)	{
	  synchronized(Transaction.class){
		transaction = new Transaction();
		
	 } 
 }
}


@Entity()
public class Employee{

@
int id;
@
String name;

@COlumn
int age;



Adress adress;

@OnetoOne()

}


// 2 arays  1 arr , duplicates
 Arrays.stream(a1,Arrays.stream(a2)).distinct().concatinate(Collect.toArray());


