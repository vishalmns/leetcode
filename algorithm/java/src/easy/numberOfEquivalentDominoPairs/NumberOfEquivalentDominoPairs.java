package easy.numberOfEquivalentDominoPairs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class NumberOfEquivalentDominoPairs {
    @SuppressWarnings("unchecked") LinkedList<Integer> [] vertex = new LinkedList[10];

    public NumberOfEquivalentDominoPairs() {
        for (int i = 0; i < 10; i++) {
            vertex[i] = new LinkedList<Integer>();
        }
    }

    public int numEquivDominoPairs(int[][] dominoes) {

        ArrayList<Integer> answerIndex = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < dominoes.length; i++) {
            int sum = dominoes[i][0] + dominoes[i][1];
            LinkedList<Integer> vertex = this.vertex[sum];
            vertex.add(i);
        }

        for (int i = 0; i < 10; i++) {
            LinkedList<Integer> node = this.vertex[i];

            if(node != null) {
            int index = node.removeFirst();
                for (int next : node) {
                    boolean a = dominoes[index][0] == dominoes[next][0] && dominoes[index][1] == dominoes[next][1];
                    boolean b = dominoes[index][0] == dominoes[next][1] && dominoes[index][1] == dominoes[next][0];
                    if (a || b) {
                        ans++;
//                        if (!answerIndex.contains(index)) {
//                            answerIndex.add(index);
//                        }
                    }
                    node.remove(next);
                    break;
                }
            }
        }


        return ans;
    }
}
