import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import java.util.regex.Matcher;

interface Messenger{
    void displayMessage();
}
class SMS implements Messenger{
   public  void displayMessage(){
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter Mobile Number:");
       long phoneNumber=scanner.nextLong();
       String phonetext=String.valueOf(phoneNumber);
       if(phonetext.matches("^[6-9]\\d{9}$"))
       {
           System.out.println("Enter the Message:");
           String messagedis= scanner.next();
           System.out.println("Send:"+phoneNumber+"\nMessage:"+messagedis);
       }
       else {
           System.out.println("Invalid Phone Number.");
       }
    }
}
class Email implements Messenger{
    public  void displayMessage(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Email Id:");
        String emailad= scanner.next();
        if(emailad.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            System.out.println("Enter the content:");
            String emailcontent=scanner.next();
            System.out.println("Sent to:"+emailad+"\nContent:"+emailcontent);
        }
        else {
            System.out.println("Invalid Email address");
        }


    }
}
class WhatsApp implements Messenger{
    public  void displayMessage(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Mobile Number:");
        long phoneNumber=scanner.nextLong();
        String phonetext=String.valueOf(phoneNumber);
        if(phonetext.matches("^[6-9]\\d{9}$"))
        {
            System.out.println("Enter 1 of user has WhatsApp if not 0.");
            int option=scanner.nextInt();
            if(option==1)
            {
                System.out.println("Enter the whatsApp content:");
                String whatsappContent=scanner.next();
                System.out.println("Sent to:"+phoneNumber+"\nMessage content:"+whatsappContent);
            } else if (option==0) {
                System.out.println("This phone Number does't have Whatsapp.");
            }
        }
        else {
            System.out.println("Invalid Phone Number.");
        }
    }


}
public class Main {
    public static void main(String[] args) {

        Messenger sms=new SMS();
        Messenger email=new Email();
        Messenger whatsapp=new WhatsApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for SMS\nEnter 2 for Email\nEnter 3 for Whatsapp\nEnter 4 for exit");
        int option= scanner.nextInt();
        while(option!=4)
        {
            switch(option){
                case 1:
                    sms.displayMessage();
                    break;
                case 2:
                    email.displayMessage();
                    break;
                case 3:
                    whatsapp.displayMessage();
                    break;
                default:
                    System.out.println("Enter the valid option");
            }
        }
        System.out.println("Enter 1 for SMS\nEnter 2 for Email\nEnter 3 for Whatsapp\nEnter 4 for exit");
        option= scanner.nextInt();


    }
}