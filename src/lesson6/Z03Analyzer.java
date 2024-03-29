package lesson6;

public class Z03Analyzer {
    
    //forloop encapsulated into static helper method
    public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer) {
        for (String currentStr : strList) {
            if (analyzer.analyze(currentStr, searchStr)) {
                System.out.println("Match: " + currentStr);
            }
        }
    }

    public static void main(String[] args) {
        String[] strList01 = {"tomorrow", "toto", "to", "timbukto", "the", "hello", "heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);

        
        // Call a concrete class that implements StringAnalyzer
        ContainsAnalyzer contains = new ContainsAnalyzer();

        System.out.println("===Contains===");
        Z03Analyzer.searchArr(strList01, searchStr, contains);
    }
}
