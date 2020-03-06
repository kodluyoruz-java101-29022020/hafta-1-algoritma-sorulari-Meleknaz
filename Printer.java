
public class Printer {
	
	public static void printPDFDocument(PDFDocument PDFprint) {
		
		System.out.println(PDFprint.getBody());
	}
	
	public static void printWordDocument(WordDocument Wordprint) {
		
		System.out.println(Wordprint.getBody());
	}

}
