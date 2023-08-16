import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int m = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < n.length(); i++) {
            list.add(n.charAt(i));
        }

        ListIterator<Character> it = list.listIterator();
        while (it.hasNext()) {
            it.next();
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            char c = s.charAt(0);

            switch (c) {
                case 'P':
                    it.add(s.charAt(2));
                    break;
                case 'L':
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;
                case 'D':
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;
                case 'B':
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}
