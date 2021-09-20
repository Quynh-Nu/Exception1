public class FunctionBMI {
    public static double calculateBMI(int w, int h){
        return w/Math.pow(h, 2);
    }
    public static boolean checkInput(String w, String h){
        if(hasAtLeastOneCharacter(w) || hasAtLeastOneCharacter(h)){
            throw new RuntimeException("Weight and/or height could not contains non-digit character");
        }
        if(w == null || h == null){
            throw new RuntimeException("Weight and/or height could not be null!");
        }
        if(w.equals("") || h.equals("")){
            throw new RuntimeException("Weight and/or height could not be empty!");
        }
        int weight = Integer.parseInt(w);
        int height = Integer.parseInt(h);
        if(weight < 0 || height <= 0){
            throw new RuntimeException("Weight and/or height should not be negative!");
        }
        else if (weight > Integer.MAX_VALUE || height > Integer.MAX_VALUE){
            throw new RuntimeException("Weight and/or height too big!");
        }else {
            return true;
        }

    }

    private static boolean hasAtLeastOneCharacter(String text){
        for(int i =0; i < text.length(); i++){
            if(Character.isLetter(text.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
