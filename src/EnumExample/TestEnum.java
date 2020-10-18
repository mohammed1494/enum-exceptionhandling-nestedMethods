package EnumExample;

public class TestEnum {
    public static void main(String[] args) {
        Week dayOfTheWeek = new Week(Day.Friday); //Why is it a specific day and not the entire class or how do we pass entire class?
        dayOfTheWeek.whatIsMyTask("Friday");
    }
}
