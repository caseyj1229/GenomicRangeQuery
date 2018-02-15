import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenomicRangeQueryTest {
    @Test
    void solution() {
    String S = "CAGCCTA";
    int[] P = {2,5,0};
    int[] Q = {4,5,6};
    int[] R = {2,4,1};

    assertArrayEquals(R,GenomicRangeQuery.solution(S,P,Q));

    String S2 = "AAAAAAAAAAAAAA";
    int[] P2 = {1,2,3,4,5,6,7};
    int[] Q2 = {2,4,3,7,6,9,8};
    int[] R2 = {1,1,1,1,1,1,1};
    assertArrayEquals(R2,GenomicRangeQuery.solution(S2,P2,Q2));

    String S3 = "T";
    int[] P3 = {0};
    int[] Q3 = {0};
    int[] R3 = {4};
    assertArrayEquals(R3,GenomicRangeQuery.solution(S3,P3,Q3));


    String S4 = "GTCGATCGATCGAT";
    int[] P4 = {13,0,0};
    int[] Q4 = {13,0,13};
    int[] R4 = {4,3,1};
    assertArrayEquals(R4,GenomicRangeQuery.solution(S4,P4,Q4));}
}