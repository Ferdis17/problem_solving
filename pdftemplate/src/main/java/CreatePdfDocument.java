import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreatePdfDocument {




        public static void main(String... args) throws FileNotFoundException, DocumentException {

            // create document
            Document document = new Document(PageSize.A4, 36, 36, 90, 36);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HeaderFooter.pdf"));

            // add header and footer
            PdfTemplateSample event = new PdfTemplateSample();
            writer.setPageEvent(event);

            // write to document
            document.open();
            document.add(new Paragraph("Adding a header to PDF Document using iText."));
            document.newPage();
            document.add(new Paragraph("Adding a footer to PDF Document using iText."));
            document.close();
        }

}
