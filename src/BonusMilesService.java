public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int oneMiles = 20;
        int numberMiles = ticketPrice / oneMiles;
        return numberMiles;
    }
}
