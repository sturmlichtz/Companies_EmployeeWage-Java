public class Employee_Wage_Computation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int isFullTime=1;
		int empCheck = (int)Math.floor(Math.random()*10)%2;
		if (empCheck == isFullTime){
			System.out.println("Employee is Present");
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}