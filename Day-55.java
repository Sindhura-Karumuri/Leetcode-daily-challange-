Count the number of possible triangles
Difficulty: MediumAccuracy: 28.53%Submissions: 135K+Points: 4
Given an integer array arr[]. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle. 

A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.

  class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < n; j++) {
                while (k < n && arr[i] + arr[j] > arr[k]) ++k;
                if (k > j) count += k - j - 1;
            }
        }
        return count;
    }
}
