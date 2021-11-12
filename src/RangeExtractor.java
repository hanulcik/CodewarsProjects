public class RangeExtractor {
    public static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int range = 0;
        int index = 0;
        int lo = 0;
        int hi = 0;

        for (int num : arr) {

            //if last number
            if (index == arr.length-1) {
                if (range >= 3) {
                    hi = index;
                    sb.append(arr[lo] + "-" + arr[hi] + ",");
                    range = 0;
                    index++;
                    break;
                }
                if (range == 0) {
                    sb.append(num);
                    break;
                }
                if (range == 2) {
                    hi = index;
                    sb.append(arr[lo] + "-" + arr[hi] + ",");
                    break;
                }
                if (range < 3) {
                    int i = 0;
                    while (i <= range) {
                        sb.append(arr[lo+i] + ",");
                        i++;
                    }
                    range = 0;
                    index++;
                    break;
                }

            }



            //if num is in sequence
            if (num + 1 == arr[index + 1]) {
                if (range == 0) lo = index;
                range++;
                index++;
                continue;
            }

            //if num is end of sequence
            if (index > 0) {
                if ((num+1 != arr[index+1] && num-1 == arr[index-1] && range == 2)) {
                    hi = index;
                    sb.append(arr[lo] + "-" + arr[hi] + ",");
                    range= 0;
                    index++;
                    continue;
                }
            }


            //if num is not in sequence
            if (num+1 != arr[index+1] && range == 0) {
                sb.append(num + ",");
                index++;
                continue;
            }


            //if num is not in sequence and less than range
            if (num+1 != arr[index+1] && range < 3) {
                int i = 0;
                while (i <= range) {
                    sb.append(arr[lo+i] + ",");
                    i++;
                }
                range = 0;
                index++;
                continue;
            }


            //if num is not in sequence and is in range
            if (num+1 != arr[index+1] && range >= 3) {
                hi = index;
                sb.append(arr[lo] + "-" + arr[hi] + ",");
                range = 0;
                index++;
                continue;
            }

//            index++;

        }
        if (sb.toString().endsWith(",")) sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
