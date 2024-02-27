import java.util.List;

public interface Validation {
    boolean CountData(List<String> data);
    boolean isDate(String date);
    boolean isSex(String sex);
    boolean isNumber(String number);
}
