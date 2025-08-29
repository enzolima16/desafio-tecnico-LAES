import java.util.Arrays;

public class Soma {
    public static int[] soma(int[] nums, int target){
        int[] valores;
        for(int i=0; i<nums.length; i++){
            if ((nums[i] + nums[i+1] == target) && (i+1<=nums.length-1)){
                valores = new int[] {i,i+1};
                return valores;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numeros = {2,7,11,15};
        int target = 9;
        int[] soma = soma(numeros, target);
        System.out.println(Arrays.toString(soma));
    }
}
