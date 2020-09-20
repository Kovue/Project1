import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    public static void main (String args[]){

        char opt=' ';
        int n=0;
        double responses[]=new double[7];
        double overall=0;
        Scanner inputKeyboard=new Scanner(System.in);

        do{

            n++;
            System.out.println("Survey #"+n);
            System.out.println("Please enter the numeric student responses for each question: ");

            System.out.println("Q1. The instructor was available for consultation.");
            responses[0]+=inputKeyboard.nextDouble();

            System.out.println("Q2. Student responsibilities for this course were well defined.");
            responses[1]+=inputKeyboard.nextDouble();

            System.out.println("Q3. Class time was well spent.");
            responses[2]+=inputKeyboard.nextDouble();

            System.out.println("Q4. I learned a lot for the instructor in this course.");
            responses[3]+=inputKeyboard.nextDouble();

            System.out.println("Q5. Course materials contributed to my learning.");
            responses[4]+=inputKeyboard.nextDouble();

            System.out.println("Q6. I was challenged in this course.");
            responses[5]+=inputKeyboard.nextDouble();

            System.out.println("Q7. Coming into this course I was motivated to learn this subject.");
            responses[6]+=inputKeyboard.nextDouble();


            System.out.println();
            System.out.println("Are you finished(y/n)?");
            opt=inputKeyboard.next().charAt(0);

            System.out.println();

        }while(opt != 'y');

        System.out.println("Survey summary");

        System.out.println("n="+n);


        for(int i=0;i<responses.length;i++){

            double average=(responses[i]/n);

            System.out.printf("Mean response Q%d = %.1f\n",(i+1),average);

        }

        for(int i=0;i<(responses.length-1);i++){

            overall+=(responses[i]/n);

        }

        System.out.printf("Overall (Q1-Q6) = %.2f",(overall/6));

    }
}
