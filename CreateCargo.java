import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateCargo {
  Cargo temp;

  public CreateCargo() {
    temp = new Cargo();
    temp.weight = 0;
    temp.storeNum = 0;
    temp.name = "--";
    temp.entryDate = new Date();
    temp.storagePeriod = 1;
  }

  // #region
  public CreateCargo setWeight(int weight) {
    temp.weight = weight;
    return this;
  }

  public CreateCargo setStore(int storeNum) {
    temp.storeNum = storeNum;
    return this;
  }

  public CreateCargo setName(String name) {
    temp.name = name;
    return this;
  }

  /**
  * @param entryDate строка формата "dd.MM.yyyy"
  */
  public CreateCargo seteEntryDate(String entryDate) {
    SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
    try {
      temp.entryDate = ft.parse(entryDate);
    } catch (Exception e) {
        System.out.println("Не верный формат даты");
    }
    return this;
  }

  /**
  * @param storagePeriod сколько дней может храниться товар от даты поступления.
  */
  public CreateCargo setStoragePeriod(Integer storagePeriod) {
    temp.storagePeriod = storagePeriod;
    return this;
  }

  // #endregion

  public Cargo Create() {
    return temp;
  }
}
