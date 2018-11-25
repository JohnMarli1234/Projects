package classrecord;
import java.util.Scanner;

public class ClassRecord {

    
    public static void main(String[] args) {
        // TODO code application logic here
        	Scanner sc;
        sc = new Scanner(System.in);
    
    

//alization for the inputs
                int n ;
                System.out.print("Enter how many Students: ");
		n = sc.nextInt();
		String [] idNumber = new String[n];
		String [] firstName  = new String[n];
		String [] lastName  = new String[n];
		String [] middleInitial  = new String[n];
		double [] MidCS = new double[n];
		double [] MidLab = new double[n];
		double [] MidExam = new double[n];
		double [] FinCS = new double[n];
		double [] FinLab = new double[n];
		double [] FinExam = new double[n];
		
		//initialization for the grades
		int [] midGrade = new int[n];
		int [] finGrade = new int[n];
		int [] ave = new int[n];
		
		//inputs
	
		 System.out.println("Fill up the following: ");
		//input 10 students information
		for(int i = 0; i < n; i++){
                    
			System.out.println("STUDENT #"+(i+1));
                        
                        sc.nextLine();
                        
			System.out.print("ID Number: ");
			idNumber[i] = sc.nextLine();
                        
			System.out.print("First Name: ");
			firstName[i] = sc.nextLine();
                       
                        System.out.print("Middle Initial: ");
                        middleInitial[i] = sc.nextLine();
                        
                        System.out.print("Last Name:");
                        lastName[i] = sc.nextLine();
                        
			System.out.print("Midterm Class Standing Score: ");
			MidCS[i] = sc.nextDouble();
                        
			System.out.print("Midterm Lab Score: ");
			MidLab[i] = sc.nextDouble();
                        
			System.out.print("Midterm Exam Score: ");
			MidExam[i] = sc.nextDouble();
                        
			System.out.print("Finals Class Standing Score: ");
			FinCS[i] = sc.nextDouble();
                        
			System.out.print("Finals Lab Score: ");
			FinLab[i] = sc.nextDouble();
                        
			System.out.print("Finals Exam Score: ");
			FinExam[i] = sc.nextDouble();
                        
		System.out.println("Student Number:\t  ID NUmber:\t  First Name:\t  Middle Initial:\t  Last Name:\t  Midterm CS:\t  Midterm Lab:\t  Midterm Exam:\t  Midterm Grade:\t  Finals CS:\t  Finals Lab:\t  Finals Exam:\t  Finals Grade:\t  Semestral Grade:\t");
                for(i = 0; i< n;i ++){
                System.out.println((i + 1) + "\t          "+idNumber[i]+"\t          "+firstName[i]+"\t          "+middleInitial[i]+"\t                  "+lastName[i]+"\t          "+MidCS[i]+"\t          "+MidLab[i]+"\t          "+MidExam[i]+"\t          "+midGrade[i]+"\t          "+FinCS[i]+"\t          "+FinLab[i]+"\t          "+FinExam[i]+"\t          "+finGrade[i]+"\t          "+ave[i]);
		}	
			System.out.println();
		}
		 
		//solves for the grades
		for(int i = 0; i < n; i++){
			midGrade[i] = (int) ((MidCS[i] * 0.33)+(MidLab[i] * 0.33)+(MidExam[i] * 0.34));
			finGrade[i] = (int) ((FinCS[i] * 0.33)+(FinLab[i] * 0.33)+(FinExam[i] * 0.34));
			ave[i] = (midGrade[i]/2)+(finGrade[i]/2);
		}
                
		//sir's input
                System.out.println("Choose a Student to Display");
                System.out.println();
		System.out.print("Enter ID Number: ");
		int inp = sc.nextInt();
		int index = 0;
		//searches for student that has the same id number with the inp
		for(int i = 0; i < n; i++){
			if(idNumber[i].equals(inp)){
				index = i;
			}
}
		
		
		//outputs the students information and his/her grades
                System.out.println("Students Info:");
		System.out.println("First Name: " + firstName[index]);
                System.out.println("Middle Initia: " + middleInitial[index]);
                System.out.println("Last Name: " + lastName[index]);
                System.out.println("Midterm Class Standing Score: " + MidCS[index]);
		System.out.println("Midterm Lab Score: " + MidLab[index]);
		System.out.println("Midterm Exam Score: " + MidExam[index]);	
		System.out.println("Midterm Grade: " + midGrade[index]);
                System.out.println("Finals Class Standing Score: " + FinCS[index]);   
		System.out.println("Finals Lab Score: " + FinLab[index]);  
		System.out.println("Finals Exam Score: " + FinExam[index]);
		System.out.println("Finals Grade: " + finGrade[index]);
                System.out.println("Your Semestral Grade : "+convert(ave[index]));

}
        static int convert(double g){
        int grade = 1;
        if(g < 7 && g >= 0){
            grade = 70;
        }else if(g < 19){
            grade = 71;
        }else if(g < 31){
            grade = 72;
        }else if(g < 43){
            grade = 73;
        }else if(g < 50){
            grade = 74;
        }else if(g < 51.5){
            grade = 75;
        }else if(g < 53){
            grade = 76;
        }else if(g < 55){
            grade = 77;
        }else if(g < 57){
            grade = 78;
        }else if(g < 59){
            grade = 79;
        }else if(g < 61){
            grade = 80;
        }else if(g < 63){
            grade = 81;
        }else if(g < 65){
            grade = 82;
        }else if(g < 67){
            grade = 83;
        }else if(g < 69){
            grade = 84;
        }else if(g < 71){
            grade = 85;
        }else if(g < 73){
            grade = 86;
        }else if(g < 75){
            grade = 87;
        }else if(g < 77){
            grade = 88;
        }else if(g < 79){
            grade = 89;
        }else if(g < 81){
            grade = 90;
        }else if(g < 83){
            grade = 91;
        }else if(g < 85){
            grade = 92;
        }else if(g < 87){
            grade = 93;
        }else if(g < 89){
            grade = 94;
        }else if(g < 91){
            grade = 95;
        }else if(g < 93){
            grade = 96;
        }else if(g < 95){
            grade = 97;
        }else if(g < 97){
            grade = 98;
        }else{
            grade = 99;
        }
        return grade;
        
    }
}
