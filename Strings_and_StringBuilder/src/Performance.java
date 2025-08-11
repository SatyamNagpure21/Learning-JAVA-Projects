public class Performance {
    public static void main(String[] args) {

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series = series + ch;
        }

        System.out.println(series);

        // its taking time complexity of O(N^2)
        //1+2+3+4+5+......... till n
        //"a","ab","abc","abcd",.............    will havd no reference variable
    }
}
