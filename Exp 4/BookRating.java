import java.util.Scanner;

class Book {
    int rating[][];
    double ratingAvg[];

    Book(int books) {
        rating = new int[books][]; // Initialize only the first dimension
        ratingAvg = new double[books];
    }

    void setdim(int i, int ratings) {
        rating[i] = new int[ratings]; // Initialize the second dimension
    }

    void getAvg() {
        int sum = 0;
        for (int i = 0; i < rating.length; i++) {
            sum = 0;
            for (int j = 0; j < rating[i].length; j++) {
                sum = sum + rating[i][j];
            }
            ratingAvg[i] = (double) sum / rating[i].length;
        }
    }

    void getMax() {
        double temp = ratingAvg[0];
        int index = 0;
        for (int i = 1; i < ratingAvg.length; i++) {
            if (ratingAvg[i] > temp) {
                temp = ratingAvg[i];
                index = i;
            }
        }
        System.out.printf("Book %d is the most popular book\nAnd its rating is : %.3f", index + 1, temp);
    }

}

public class BookRating {
    public static void main(String[] args) {


        // You can then print something to the cleared screen
        System.out.println("Terminal cleared!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int books = sc.nextInt();
        Book b = new Book(books);
        int ratings = 0;
        for (int i = 0; i < books; i++) {
            System.out.printf("Enter the Number of ratings for book %d: ", i + 1);
            ratings = sc.nextInt();
            b.setdim(i, ratings);
            for (int j = 0; j < b.rating[i].length; j++) {
                System.out.printf("Enter the rating %d for book %d(out of 5): ", j + 1, i + 1);
                b.rating[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        b.getAvg();
        b.getMax();
        sc.close();
    }
}
