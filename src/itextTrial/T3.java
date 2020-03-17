package itextTrial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

public class T3 {
//	we can just add the chunks to the Phrase Element and avoid overriding in the same line
	public static void main(String args[]) throws FileNotFoundException, DocumentException {
		Document document = new Document();
		PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Hello.pdf"));
		document.open();
		Phrase phrase = new Phrase();
		Chunk chunk = null;
		for(int i=0; i<15; i++) {
			chunk = new Chunk("Hello Everyone");
			phrase.add(chunk);
		}
		document.add(phrase);
		document.close();
	}
}
