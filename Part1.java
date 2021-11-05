
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna) {
        String startCode = "ATG";
        String stopCode = "TAA";
        String result = "";
        int startIndex = dna.indexOf(startCode);
        if(startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf(stopCode, startIndex+3);
        result = dna.substring(startIndex, stopIndex+3);
        if((result.length() % 3) == 0) {
            return result;
        }
        else {
            return "";
        }
    }
    public void testFindGeneSimple() {
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AAATAGTAGAAAATAAGA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AAATGATGGGGTAGAAAGTAG";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AAATGCAGGTATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AAATGCCCTAACTAGATTAAGAAACC";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    }
}
