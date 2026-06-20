interface Document {
    void open();
}
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}
class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}
class excelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}
abstract class DocumentFactory {
    abstract Document createDocument();
    public void openDocument() {
        Document document = createDocument();
        document.open();
    }
}
class wordDocumentFactory extends DocumentFactory {
    @Override
    Document createDocument() {
        return new WordDocument();
    }
}
class pdfDocumentFactory extends DocumentFactory {
    @Override
    Document createDocument() {
        return new PdfDocument();
    }
}
class excelDocumentFactory extends DocumentFactory {
    @Override
    Document createDocument() {
        return new excelDocument();
    }
}
class FactoryMethodPattern {
    public static void main(String[] args) {
         DocumentFactory factory;
         factory = new wordDocumentFactory();
         factory.openDocument();
         factory = new pdfDocumentFactory();
         factory.openDocument();
         factory = new excelDocumentFactory();
         factory.openDocument();    
    }
}
/*output:
Opening Word Document
Opening PDF Document
Opening Excel Document
*/