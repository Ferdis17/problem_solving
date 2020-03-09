import com.itextpdf.text.*;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class CreatePdfDocument {


    private static final Logger logger = LoggerFactory.getLogger(CreatePdfDocument.class);

        public static void main(String... args) throws FileNotFoundException, DocumentException {

            // create document
            Document document = new Document(PageSize.A4, 36, 36, 90, 36);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HeaderFooter.pdf"));

            // add header and footer
            PdfTemplateSample event = new PdfTemplateSample();
            writer.setPageEvent(event);

            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(60);
            table.setWidths(new int[]{5, 5, 7, 5});

            Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

            PdfPCell hcell;
            hcell = new PdfPCell(new Phrase("Date", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Description", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Transaction Type", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Amount", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);

            PdfPCell cell;

            cell = new PdfPCell(new Phrase("03/03/2020"));
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Investment in Tech"));
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);


            cell = new PdfPCell(new Phrase("Check paid"));
            cell.setPaddingLeft(5);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(("567,000 USD")));
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell.setPaddingRight(5);
            table.addCell(cell);
            // write to document
            document.open();
            document.add(table);
//            document.newPage();
//            document.add(new Paragraph("Second  page"));
//            document.newPage();
//            document.add(new Paragraph("Third  page"));
            document.close();
        }

    }


