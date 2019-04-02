
import com.jymj.FingerPrint;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class TestFingerPrint {
    @Test
    public void testCompare() throws IOException{
        FingerPrint fp1 = new FingerPrint(ImageIO.read(new File("c:\\gg\\1.png")));
        FingerPrint fp2 =new FingerPrint(ImageIO.read(new File("c:\\gg\\1.png")));
        System.out.println(fp1.toString(true));
        System.out.printf("sim=%f",fp1.compare(fp2));
    }
}
