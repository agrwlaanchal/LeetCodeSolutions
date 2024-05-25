class Solution {
    public int compress(char[] chars) {

        if (chars.length == 0) {
            return 0; // Handle empty input
        }

        int writeIdx = 0;
        int count = 1;

        char ch = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ch) {
                count++;
            } else {
                // Write the previous character and its count
                chars[writeIdx++] = chars[i - 1];
                writeIdx = appendCount(chars, writeIdx, count);
                count = 1;
                ch = chars[i];// Reset count for the next character
            }
        }

        // Handle the last group (if any)
        chars[writeIdx++] = chars[chars.length - 1];
        if (count > 1) {
            writeIdx = appendCount(chars, writeIdx, count);
        }
        return writeIdx;

    }

    private int appendCount(char[] chars, int writeIdx, int count) {
        if (count > 1) {
            String countStr = String.valueOf(count);
            for (char digit : countStr.toCharArray()) {
                chars[writeIdx++] = digit;
            }
        }
        return writeIdx;
    }

}