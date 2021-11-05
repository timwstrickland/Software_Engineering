
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCode, String stopCode) {
        String result = "";
        startCode = startCode.toUpperCase();
        stopCode = stopCode.toUpperCase();
        dna = dna.toUpperCase();
        int startIndex = dna.indexOf(startCode);
        if(startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf(stopCode, startIndex+3);
        result = dna.substring(startIndex, stopIndex+3);
        if((result.length() % 3) == 0) {
            return result.toUpperCase();
        }
        else {
            return "";
        }
    }
    public void testFindGeneSimple() {
        //ATG and TAA both present but not multiple of 3.
        String startCode = "atg";
        String stopCode = "taa";
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna, startCode, stopCode);
        System.out.println("Gene is " + gene);
        //ATG is not present
        dna = "AAATAGTAGAAAATAAGA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, startCode, stopCode);
        System.out.println("Gene is " + gene);
        //TAA is not present
        dna = "AAATGATGGGGTAGAAAGTAG";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, startCode, stopCode);
        System.out.println("Gene is " + gene);
        //Correct DNA strand
        dna = "AAATGCAGGTATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, startCode, stopCode);
        System.out.println("Gene is " + gene);
    }
}
