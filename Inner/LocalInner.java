package com.inner;

public class LocalInner {
	private void getValue()
    {
	     int sum = 40;
      
      // Local inner Class inside method
         class Inner
           {
		 public int divisor;
         public Inner()
         {
             divisor = 4;
         }
         private int getDivisor()
         {
             return divisor;
         }
         private int getRemainder()
         {
             return sum%divisor;
         }
         private int getQuotient()
         {
             System.out.println("Inside inner class");
             return sum / divisor;
         }
     }
      
        Inner inner = new Inner();
        System.out.println("Divisor = "+ inner.getDivisor());
        System.out.println("Remainder = " + inner.getRemainder());
        System.out.println("Quotient = " + inner.getQuotient());
    }
	//method local inner
	public void display()
	{
		class Inner{
			
			int a=10;
			
			void print()
			{
				System.out.println("Method of Inner class");
				System.out.println("Value of a "+a);
			}
		}
		
		Inner inner= new Inner();
		inner.print();
	}
	public static void main(String[] args)
    {
		LocalInner outer = new LocalInner();
        outer.getValue();
        outer.display();
    }

}
