import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class WriteToFile implements Write{
    public void writeFile(List<String> person) throws IOException{
        try( FileWriter writer = new FileWriter("Data/" + person.get(0) + ".txt")){
            writer.write(person.get(0) + " " + person.get(1) + " " + person.get(2) + " " + person.get(3) + " " + person.get(4) + " " + person.get(5));
            System.out.println("Файл записан");
        }catch (IOException e){
            throw new IOException(e.getMessage());
        }
    }
}
