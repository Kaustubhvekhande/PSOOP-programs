import java.util.Scanner;

interface Searchable {
  boolean search(String keyword);
}

class Document implements Searchable {
  private final String content;

  public Document(String content) {
    this.content = content;
  }

  @Override
  public boolean search(String keyword) {
    return content.toLowerCase().contains(keyword.toLowerCase()); // Perform case-insensitive search
  }
}

class WebPage implements Searchable {
  private final String htmlContent;

  public WebPage(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  @Override
  public boolean search(String keyword) {
    // This is a simplified example. A real web page search might involve parsing
    // HTML
    return htmlContent.toLowerCase().contains(keyword.toLowerCase());
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the document content:");
    String documentContent = scanner.nextLine();

    System.out.println("Enter the web page content (simplified HTML):");
    String webPageContent = scanner.nextLine();

    Document document = new Document(documentContent);
    WebPage webPage = new WebPage(webPageContent);

    System.out.println("Enter the keyword to search:");
    String keyword = scanner.nextLine();

    if (document.search(keyword)) {
      System.out.println("Keyword found in Document");
    } else {
      System.out.println("Keyword not found in Document");
    }

    if (webPage.search(keyword)) {
      System.out.println("Keyword found in WebPage");
    } else {
      System.out.println("Keyword not found in WebPage");
    }

    scanner.close(); // Close the Scanner to avoid resource leaks
  }
}
