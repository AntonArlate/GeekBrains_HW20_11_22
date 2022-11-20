import java.text.*;
// import java.util.*;


public class test {

    public static void main(String[] args) throws InterruptedException, ParseException {
        
        Cargo c1 = new Cargo();
        CreateCargo c2 = new CreateCargo();
        
        c1 = c2.Create();
        c1.print();
        
        c1 = c2.setStoragePeriod(32).seteEntryDate("11.05.2021").Create();
        c1.print();
        
        c1 = c2.seteEntryDate("s..05.2021").Create();
        c1.print();
    
        
        // Date date = new Date();
        // System.out.printf("%1$s %2$td %2$tB %2$tY", "Дата:", date);
        // System.out.println();
        
        // SimpleDateFormat ft = new SimpleDateFormat("dd");
        // Integer in_day = 2;
        
        // System.out.println(
        //     String.format( "%te %<tB %<tY",
        //     date.getTime() + ft.parse(Integer.toString(in_day)).getTime()
        //     )
        //     ); 
        
        // String add_day = in_day.toString();
        
        // Date parse_date;
        // parse_date = ft.parse(add_day);
        // System.out.println(parse_date);
        
        // date.setTime(date.getTime() + parse_date.getTime());
        // System.out.printf("%1$s %2$td %2$tB %2$tY", "Дата:", date);
    }
}