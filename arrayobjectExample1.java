package proj1;
import java.util.*;

class a1 {
	
	String stud_name;
	int rno,m1,m2,m3,total;
	String grade;
	float per;
	Scanner sc = new Scanner(System.in);
	
	public void getdata()
	{
		stud_name= sc.next();
		rno = sc.nextInt();
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();		
		
	}
	void calculate()
	{
		total = m1+m2+m3;
		per = total/3;
		if(per >=70)
		{
			grade="Distiction";
		}
		else if(per >=60 && per<70)
		{
			grade="first Class";
		}
		else if(per>=50 && per<60)
		{
			grade="Second Class";
		}
		else if(per>=40 && per<50)
		{
			grade="Pass Class";
		}
		else
		{
			grade="Fail";
		}
	}
	
	void showdata()
	{
		System.out.println(rno+"\t"+stud_name+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+total+"\t"+per+"\t"+grade);
		
	}
	
}

public class arrayobjectExample{

	public static void main(String[] args)
	{
	   int i,no;
	   String name;
	   int rno,m1,m2,m3;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("How many to students data u want enter");
	   no = sc.nextInt();
       a1[] e = new a1[no];
                  
       for(i=0;i<no;i++)
       {

    	   e[i]=new a1();
    	   
    	   e[i].getdata();
       }
              for(i=0;i<no;i++)
       {
    	   e[i].calculate();
       }
       for(i=0;i<no;i++)
       {
    	   e[i].showdata();
       }
       
	}
	
	menu - 1. namewise search
	       2. sort records(per)
	       3. ecount records grade wis
	       4. show records
	       5. update record  - 2 
	       

	1. display information name wise
	2. sort records 
		
}
