public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 6, 7, 3 },
                { 5, 8, 1 },
                { 4, 9, 5 } };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int MaxWealth = Integer.MIN_VALUE;
        for (int user = 0; user < accounts.length; user++) {
            int userWealth = 0;
            for (int account = 0; account < accounts[user].length; account++) {
                userWealth += accounts[user][account];
            }
            // now we have sum of net wealth of a user
            // check with overall answer
            if (userWealth > MaxWealth) {
                MaxWealth = userWealth;
            }
        }
        return MaxWealth;
    }
}
