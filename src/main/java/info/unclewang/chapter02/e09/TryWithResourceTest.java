package info.unclewang.chapter02.e09;

import java.io.*;

/**
 * TrywithResources比Tryfinally好用
 */
public class TryWithResourceTest {
    /**
     * @throws IOException
     * 如果有异常，try的会有异常，finally会有异常，异常会掩盖
     * 而且多个资源，代码难看
     */
    public static void bad() throws IOException {
        BufferedReader br = new BufferedReader(null);
        try {
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }

    public static void good() throws IOException {
        try (InputStream in = new FileInputStream("");
             OutputStream out = new FileOutputStream("")) {
            while (true) {
            }
        }
    }
}
