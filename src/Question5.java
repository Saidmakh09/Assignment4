public class Question5 {



    private static String transcribeToRNA(String dnaSequence) {
        String rnaSequence = "";

        for (char nucleotide : dnaSequence.toCharArray()) {
            switch (nucleotide) {
                case 'A':
                    rnaSequence += 'A';
                    break;
                case 'T':
                    rnaSequence += 'U';
                    break;

                    //have to ony switch for T
                case 'C':
                    rnaSequence += 'C';
                    break;
                case 'G':
                    rnaSequence += 'G';
                    break;
                default:
                    break;
            }
        }

        return rnaSequence;
    }

    public static void main(String[] args) {
        String input1 = "AGCTGGGAAACGTAGGCCTA";
        String input2 = "TTTTTTTTTTGGCGCG";
        String input3 = "CTTTGGGACTAGTAACCCATTTCGGCT";

        System.out.println(transcribeToRNA(input1));
        System.out.println(transcribeToRNA(input2));
        System.out.println(transcribeToRNA(input3));
    }
}
