import Exceptions.CountException;
import Exceptions.DateFormatExcetion;
import Exceptions.PhoneNumberFormatException;
import Exceptions.SexFormatException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class ValidationData implements Validation, doValidation{
    @Override
    public boolean CountData(List<String> data) {
        if (data.size() == 6)
            return true;
        else
            return false;
    }

    @Override
    public boolean isDate(String date){
        DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        boolean isDate = true;
        try {
            df.parse(date);
        }catch (ParseException e){
            isDate = false;
        }
        finally {
            return isDate;
        }
    }

    @Override
    public boolean isSex(String sex) {
        if (sex.equals("m") || sex.equals("f"))
            return true;
        return false;
    }

    @Override
    public boolean isNumber(String number) {
        if (number.toCharArray().length == 11){
            try {
                Integer.parseInt(number);
            }catch (NumberFormatException e){
                return false;
            }finally {
                return true;
            }
        }
        return false;
    }

    @Override
    public void doValid(List<String> person) throws PhoneNumberFormatException, SexFormatException, CountException, DateFormatExcetion {
        if (CountData(person)) {
            if (!isDate(person.get(3))){throw new DateFormatExcetion("Неверный формат даты");}
            if (!isNumber(person.get(4))){throw new PhoneNumberFormatException("Неверный формат даты");}
            if (!isSex(person.get(5))){throw new SexFormatException("Неверный формат пола");}
        }
        else throw new CountException("Неверное кол-во данных");
    }
}
