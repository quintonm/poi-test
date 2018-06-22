import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class SimpleTest {
    @Test
    public void testLoadAndSave() throws Exception {
        InputStream in = new File("input.xlsx").toURI().toURL().openStream();
        Workbook wb = WorkbookFactory.create(in);
        in.close();
        File file = new File("output.xlsx");
        OutputStream out = new FileOutputStream(file);
        wb.write(out);
        out.close();
    }
}
