package lesson_3.HW3;

public class taskHW1 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 9, 2, 1, 7, 8, 9, 0, 5, 11, 33, 77, 99};

        mergeSort(arr);
        
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1){
            return;
        }
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];

        for(int i = 0; i < mid; i++){
            l[i] = arr[i];
        }

        for(int j = 0; j < n-mid; j++){
            r[j] = arr[j+mid];
        }
        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i<left && j<right) {
            if(l[i] < r[j]){
                arr[idx] = l[i];
                i++;
                idx++;
            }else{
                arr[idx] = r[j];
                j++;
                idx++;
            }
        }
        for(int ll = i; ll<left; ll++){
            arr[idx++] = l[ll];
        }
            

        for(int rr = i; rr<right; rr++){
            arr[idx++] = r[rr];
        }
            

    }
    
}
