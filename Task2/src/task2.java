import java.util.*;

public class task2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained:-");
        int[] marks = new int[5];
        int sum = 0;
        String[] subjects = new String[]{"English", "Maths", "Chemistry", "Physics", "Biology"};
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]+": ");
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
        double percent = (double)sum/(double)subjects.length;
        char grade;
        if (percent>=90) {
            grade='A';
        }else if(percent>=80){
            grade='B';
        }else if (percent>=70) {
            grade='C';
        }else if (percent>=60) {
            grade='D';
        }else if (percent>=50) {
            grade='E';
        }else{
            grade='F';
        }
        System.out.println("Total marks: "+sum);
        System.out.println("Average perccentage: "+percent+"%");
        System.out.println("Grade: "+grade);
        sc.close();
    }
}
