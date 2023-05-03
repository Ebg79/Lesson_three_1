public class BonusMilesService {

    public int calculate(int TicketPrice) {
        int OneMiles = 20;
        int NumberMiles = TicketPrice / OneMiles;
        return NumberMiles;
    }
}
