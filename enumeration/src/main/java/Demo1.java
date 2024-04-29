import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) {
//        writeln("stdout", "Hello");
//        writeln("stderr", "Error");
//        writeln("file", "Hello File");

        writeln(StreamType.STDERR, "This is an error");
        writeln(StreamType.STDOUT, "I want to write this on console");
    }

    public static void writeln(StreamType stream, String msg){
        if (stream == StreamType.STDOUT) System.out.println(msg);
        else if(stream == StreamType.STDERR) System.err.println(msg);
        else if(stream == StreamType.FILE){
            File file = new File("output.txt");
            try(var bw = new BufferedWriter(new FileWriter(file, true))){
                bw.write(msg + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

enum StreamType{
    STDOUT, STDERR, FILE
}