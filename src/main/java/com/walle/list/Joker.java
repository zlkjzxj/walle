package com.walle.list;

import java.util.*;

/**
 * 扑克牌游戏，比较两位玩家谁手里的牌大
 * Created by zlkjzxj on 2017/7/12.
 */
public class Joker  {
    public static void main(String[] args) {
        //创建扑克
        System.out.println("开始洗牌");
        String[] types = {"黑","红","梅","方"};
        String[] counts = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        List<String> list = new ArrayList<String>();
        for (int i = 0;i<types.length;i++){
            for (int j = 0; j <counts.length ; j++) {
                list.add(types[i]+" "+counts[j]);
            }
        }
        System.out.println("开始发牌。。。");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入玩家1姓名");
        String player1 = scanner.next();
        System.out.println("请输入玩家2姓名");
        String player2 = scanner.next();

        int size = list.size();
        Random random =new Random();


            int nextCount1 = random.nextInt(size);
            String p1 = list.get(nextCount1);
            list.remove(nextCount1);

            int nextCount2 = random.nextInt(size);
            String p2 = list.get(nextCount2);
            list.remove(nextCount2);

            int nextCount3 = random.nextInt(size);
            String p3 = list.get(nextCount3);
            list.remove(nextCount3);

            int nextCount4 = random.nextInt(size);
            String p4 = list.get(nextCount4);
            List<String > list1 = new ArrayList<String>();
            list1.add(p1);
            list1.add(p3);
            List<String > list2 = new ArrayList<String>();
            list2.add(p2);
            list2.add(p4);
            Collections.sort(list1);
            Collections.sort(list2);
            System.out.println("玩家："+player1+"最大的手牌为"+list1.get(0));
            System.out.println("玩家："+player2+"最大的手牌为"+list2.get(0));
            int b = list1.get(0).compareTo(list2.get(0));
            if(b>0){
                System.out.println("玩家："+player1+"获胜");
            }else if (b<0){
                System.out.println("玩家："+player2+"获胜");
            }
        System.out.println("玩家个字的手牌为：");
        System.out.println(player1+"["+list1.get(0)+","+list1.get(1)+"]");
        System.out.println(player2+"["+list2.get(0)+","+list2.get(1)+"]");

    }
}
