class Solution {

    public int countPoints(String rings) {

        boolean[][] colors = new boolean[10][3];

        for (int i = 0; i < rings.length(); i += 2) {

            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            if (color == 'R') {
                colors[rod][0] = true;
            } 
            else if (color == 'G') {
                colors[rod][1] = true;
            } 
            else {
                colors[rod][2] = true;
            }
        }

        int count = 0;

        for (int rod = 0; rod < 10; rod++) {
            if (colors[rod][0] &&
                colors[rod][1] &&
                colors[rod][2]) {

                count++;
            }
        }

        return count;
    }
}