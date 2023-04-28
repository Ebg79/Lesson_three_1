public class BonusMilesService {

    public int calculate(int ticket_price) {
        int one_miles = 20;
        int number_of_miles = ticket_price / one_miles;
        return number_of_miles;
    }
}
