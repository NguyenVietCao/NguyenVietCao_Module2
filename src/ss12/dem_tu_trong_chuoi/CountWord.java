package ss12.dem_tu_trong_chuoi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra:");
        String string = sc.nextLine();
        Map<Character, Integer> wMap = new TreeMap<>();
        Character key;
        for (int i = 0; i < string.length(); i++) {
            key = string.toLowerCase().charAt(i);
            int count;
            if (wMap.containsKey(key)) {
                count = wMap.get(key);
                wMap.put(key, count + 1);
            } else {
                wMap.put(key, 1);
            }
        }
        System.out.println(wMap);
    }
}
