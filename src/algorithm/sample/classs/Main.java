package algorithm.sample.classs;

public class Main {

	public static void main(String[] args) {
		
		PDFDocument chapterOne = new PDFDocument("java document 1");

		WordDocument chapterTwo = new WordDocument("java document 2");

		Printer print = new Printer();

		print.printPDFDocument(chapterOne);
		print.printWordDocument(chapterTwo);

		//Main fonksiuyon static oldugu icin static fonksiyon tanimladýk
	}

}
