import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
小明得到一个只包含大小写英文字母的字符串s，下标从1开始计算。
现在他希望得到这个字符串下标的一个奇怪的集合。这个奇怪的集合需要满足的条件是：
1. 集合中的任意下标i对应的字母s[i]必须是小写字母
2. 对于集合中的任意两个下标i、j，对于任意数字k，i<=k<=j，有s[k]是小写字母
3. 集合中的下标对应的字母是两两不同的
4. 集合中的数字尽可能的多
帮助小明计算这个集合最多可以有多少下标。
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            String newString = "";
            for (char c : chars) {
                if(c >= 'A' && c <= 'Z' ) {
                    newString += " ";
                } else {
                    newString += c;
                }
            }
            String[] st = newString.split(" ");
            int numindex = 1;
            ArrayList<Set<Character>> list = new ArrayList<>();
            for (String ss : st) {
                Set<Character> set = new HashSet<>();
                for (int i = 0; i < ss.length(); i++) {
                    set.add(ss.charAt(i));
                }
                list.add(set);
            }

            int max = 0;
            for (Set<Character> set : list) {
                if(set.size() > max) {
                    max = set.size();
                }
            }
            System.out.println(max);
        }
    }
}
