package com.test1.question1;



public class Client2 extends Observer{

	  public Client2(Database db) {
	        this.db = db;
	        this.db.add(this);
	    }


	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "other updates done for employee by client2"+db.getState() );
	}

}
