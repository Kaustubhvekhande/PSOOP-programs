abstract class AmusementPark {
    abstract int getCost(boolean isAge, boolean isWeekend, int gamesPlayed);
}

class Esselworld extends AmusementPark {
    int getCost(boolean isAge, boolean isWeekend, int gamesPlayed) {
        int cost;

        if (isAge)
            cost = 1050;
        else
            cost = 660;

        if (isWeekend)
            cost += 300;

        if (gamesPlayed > 3 && gamesPlayed < 6) {
            cost = cost + (gamesPlayed - 3) * 50; // Assuming cost is already declared as integer
        }
        return cost;
    }

    

}

class Imagica extends AmusementPark {
    int getCost(boolean isAge, boolean isWeekend, int gamesPlayed) {
        int cost;

        if (isAge)
            cost = 1500;
        else
            cost = 1100;

        if (isWeekend)
            cost += 300;

        if (gamesPlayed > 3 && gamesPlayed < 8) {
            cost = cost + (gamesPlayed - 3) * 50; // Assuming cost is already declared as integer
        }
        return cost;
    }
}