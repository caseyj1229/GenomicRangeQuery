import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {
    public static int[] solution(String S, int[] P, int[] Q){
        //Assume P[k] <= Q[k]
        int[] R = new int[P.length];
        int[][] prefixes = new int[3][S.length()+1];

        int a,c,g;
        for(int i = 0; i < S.length(); i++){
            a = c = g = 0;
            if('A' == (S.charAt(i))){
                a=1;
            }
            if('C' == (S.charAt(i))){
                c = 1;
            }
            if('G' == (S.charAt(i))){
                g = 1;
            }
            prefixes[0][i+1] = prefixes[0][i]+a;
            prefixes[1][i+1] = prefixes[1][i]+c;
            prefixes[2][i+1] = prefixes[2][i]+g;
        }

        for(int i = 0; i < P.length; i++){
            int start = P[i];
            int end = Q[i]+1;

            if (prefixes[0][end] - prefixes[0][start] > 0) {
                R[i] = 1;
            }
            else if (prefixes[1][end] - prefixes[1][start] > 0) {
                R[i] = 2;
            }
            else if (prefixes[2][end] - prefixes[2][start] > 0) {
                R[i] = 3;
            }
            else {
                R[i] = 4;
            }
        }

        return R;
    }
}
