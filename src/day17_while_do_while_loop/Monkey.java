package day17_while_do_while_loop;

import org.w3c.dom.ls.LSOutput;

public class Monkey {
    public static void main(String[] args) {

        /* 5 little monkeys jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                4 little monkeys jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                3 little monkeys jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                2 little monkeys jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                1 little monkey jumping on the bed,
        One fell down and bumped his head,
                Mama called the doctor and the doctor said,
                No more monkeys jumping on the bed!
                Put those monkeys right to bed!

         */
        int num=5;
        while (num>=1){
            System.out.println(num+" "+"little monkeys jumping on the bed, ");
            System.out.println("One fell down and bumped his head, ");
            System.out.println("Mama called the doctor and the doctor said, ");
            System.out.println("No more monkeys jumping on the bed!");
            num--;

        }
        System.out.println("Put those monkeys right to bed!");
    }
}
