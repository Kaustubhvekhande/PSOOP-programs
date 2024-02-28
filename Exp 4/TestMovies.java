
import java.util.*;

class Movies {
    String MName, MType, MHero, MHeroine;
    double MBudget;

    void sort(Movies[] m) {
        int n = m.length; // Number of movies in the array
    
        // Iterate over each movie except the last one
        for (int i = n - 1; i > 0; i--) {
            int minIndex = i; // Assume the current movie has the minimum budget
    
            // Iterate over the remaining movies to find the one with the minimum budget
            for (int j = i - 1; j >= 0; j--) {
                if (m[j].MBudget < m[minIndex].MBudget) {
                    minIndex = j; // Update the index of the movie with the minimum budget
                }
            }
    
            // Swap the current movie (m[i]) with the movie having the minimum budget (m[minIndex])
            Movies temp = m[i]; // Store the current movie in a temporary variable
            m[i] = m[minIndex]; // Replace the current movie with the movie having the minimum budget
            m[minIndex] = temp; // Replace the movie having the minimum budget with the current movie
        }
    }
    
    
    
    

    void display(Movies[] m) {

        for (int i = 0; i < m.length; i++) {
            System.out.println();
            System.out.println("Name of the movie: " + m[i].MName);
            System.out.println("Name of the movie: " + m[i].MType);
            System.out.println("Name of the movie: " + m[i].MHero);
            System.out.println("Name of the movie: " + m[i].MHeroine);
            System.out.println("Name of the movie: " + m[i].MBudget);
        }
    }
}

public class TestMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Movies: ");
        int n = sc.nextInt();
        sc.nextLine();

        Movies[] m = new Movies[n];
        Movies m1 = new Movies();

        for (int i = 0; i < m.length; i++) {
            m[i] = new Movies();

            System.out.println("Enter the Details of the movie " + (i + 1));
            System.out.print("Enter the name of the movie: ");
            m[i].MName = sc.nextLine();
            System.out.print("Enter the Type of the movie: ");
            m[i].MType = sc.nextLine();
            System.out.print("Enter the name of the Hero: ");
            m[i].MHero = sc.nextLine();
            System.out.print("Enter the name of the Heroine: ");
            m[i].MHeroine = sc.nextLine();
            System.out.print("Enter the Budget of the Movie: ");
            m[i].MBudget = sc.nextDouble();
            sc.nextLine();
        }

        m1.sort(m);
        
        System.out.println("Details of movie after sorting are");
        m1.display(m);

    }
}
