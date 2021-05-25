package easy.searchInsertPosition;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low =0;
        int high = nums.length;

        while (low < high) {
            int mid = (low + high) /2;
            if (nums[mid] == target) {
                return mid;
            }
            int oneMinus = mid - 1;
            int onePlus = mid + 1;

//            if (oneMinus >= 0 && target > nums[oneMinus] && target < nums[mid]) {
//                return mid;
//            }
            if (onePlus < nums.length && target < nums[onePlus] && target > nums[mid]) {
                return mid + 1;
            }
            if (target < nums[mid]) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return nums.length;
    }
}
