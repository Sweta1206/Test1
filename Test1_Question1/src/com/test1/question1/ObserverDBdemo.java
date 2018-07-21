package com.test1.question1;

public class ObserverDBdemo 
{
	public static void main(String args[])
	{
	Database db1=new Database();

    new Client1(db1);
    new Client2(db1);

    db1.setState(1111,10);
    db1.notifyObserver();
  	
   db1.setState(4444,19);
   db1.notifyObserver();
	}
}
