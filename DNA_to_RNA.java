public class DNA_to_RNA {
    public static String convert(String dna){
        String output = "";
        char[] handle = dna.toCharArray();
        if(handle.length != 0) {
            for (int i = 0; i < handle.length; i++) {
                if (handle[i] == 'T') {
                    handle[i] = 'U';
                }
                else if(handle[i] == 'U'){
                    handle[i] = 'T';
                }
                output += handle[i];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String sample = "";
        String output = convert(sample);
        System.out.println(output);
    }
}
