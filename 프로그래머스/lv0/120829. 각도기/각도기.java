class Solution {
    public int solution(int angle) {
        return angles.findDisplayNum(angle);
    }

    private enum angles {
        ACUTE(1, 89, 1),
        RIGHT(90, 90, 2),
        OBTUSE(91, 179,3),
        FLAT(180, 180, 4);

        private final int min;
        private final int max;
        private final int displayNum;

        angles(int min, int max, int displayNum) {
            this.min = min;
            this.max = max;
            this.displayNum = displayNum;
        }

        public static int findDisplayNum(int angle) {
            for (angles value : angles.values()) {
                if (angle <= value.max && angle >= value.min) {
                    return value.displayNum;
                }
            }
            return -1;
        }
    }
}