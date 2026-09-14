class Solution {
    public int totalFruit(int[] fruits) {
        int right = 0;
        int left = 0;

        int maxlength = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while(right < fruits.length){
            int a = fruits[right];

            map.put(a, map.getOrDefault(a, 0) + 1);

            while(map.size() > 2){
                int b = fruits[left];

                map.put(b, map.get(b) - 1);

                if(map.get(b) == 0){
                    map.remove(b);
                }

                left ++;
            }
            int length = right - left + 1;

            maxlength = Math.max(length, maxlength);

            right ++;
        }

        return maxlength;
    }
}