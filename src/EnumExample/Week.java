package EnumExample;

public class Week {

    public Day day;
    public Week() {}//default constructor
    public Week(Day day){
        this.day = day;
    }
    public void whatIsMyTask(String day){
        switch(day){
            case "Monday":
                System.out.println("Monday is the first class of the week");
                break;
            case "Tuesday":
                System.out.println("Tuesday we start the assigned homework");
                break;
            case "Wednesday":
                System.out.println("Wednesday we do the other homework such as code lab");
                break;
            case "Thursday":
                System.out.println("Thursday is the second class of the week and we have a quiz");
                break;
            case "Friday":
                System.out.println("Friday we watch the class video and do our own projects");
                break;
            case "Saturday":
                System.out.println("Saturday we upload the project to GitHub");
                break;
            case "Sunday":
                System.out.println("Sunday we review the entire week");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }

}
