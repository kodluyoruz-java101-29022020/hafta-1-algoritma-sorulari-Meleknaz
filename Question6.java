
public class Question6 {

	public static void main(String[] args) {
		
		 PDFDocument pDocument=new  PDFDocument("User_guide");
		 WordDocument wDocument=new WordDocument("installation_guide");
		 Printer printer = new Printer();
		 
		 printer.printPDFDocument(pDocument);
		 printer.printWordDocument(wDocument);
		 

	}

}
