package 序列化深复制原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WuKong implements Serializable {

    private GoldenCudgel goldenCudgel;

    public GoldenCudgel getGoldenCudgel() {
        return goldenCudgel;
    }

    public void setGoldenCudgel(GoldenCudgel goldenCudgel) {
        this.goldenCudgel = goldenCudgel;
    }

    public WuKong() {
        goldenCudgel = new GoldenCudgel(false);
    }

    public WuKong deepClone() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (WuKong) ois.readObject();
    }

    public static void main(String[] args) throws Exception {
        WuKong wuKong = new WuKong();
        WuKong wuKongDeepCopy = wuKong.deepClone();
        System.out.println("深复制后悟空是否为同一个对象" + (wuKong == wuKongDeepCopy));
        System.out.println("深复制后金箍棒是否为同一个对象" + (wuKong.getGoldenCudgel() == wuKongDeepCopy.getGoldenCudgel()));
        System.out.println("深复制原对象金箍棒属性为" + wuKong.getGoldenCudgel().isDisappear());
        System.out.println("深复制对象金箍棒属性发生改变...");
        wuKongDeepCopy.getGoldenCudgel().setDisappear(true);
        System.out.println("深复制原对象金箍棒属性为" + wuKong.getGoldenCudgel().isDisappear());
    }

}
