package 序列化深复制原型模式;

import java.io.Serializable;

public class GoldenCudgel implements Serializable {

    public GoldenCudgel() {

    }

    public GoldenCudgel(boolean disappear) {
        this.disappear = disappear;
    }

    private boolean disappear;

    public boolean isDisappear() {
        return disappear;
    }

    public void setDisappear(boolean disappear) {
        this.disappear = disappear;
    }

    public boolean equals(GoldenCudgel obj) {
        return obj.isDisappear() == disappear;
    }

}