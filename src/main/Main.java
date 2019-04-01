package main;

public class Main {

    public static void main(String[] args) {
        String stones = "aAAbbbb";
        String jewls = "aA";
        String[] stonesParts = stones.split("");
        String[] jewelsParts = stones.split("");
        int counter = 0;
        for(int i=0;i<stonesParts.length;i++){
            if(checkRarity(stonesParts[i],jewelsParts)==true){
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static boolean checkRarity(String possibleJewel, String[] jewelsPart){
        for(int i=0;i<jewelsPart.length;i++){
            System.out.println(possibleJewel);
            System.out.println(jewelsPart[i]);
            if(possibleJewel==jewelsPart[i]){
                return true;
            }
        }
        return false;
    }
}
