import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of plays: ");
        int nPlay = sc.nextInt();

        System.out.print("Enter the number of musicals: ");
        int nMusicals = sc.nextInt();

        Play[] p = new Play[nPlay];
        String playDirector, playTitle, playWriter;
        int numTicketsSold;

        for (int i = 0; i < nPlay; i++) {
            System.out.println("Enter the details of Play " + (i + 1));
            sc.nextLine();
            System.out.print("Enter the title:");
            playTitle = sc.nextLine();
        
            System.out.print("Enter the Director:");
            playDirector = sc.nextLine();
        
            System.out.print("Enter the Writer:");
            playWriter = sc.nextLine();
        
            System.out.print("Enter number of tickets sold:\t");
            numTicketsSold = sc.nextInt();
            sc.nextLine(); // Consume newline character
        
            p[i] = new Play(playTitle, playDirector, playWriter);
            p[i].setPlayTickets(numTicketsSold);
        }
        

        Musical[] m = new Musical[nMusicals];
        String musicalTitle, musicalDirector, musicalComposer, musicalWriter, musicalLyricist;
        int musicalTickets;

        for (int i = 0; i < nPlay; i++) {
            System.out.println("Enter the details of Musicals " + (i + 1));
            
            System.out.print("Enter the title:");
            musicalTitle = sc.nextLine();

            System.out.print("Enter the Director:");
            musicalDirector = sc.nextLine();

            System.out.print("Enter the Writer:");
            musicalWriter = sc.nextLine();

            System.out.print("Enter the Composer:");
            musicalComposer = sc.nextLine();

            System.out.print("Enter the Lyricist:");
            musicalLyricist = sc.nextLine();

            System.out.print("Enter number of tickets sold:\t");
            musicalTickets = sc.nextInt();
            sc.nextLine();

            m[i] = new Musical(musicalTitle, musicalDirector, musicalWriter, musicalComposer, musicalLyricist);
            m[i].setMusicalTicket(musicalTickets);

        }

        int totalPlayCollection = 0;
        for (int i = 0; i < nPlay; i++) {
            totalPlayCollection += p[i].getCollection();
        }

        // Calculate total collection of musicals
        int totalMusicalCollection = 0;
        for (int i = 0; i < nMusicals; i++) {
            totalMusicalCollection += m[i].getCollection();
        }

        System.out.println("The total number of performence are " + p[nPlay - 1].performances);
        System.out.println("Total collection of plays: " + totalPlayCollection);
        System.out.println("Total collection of musicals: " + totalMusicalCollection);
        System.out.println("The Total collections are: " + (totalMusicalCollection + totalPlayCollection));

        // Display details of plays
        System.out.println();
        System.out.println("Details of Plays:");
        for (int i = 0; i < nPlay; i++) {
            System.out.println("*************************************************");
            System.out.println("Musical "+(i+1)+": ");
            System.out.println(p[i].toString());
            System.out.println();
        }
        //System.out.println();
        // Display details of musicals
        System.out.println("Details of Musicals:");
        for (int i = 0; i < nMusicals; i++) {
            System.out.println("*************************************************");
            System.out.println("Musical "+(i+1)+": ");
            System.out.println(m[i].toString());
            System.out.println();
        }

    }
}
