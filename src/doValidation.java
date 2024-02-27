import Exceptions.CountException;
import Exceptions.DateFormatExcetion;
import Exceptions.PhoneNumberFormatException;
import Exceptions.SexFormatException;

import java.util.List;

public interface doValidation {
    void doValid(List<String> person) throws PhoneNumberFormatException, SexFormatException, CountException, DateFormatExcetion;
}
