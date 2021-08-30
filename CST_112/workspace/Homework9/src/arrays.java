
public class arrays {

	public static void main(String[] args) {
		int[] nums = {1,1,2,2,2,3,4,5,5,6,7};
		System.out.println(average(nums));
		System.out.println(median(nums));
		System.out.println(mode(nums));
	}
	
	public static int mode(int[] array){
		int mode = 0;
		int modeCount = 0;
		for(int i = 0; i < array.length; i++){
			int count = 0;
			for(int j = 0; j < array.length; j++){
				if(array[j] == array[i])
					count++;
			}
			if(count > modeCount){
				modeCount = count;
				mode = array[i];
			}
		}
		return mode;
	}
	
	public static int median(int[] array){
		return array[array.length / 2];
	}
	
	public static double average(int[] array){
		double sum = 0.0;
		for(int i = 0; i < array.length; i++) sum += array[i];
		return sum / array.length;
	}
}
