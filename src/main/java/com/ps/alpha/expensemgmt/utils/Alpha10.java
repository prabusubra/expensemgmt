package com.ps.alpha.expensemgmt.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Alpha10 {
    /*
    player - rank, name
    filter specific sport name && rank below 3
    cf -->
     */
    public static void main(String[] args) {

       /* Player highplayer = Arrays.asList(new Player(4, "AAA"),
                new Player(2, "football"),
                new Player(1, "cricket"),
                new Player(5, "DDD"),
                new Player(6, "EEE"),
                        new Player(null, "EEE"))
                .stream()
                //.filter(player -> (player.getName() == "cricket" && player.getRank()<=3))
                //.sorted(Alpha10::highestRankComparater).collect(Collectors.toList()).get(0);
                .sorted((p1, p2) -> customFunction.supply(p1, p2)
                ).collect(Collectors.toList()).get(0);

        System.out.println(" Player 1 "+highplayer.getName()+ " Rank :"+highplayer.getRank());*/

        Executors.newCachedThreadPool().submit(() -> {
            Player highplayer1 = Arrays.asList(new Player(4, "AAA"),
                            new Player(2, "football"),
                            new Player(1, "cricket"),
                            new Player(5, "DDD"),
                            new Player(6, "EEE"),
                            new Player(null, "EEE"))
                    .stream()
                    //.filter(player -> (player.getName() == "cricket" && player.getRank()<=3))
                    //.sorted(Alpha10::highestRankComparater).collect(Collectors.toList()).get(0);
                    .sorted((p1, p2) -> customFunction.supply(p1, p2)
                    ).collect(Collectors.toList()).get(0);
            System.out.println("Thread : "+Thread.currentThread().getName());
            System.out.println(" Player 1 "+highplayer1.getName()+ " Rank :"+highplayer1.getRank());
        });




    }

    private  static int  highestRankComparater (Player player1, Player player2) {
        if (player2.getRank()!= null && player1.getRank() != null){
            return player2.getRank().compareTo(player1.getRank());
        }
        return 1;
    };

    private static CustomFunction<Player> customFunction = (Player player1, Player player2) -> {
        if (player2.getRank()!= null && player1.getRank() != null){
            return player2.getRank().compareTo(player1.getRank());
        }
        return 1;
    };


}

@Data
@AllArgsConstructor
class Player {
    private Integer rank;
    private String name;

}

@FunctionalInterface
interface CustomFunction<T> {

    public int supply(T t1, T t2);

}




