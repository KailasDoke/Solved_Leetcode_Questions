class Solution {
    public int maximumPopulation(int[][] logs) {

        int maxPeople = 0;
        int answerYear = 0;

        for (int year = 1950; year <= 2050; year++) {

            int count = 0;

            for (int i = 0; i < logs.length; i++) {

                if (logs[i][0] <= year && year < logs[i][1]) {
                    count++;
                }
            }

            if (count > maxPeople) {
                maxPeople = count;
                answerYear = year;
            }
        }

        return answerYear;
    }
}