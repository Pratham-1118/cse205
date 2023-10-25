class Solution {
    public int largestInteger(int num) {
        String numString = "" + num;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (Character c : numString.toCharArray()) {
            int n = Character.getNumericValue(c);
            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());
        String res = "";
        int one = 0, two = 0;
        for (int i = 0; i < numString.length(); i++) {
            int n = Character.getNumericValue(numString.charAt(i));
            if (n % 2 == 0) {
                res += even.get(one);
                one++;
            } else {
                res += odd.get(two);
                two++;
            }
        }
        return Integer.parseInt(res);
    }
}