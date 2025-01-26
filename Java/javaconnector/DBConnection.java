import java.util.Scanner;

public class PriorityScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n;
        int[] pno, prior, bt, wt, tt;
        float avgWT = 0, avgTT = 0;

        System.out.print("Enter the number of processes: ");
        n = sc.nextInt();

        
        pno = new int[n];
        prior = new int[n];
        bt = new int[n];
        wt = new int[n];
        tt = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Process " + (i + 1) + ":");
            System.out.print("Enter burst time: ");
            bt[i] = sc.nextInt();
            System.out.print("Enter priority: ");
            prior[i] = sc.nextInt();
            pno[i] = i + 1; 
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (prior[j] > prior[j + 1]) {
                    
                    int temp = prior[j];
                    prior[j] = prior[j + 1];
                    prior[j + 1] = temp;

                    
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;

        
                    temp = pno[j];
                    pno[j] = pno[j + 1];
                    pno[j + 1] = temp;
                }
            }
        }


        wt[0] = 0; 
        tt[0] = bt[0]; 
        avgWT += wt[0];
        avgTT += tt[0];

        for (int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[i - 1]; 
            tt[i] = wt[i] + bt[i];         
            avgWT += wt[i];
            avgTT += tt[i];
        }

        
        avgWT /= n;
        avgTT /= n;

        
        System.out.println("\nJob\tBT\tWT\tTAT\tPriority");
        for (int i = 0; i < n; i++) {
            System.out.println(pno[i] + "\t" + bt[i] + "\t" + wt[i] + "\t" + tt[i] + "\t" + prior[i]);
        }
        System.out.printf("Average Waiting Time: %.2f\n", avgWT);
        System.out.printf("Average Turnaround Time: %.2f\n", avgTT);

        
        sc.close();
    }
}
