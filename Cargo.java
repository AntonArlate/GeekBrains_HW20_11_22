import java.text.*;
import java.util.*;

public class Cargo {

  int weight;
  int storeNum;
  String name;
  Date entryDate;
  Integer storagePeriod;

  public void print() throws ParseException {

    SimpleDateFormat ft = new SimpleDateFormat("dd");
    System.out.println(
        String.format(
            "weight - %d \nstoreNum - %d \nname - %s \nentryDate - %te %<tB %<tY \nstoragePeriod - %d \nlimit - %te %<tB %<tY",
            weight,
            storeNum,
            name,
            entryDate,
            storagePeriod,
            entryDate.getTime() + ft.parse(Integer.toString(storagePeriod+1)).getTime()
            ));
  }
}
