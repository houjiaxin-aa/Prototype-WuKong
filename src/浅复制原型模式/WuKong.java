package 浅复制原型模式;

public class WuKong {
    private static GoldenCudgel goldenCudgel = new GoldenCudgel(false);

    public static void main(String[] args) {
        GoldenCudgel copyGoldenCudgel = goldenCudgel.clone();
        System.out.println(goldenCudgel);
        System.out.println(copyGoldenCudgel);
        System.out.println(goldenCudgel != copyGoldenCudgel);
        System.out.println(goldenCudgel.getClass() == copyGoldenCudgel.getClass());
        System.out.println(goldenCudgel.equals(copyGoldenCudgel));
    }
}
