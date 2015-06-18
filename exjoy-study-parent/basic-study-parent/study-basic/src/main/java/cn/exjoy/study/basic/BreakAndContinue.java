package cn.exjoy.study.basic;

public class BreakAndContinue {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        label1: for (int o = 0; o < 10; o++) {
            System.out.println("o:" + o);

            label2: for (int i = 0; i < 10; i++) {
                System.out.println("i:" + i);

                if (i == 7)
                    continue label1;
            }
        }

    }

}
