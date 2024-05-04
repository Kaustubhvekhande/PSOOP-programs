import java.util.Scanner;


class Book{
    int [][]bookRating;
    double avgRating[];


    Book(int book, int readers){
        bookRating = new int[book][readers];
        avgRating = new double[book];
    }

    void getAvg(){
        for (int i = 0; i < bookRating.length; i++) {
            
        }
    }

    
}

public class BookRating {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int book= sc.nextInt();
        System.out.print("Enter the number of readers: ");
        int readers= sc.nextInt();

        Book b = new Book(book, readers);

        for (int i=0 ;i<b.bookRating.length; i++) { 
            for(int j=0;j<b.bookRating[i].length;j++){
                System.out.printf("Enter the raing of  book %d to reader %d : ", i+1 ,j+1);
                b.bookRating[i][j] = sc.nextInt();
            }
        }
        

        sc.close();
    }
}