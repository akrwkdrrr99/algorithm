package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class k_2021_lottos {
    public static void main(String[] args ){
        class Solution {
            public int[] solution(int[] lottos, int[] win_nums) {
                int[] answer = new int[2];
                int max = 0;
                int min = 0;

                //방법 1  중복제거 길이판별.
                List<Integer> lottosList = new ArrayList<>();
                for(int number : lottos) {
                    lottosList.add(number);
                }
                Set<Integer> set = new HashSet<>(lottosList);
                if (set.size() != lottosList.size()) {
                    max += lottosList.size() - set.size() + 1;
                }

                // 각각 비교
                for(Integer i: set) {
                    if(i != 0) {
                        for(int j=0; j<win_nums.length; j++) {
                            if(win_nums[j] == i) {
                                min += 1;
                            }
                        }
                    }
                    if(i == 0 && set.size() == 6) {
                        max += 1;
                    }
                }

                max += min;
                //방법 2  0개수 출력 확인.

                //출력
                answer[0] = rank(max);
                answer[1] = rank(min);
                return answer;
            }

            public int rank(int count) {
                switch(count) {
                    case 6:
                        return 1;
                    case 5:
                        return 2;
                    case 4:
                        return 3;
                    case 3:
                        return 4;
                    case 2:
                        return 5;
                    default:
                        return 6;
                }
            }
        }
    }
}
