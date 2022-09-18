import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;
class Challenge1 {
    public static void main(String[] args) {
while(true)
        {
        try
        {
        String name;
        String surname;
        String date_of_birth;
        double distance_from_store,convertDistance,conversion = 1.609344;
        Date date ;
        SimpleDateFormat format;
       
        String[] year;
        int ageSub=0,getUser=0;
        
        Scanner scan= new Scanner(System.in);
        
        System.out.print("What is your name :");
        name=scan.next();
        
        System.out.print("What is your surname :");
        surname=scan.next();
        
        try
        {
        System.out.print("Enter date of your birth in this formart(DD/MM/YYYY):");
        date_of_birth=scan.next();
                
        format=new SimpleDateFormat("DD/MM/YYYY");
        date=format.parse(date_of_birth);
        }
        catch(Exception ex)
        {
            System.out.println("Please make sure you enter valid DATE Format"+ex.toString());
            continue;
        }

        System.out.print("How faris your favourite store from your home?  ");
        distance_from_store=scan.nextDouble();
        
        
        System.out.println("*****************************************************");
        System.out.println("-------------HELLO, " +name+" "+surname+"------------");        
        year=date_of_birth.split("/");
        format= new SimpleDateFormat("YYYY");
        date=new Date();
        getUser=Integer.valueOf(year[2]);
        
        convertDistance=distance_from_store/conversion;
        ageSub=(Integer.valueOf(format.format(date))-getUser);
        double meter=distance_from_store*1000;
        long miliSeconds=Duration.ofHours(ageSub).toMillis();
        long Seconds=Duration.ofSeconds(ageSub).getSeconds();
        
        String hex=Integer.toHexString(ageSub);
        String octal=Integer.toOctalString(ageSub);
        String binary=Integer.toBinaryString(ageSub);
        System.out.println("YOU ARE "+" "+ageSub+" YEARS OLD");    
        System.out.println("DISTANCE IN MILES IS "+" :"+String.valueOf(convertDistance));
        System.out.println("DISTANCE IN METERS :"+String.valueOf(meter));
        System.out.println("AGE IN MILISECONDS :"+String.valueOf(Seconds));
        System.out.println("AGE IN MILISECONDS :"+String.valueOf(miliSeconds));
        System.out.println("USER'S BIRTH DAY IN HEX : "+hex);
        System.out.println("USER'S BIRTH DAY IN OCTAL : "+octal);
        System.out.println("USER'S BIRTH DAY IN BINARY : "+binary);
        System.out.println("*****************************************************");
        break;
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        }
        
    }
}