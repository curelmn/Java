package compile;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//这个类来创建进行，并执行 javac，java命令
public class CommandUtil {
    public static int run( String cmd,String stdoutFile,String stderrFile) throws IOException, InterruptedException {
        Process process=Runtime.getRuntime().exec(cmd);
        if (stdoutFile !=null){
            InputStream stdoutFrom=process.getInputStream();
            FileOutputStream stdoutTo=new FileOutputStream(stdoutFile);
            while (true){
                int ch=stdoutFrom.read();
                if (ch==-1){
                    break;
                }
                stdoutTo.write(ch);
            }
            stdoutFrom.close();
            stdoutTo.close();
        }
        if (stderrFile !=null){
            InputStream stderrFrom=process.getErrorStream();
            FileOutputStream stderrTo=new FileOutputStream(stderrFile);
            while (true){
                int ch=stderrFrom.read();
                if (ch==-1){
                    break;
                }
                stderrTo.write(ch);
            }

            stderrFrom.close();
            stderrTo.close();
        }
        int exitCode=process.waitFor();
        return exitCode;
    }
}
