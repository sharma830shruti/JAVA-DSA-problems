class Solution {
    public String interpret(String command) {
        String str=command.replace("()", "o");
        str=str.replace("(al)", "al");
        return str; 
    }
}

/*optimized*/
class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
        int i = 0;
        int n = command.length();
        
        while (i < n) {
            char ch = command.charAt(i);
            if (ch == 'G') {
                s.append('G');
            } else if (ch == '(') { // Corrected condition
                if (command.charAt(i + 1) == ')') {
                    s.append("o");
                    i++; // Move ahead by one more index
                } else {
                    s.append("al"); 
                    i += 3; // Move ahead by three more indices
                }
            }
            i++;  
        }  
        return s.toString();  
    }
}
