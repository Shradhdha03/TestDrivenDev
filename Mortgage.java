
/*
 * Program Name: Mortgage.java A
 * uthor: Shradhdha Parsana 
 * Date: Apr 4, 2018 8:21:33 AM 
 * Description:
 */
public class Mortgage

{

	/*
	 * *********************** Assumptions***************** 
	 * currentdebt = debt that is due before issueing mortgage in $ (as per roggers example) 
	 * mortagage = monthly new dept in $ 
	 * total debt =( currentdebt + mortagage ) per month
	 * debtPercentage = (total debt) *100 / salary per month
	 * ***************************************************
	 */
	double debtLoad;
	int credit;
	double salary;
	double mortagage;
	double debtPercentage;

	public Mortgage(double debtPercentage, int credit)
	{
		this.debtPercentage = debtPercentage;
		this.credit = credit;
	}

	public Mortgage(double currentdebt, double salary, double mortagage, int credit)
	{
		this.salary = salary;
		this.mortagage = mortagage;
		this.credit = credit;
		this.debtLoad = currentdebt;
		printData();
	}

	private void printData()
	{
		// TODO Auto-generated method stub
		System.out.println("....................................................");
		System.out.println("currentdebt : $" + debtLoad + " salary : $" + salary + " mortagage : $" + mortagage);
		System.out.println("debtPercentage : " + this.debtPercentage + "%  credit: " + credit + " \nisQualified: "
				+ isQualified() + "\n");
	}

	public double calculatedebtLoad(double currentdebt, double salary, double mortagage)
	{
		return ((currentdebt + mortagage) * 100) / salary;
	}

	public boolean isQualified()
	{

		if (debtLoad >= 0 && salary > 0 && mortagage > 0 && credit > 0 && credit <= 5)
		{
			debtPercentage = Math.round(calculatedebtLoad(debtLoad, salary, mortagage));
			if (credit >= 1 && this.credit <= 2)
			{
				if (debtPercentage <= 60.0)
				{
					return true;
				}
			} else if (this.credit >= 3 && this.credit <= 5)
			{
				if (debtPercentage <= 45.0)
				{
					return true;
				}
			}
		}
		return false;
	}

}
