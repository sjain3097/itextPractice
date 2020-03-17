package itextTrial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class T2 {
//	when we write a chunk in a pdf it keeps adding in same line from left to right. 
//	It does not know when to add a new line
//	That is why, it is considered better to wrap chunks in the Elements like Phrase and Paragraph.
	public static void main(String args[]) throws FileNotFoundException, DocumentException {
		Document document = new Document();
		PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Hello.pdf"));
		document.open();
		for(int i=0; i<115; i++) {
			Chunk chunk = new Chunk("Hello World ");
			document.add(chunk);
		}
		document.close();
		
	}
}
