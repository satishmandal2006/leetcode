import java.util.*;

class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();

        String[] arr = path.split("/");

        for (int i = 0; i < arr.length; i++) {

            String str = arr[i];

            if (str.equals("") || str.equals(".")) {
                continue;
            }

            else if (str.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            else {
                st.push(str);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (String str : st) {
            ans.append("/").append(str);
        }

        if (ans.length() == 0) {
            return "/";
        }

        return ans.toString();
    }
}