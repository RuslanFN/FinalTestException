import Exceptions.CountException;
import Exceptions.DateFormatExcetion;
import Exceptions.PhoneNumberFormatException;
import Exceptions.SexFormatException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Reader reader = new ReaderData();
        Write write = new WriteToFile();
        Format format = new FormatData();
        doValidation validation = new ValidationData();
        List<String> person = format.stringToList(reader.read());
        try {
            validation.doValid(person);
        } catch (PhoneNumberFormatException e) {
            throw new RuntimeException(e);
        } catch (SexFormatException e) {
            throw new RuntimeException(e);
        } catch (CountException e) {
            throw new RuntimeException(e);
        } catch (DateFormatExcetion e) {
            throw new RuntimeException(e);
        }
        try {
            write.writeFile(person);
        }catch (IOException e){
            System.out.println(e);
        }


    }
}