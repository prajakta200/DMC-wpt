public class Code13 {
    
    public static void main(String[] args) {
        String[] array = {"apple","banana","mango","apple","papaya","banana","dragonfruit"};
 
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                
                if ((array[i]==(array[j]))) {
                    
                    System.out.println("Duplicate Element is : " + array[j]);
                }
            }
        }
    }    
}