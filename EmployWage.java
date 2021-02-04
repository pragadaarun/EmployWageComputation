import java.util.Random;
class EmployWage{
	public static void main(String args[]){
		System.out.println("Welocome to the Employee Wage problem");
		Random random=new Random();
		//constants
		int maxHrsInMonth=100;
		int maxWorkingDays=20;
		int wagePerHour=20;
		//variables
		int totalempHr=0;
		int totalworkingDays=0;
		while(totalempHr < maxHrsInMonth || totalworkingDays < maxWorkingDays)
		{
			totalworkingDays=totalworkingDays+1;
			int emphrs=0;
			int empcheck=random.nextInt(3);
			switch(empcheck)
			{
			case 1:
				emphrs=8;
				break;
			case 2:
				emphrs=4;
				break;
			default:
				emphrs=0;
				break;
			}
		totalempHr=totalempHr+emphrs;
		}
		int totalwage=totalempHr * wagePerHour;
		System.out.println("total wage of an employee="+totalwage);

	}
}
