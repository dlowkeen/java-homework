package houses;

import java.util.Iterator;

import myProps.CandyType;
import myProps.TrickOrTreat;
import myProps.TrickType;

public class House implements Comparable{
	protected CandyType c;
	protected TrickType t;
	protected int amountOfCandy;
	
	public House(CandyType a, int maxCandy) {
		this.c = a;
		//set some random amount from our estimate of max candy
		this.amountOfCandy =  (int) ((Math.random()*((maxCandy-0)+1))+0);
	}

	
	public CandyType trickOrTreat() {
		if(this.amountOfCandy > 0) {
			this.amountOfCandy--;
			return this.c;
		}
		else {
			System.out.println("What there is no more candy???");	
			return null;
		}
	}
	
	public void trick(TrickType t) {
		this.t = t;
	}


	public String toString() {
		return "HOUSE: " + this.amountOfCandy; 
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
//		House temp = ((House)o);
//		if (this.amountOfCandy > temp.amountOfCandy) {
//			return 1;
//		} else if (this.amountOfCandy < temp.amountOfCandy) {
//			return -1;
//		} else {
//			return 0;			
//		}
		return this.amountOfCandy - ((House)o).amountOfCandy; // BETTER WAY OF DOING THIS!
	}
	
	
}
