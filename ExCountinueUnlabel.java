public class ExCountinueUnlabel {

    public static void main (String[] args){
        String names[] = {"Beah", "Bianca", "Lance", "Beah"};
        int count = 0;
        for ( int i=0; i<names.length; i++){
            if( !names[i].equals("Beah")){
                continue; //skip next statement
            }
            count++;
        }
        System.out.println("there are" + count + " Beahs in the list");
    }
}