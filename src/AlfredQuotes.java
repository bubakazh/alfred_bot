import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Welcome home, Master Wayne.";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Welcome to Wayne Manor, %s. Please do make yourself at home.", name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date + ", Master Wayne. Why do you ask?";
        // I WANT TO CHANGE THIS FUNCTION SO THAT IT ALSO OUTPUTS THE DATE AND TIME THAT THE LAST TIME THIS
        // FUNCTION WAS CALLED. SO THE NEXT TIME I WOULD CALL IT, IT WOULD SAY, "Last you asked, it was Wed
        // Sep 28 14:31:54 PDT 2022, Master Wayne.", then "It is currently blah blah blah..."
    }

    public String respondBeforeAlexis(String conversation) {
        // INTELLIJ ASKED ME IF I WANTED TO SWITCH OUT indexOf() for contains(), SO I DID IT.
        if (conversation.contains("Alexis")){
            return "Oh, allow me, Master Wayne. Alexis, is... how shall we say... unfamiliar with your musical preferences.";
        } else if (conversation.contains("Alfred")){
            return "As you wish, Master Wayne.";
        } else {
            return "Right. I shall retire to my quarters.";
        }
    }

    // NINJA BONUS
    // public String guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
