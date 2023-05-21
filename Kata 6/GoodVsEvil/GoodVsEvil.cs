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

public class Kata
{
    public static string GoodVsEvil(string good, string evil)
    {
        string[] goods = good.Split(), evils = evil.Split();
        int[] goodsForces = new int[] {1, 2, 3, 3, 4, 10};
        int[] evilsForces = new int[] {1, 2, 2, 2, 3, 5, 10};
        int global = 0;
        for(int i = 0 ; i < 6 ; i++)
        {
            global += int.Parse(goods[i])*goodsForces[i];
            global -= int.Parse(evils[i])*evilsForces[i];
        }
        global -= int.Parse(evils[6])*evilsForces[6];
        return global == 0 ? "Battle Result: No victor on this battle field" : global > 0 ? "Battle Result: Good triumphs over Evil" :  "Battle Result: Evil eradicates all trace of Good";
    }

    // Investigar cómo se usa el método Zip.
    public static string GoodVsEvil(string good, string evil)
    {
        var gWorth = new[] { 1, 2, 3, 3, 4, 10 };
        var eWorth = new[] { 1, 2, 2, 2, 3, 5, 10 };
        var g = good.Split(' ').Select(int.Parse).Zip(gWorth, (f, s) => f * s).Sum();
        var b = evil.Split(' ').Select(int.Parse).Zip(eWorth, (f, s) => f * s).Sum();
        return (g > b) ? "Battle Result: Good triumphs over Evil" : ((g == b) ? "Battle Result: No victor on this battle field" : "Battle Result: Evil eradicates all trace of Good");
    }
}