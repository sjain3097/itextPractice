package itextTrial;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
//https://examples.javacodegeeks.com/core-java/itext-tutorial-beginners/
public class T1 {
	public static void main(String args[]) throws FileNotFoundException, DocumentException {
		Document document = new Document();
		PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Hello.pdf"));
		document.open();
		Paragraph paragraph = new Paragraph();
		paragraph.add("Hello World");
		document.add(paragraph);
		System.out.println(document);
		document.close();
	}
}
