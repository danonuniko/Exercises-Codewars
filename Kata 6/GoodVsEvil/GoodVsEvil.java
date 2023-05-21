/* Kata Level: 6.
 * 
 * Description:
 * Middle Earth is about to go to war. The forces of good will have many battles with the forces of evil. 
 * Different races will certainly be involved. Each race has a certain worth when battling against others. 
 * 
 * On the side of good we have the following races, with their associated worth:
 * Hobbits: 1
 * Men: 2
 * Elves: 3
 * Dwarves: 3
 * Eagles: 4
 * Wizards: 10
 * 
 * On the side of evil we have:
 * Orcs: 1
 * Men: 2
 * Wargs: 2
 * Goblins: 2
 * Uruk Hai: 3
 * Trolls: 5
 * Wizards: 10
 * 
 * Although weather, location, supplies and valor play a part in any battle, if you add up the worth of the side 
 * of good and compare it with the worth of the side of evil, the side with the larger worth will tend to win.
 * 
 * Thus, given the count of each of the races on the side of good, followed by the count of each of the races on the side of evil, determine which side wins.
 * 
 * Input:
 * The function will be given two parameters. Each parameter will be a string of multiple integers separated by a single space. 
 * Each string will contain the count of each race on the side of good and evil.
 * 
 * The first parameter will contain the count of each race on the side of good in the following order:
 * Hobbits, Men, Elves, Dwarves, Eagles, Wizards.
 * 
 * The second parameter will contain the count of each race on the side of evil in the following order:
 * Orcs, Men, Wargs, Goblins, Uruk Hai, Trolls, Wizards.
 * 
 * All values are non-negative integers. The resulting sum of the worth for each side will not exceed the limit of a 32-bit integer.
 * 
 * Output:
 * Return "Battle Result: Good triumphs over Evil" if good wins, "Battle Result: Evil eradicates all trace of Good" if evil wins, 
 * or "Battle Result: No victor on this battle field" if it ends in a tie.
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class GoodVsEvil {

    public static String battle(String goodAmounts, String evilAmounts) {
        String[] goods = goodAmounts.split(" ") , evils = evilAmounts.split(" ");
        int global= 0;

        global += Integer.parseInt(goods[0])*1;    // Hobbits
        global += Integer.parseInt(goods[1])*2;    // Men
        global += Integer.parseInt(goods[2])*3;    // Elves
        global += Integer.parseInt(goods[3])*3;    // Dwarves
        global += Integer.parseInt(goods[4])*4;    // Eagles
        global += Integer.parseInt(goods[5])*10;    // Wizards

        global -= Integer.parseInt(evils[0])*1;    // Orcs
        global -= Integer.parseInt(evils[1])*2;    // Men
        global -= Integer.parseInt(evils[2])*2;    // Wargs
        global -= Integer.parseInt(evils[3])*2;    // Goblins
        global -= Integer.parseInt(evils[4])*3;    // Uruk Hai
        global -= Integer.parseInt(evils[5])*5;    // Trolls
        global -= Integer.parseInt(evils[5])*10;    // Wizards

        return global == 0 ? "Battle Result: No victor on this battle field" : global > 0 ? "Battle Result: Good triumphs over Evil" :  "Battle Result: Evil eradicates all trace of Good";
    }

    // Añado esta solución de la comunidad para invertigar el uso de stream, mapToInt, rangeClosed, map, etc.
    public static String battleCommunity(String goodAmounts, String evilAmounts) {
        int[] goodWorth = new int[]{1, 2, 3, 3, 4, 10};
        int[] evilWorth = new int[]{1, 2, 2, 2, 3, 5, 10};
        int[] good = Arrays.stream(goodAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int[] evil = Arrays.stream(evilAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int goodSum = IntStream.rangeClosed(0,good.length-1).map(i->good[i]*goodWorth[i]).sum();
        int evilSum = IntStream.rangeClosed(0,evil.length-1).map(i->evil[i]*evilWorth[i]).sum();
        return goodSum > evilSum ?  "Battle Result: Good triumphs over Evil" :
                evilSum > goodSum ? "Battle Result: Evil eradicates all trace of Good" :
                                    "Battle Result: No victor on this battle field";
    }
}
