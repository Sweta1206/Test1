package com.test1.question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Database
{
	private List<Observer> observers=new ArrayList<Observer>();
	private int state;
	private int dept_no;
	public void add(Observer o) 
	{
        observers.add(o);
    }

	
	public int setState(int Emp_id,int dept_no)
	{
		this.state=Emp_id;
		this.dept_no=dept_no;
		return state;
	}
	
	public int getState()
	{
		return state;
	}
	
	public int getdpt()
	{
		return dept_no;
	}
	
	public void notifyObserver() 
	{
        for (Observer observer : observers)
        {
            observer.update();
        }

	}


	

	

}
