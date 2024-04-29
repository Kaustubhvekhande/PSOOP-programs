class Posting {
    int coursework;
    int apttest;
    int techtest;
    int interview;

    Posting() {
        this.coursework = 0;
        this.apttest = 0;
        this.techtest = 0;
        this.interview = 0;
    }

    Posting(int coursework, int apttest, int techtest, int interview) {
        this.coursework = coursework;
        this.apttest = apttest;
        this.techtest = techtest;
        this.interview = interview;
    }

    Posting(int techtest, int interview) {
        this.techtest = techtest;
        this.interview = interview;
    }

    Posting(int interview) {
        this.interview = interview;
    }

    void display(int option){
        switch (option) {
            case 1 :
                int total = coursework+apttest+techtest+interview;
                if (total >= 80) {
                    System.out.println("Congratulations!! Candidate is eligible for Post of Programmer.");
                }
                else{
                    System.out.println("Sorry! The candidate is not eligible for the post.");
                }
                break;
                

            case 2:
                int  sum = apttest + techtest;
                if (sum >= 85) {
                    System.out.println("Congratulations!! Candidate is eligible for Post of Team Leader.");
                }
                else{
                    System.out.println("Sorry! The candidate is not eligible for the post of Team leader.");
                }
                break;

            case 3:
                if (interview >= 90) {
                    System.out.println("Congratulations!! Candidate is eligible for post of Project Manager.");
                }
                else{
                    System.out.println("Sorry! The Candidate is Not eligible for post of Project Manager.");
                }
            default:
                break;
        }
        
        
    }

}
